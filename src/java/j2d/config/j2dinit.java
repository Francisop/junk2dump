/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.config;

import com.sun.faces.config.FacesInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 *
 * @author USER
 */
public class j2dinit extends FacesInitializer implements WebApplicationInitializer{
    
    @Override
    public void onStartup(ServletContext sc)throws ServletException{
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(j2dconfig.class, Hibconfig.class);
        sc.addListener(new ContextLoaderListener(ctx));
    }
    
}
