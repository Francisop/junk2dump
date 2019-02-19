/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.controller;

import j2d.model.Newsletter;
import j2d.service.NletterService;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author USER
 */
@Named
@ManagedBean
@RequestScoped
public class NletterBean implements Serializable{
    
    @Autowired
    private NletterService nletterService;
    
    private String Email;
    
    
       public String saveNletter(){
    Newsletter nletter = new Newsletter(Email); 
    nletterService.saveNletter(nletter);
    return nletter.getEmail();
    } 
       
       private void setNletterBean(Newsletter nletter){
           setEmail(nletter.getEmail());
           
       }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
       
    
}
