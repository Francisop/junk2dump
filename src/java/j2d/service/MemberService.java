/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.service;
import j2d.model.Members;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Francis
 */
@Service
@Transactional
public class MemberService {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    
    public Members login(String email, String password){
      final Session session = sessionFactory.getCurrentSession();
      final Members members = (Members)session.createQuery("from Members m " 
              + "WHERE m.email = :email " 
              + "AND m.password = :password")
              .setParameter("email",email)
              .setParameter("password",password)
              .uniqueResult();
        
        
        return members;
    }
    
    
    public void saveMember(Members member){
        final Session session = sessionFactory.getCurrentSession();
        session.save(member);
        
    }
    
    public void updateMember(Members member){
        final Session session = sessionFactory.getCurrentSession();
        session.update(member);
    }
    
}
