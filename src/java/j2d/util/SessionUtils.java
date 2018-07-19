/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.util;
 
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Francis
 */
public class SessionUtils {
    public static HttpSession getSession() {
       return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }
   
    public static HttpServletRequest getRequest(){
        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        
    }
    
    public static String getUsername(){
        HttpSession hs = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return  hs.getAttribute("username").toString();
    }
    
    public static String getUserId(){
        HttpSession hs = getSession();
        if(hs != null) {
            return String.valueOf(hs.getAttribute("userId"));
        }
        
        return null;
    }
    
}
