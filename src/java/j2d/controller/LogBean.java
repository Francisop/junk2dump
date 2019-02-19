/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.controller;

import j2d.model.Members;
import j2d.service.MemberService;
import j2d.util.SessionUtils;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author francis
 */
@Named
@ManagedBean
@SessionScoped
public class LogBean implements Serializable {
    
    @Autowired
    private MemberService memberService;
    
   private String fullName;
   private String password;
   private String email;
   private String phone ;
   
   
   
   public String saveMember(){
    Members member = new Members(fullName,password, email, phone); 
    memberService.saveMember(member);
    return "index";
    } 
  
   
    public String login(){
        Members mem = memberService.login(email, password);
        if (mem != null) {
            HttpSession session = SessionUtils.getSession();
            session.setAttribute("userId", mem.getId());
            setLogBean(mem);
            return "mem";
        }else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "invalid login", "please enter correct Email and password"));
        return "";
        }
        
        
    }
    
    public String logout(){
        HttpSession session = SessionUtils.getSession();
        session.invalidate();
        
        return "index";
    }
    public String updateMember(){
        int userId = Integer.valueOf(SessionUtils.getUserId());
        Members mem = new Members(fullName, password, email,phone);
        mem.setId(userId);
        memberService.updateMember(mem);
        
        return "index";
    }
    
    private void setLogBean(Members mem){
        setFullName(mem.getFullName());
        setPassword(mem.getPassword());
        setEmail(mem.getEmail());
        setPhone(mem.getPhone());
        
        
        }
    
   
    
    
           public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }
    
    
    
          public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
              public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
           public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  

    }

