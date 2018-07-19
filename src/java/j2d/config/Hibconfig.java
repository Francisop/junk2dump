/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.config;
import java.util.Properties;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import  static org.hibernate.cfg.AvailableSettings.DIALECT;
import static org.hibernate.cfg.AvailableSettings.HBM2DDL_AUTO;
import static org.hibernate.cfg.AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS;
import static org.hibernate.cfg.AvailableSettings.SHOW_SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Francis
 */

@Configuration
@PropertySource("classpath:db.propertties")
@EnableTransactionManagement
public class Hibconfig {
    
    @Autowired
    private Environment env;
    
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
    dataSource.setDriverClassName(env.getProperty("database.driver"));
    dataSource.setUrl(env.getProperty("database.url"));
    dataSource.setUsername(env.getProperty("database.user"));
    dataSource.setPassword(env.getProperty("database.password"));
    
    return dataSource;
    }
    
    
    
    @Bean
    public SessionFactory getSessionFactory(){
        LocalSessionFactoryBuilder sessionbuilder = new LocalSessionFactoryBuilder(getDataSource());
     sessionbuilder.scanPackages("j2d.model");
     
     Properties prop = new Properties();
      
     prop.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
     prop.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl_auto"));
     prop.put(CURRENT_SESSION_CONTEXT_CLASS, env.getProperty("hibernate.current_session_context_class"));
     prop.put(DIALECT, env.getProperty("hibernate.dialect"));
     
     sessionbuilder.addProperties(prop);
     
     return sessionbuilder.buildSessionFactory();
    }
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionfactory) {
     HibernateTransactionManager txManager = new HibernateTransactionManager(sessionfactory);
     return txManager;
    
    }
    
}
