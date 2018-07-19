/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2d.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Francis
 */
@WebFilter(filterName = "AuthFilter", urlPatterns = {"*.xhtml"})
public class AuthorizationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
    }

    @Override
    public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain chain) throws IOException, ServletException {
    try{
        HttpServletRequest req = (HttpServletRequest) servletrequest;
        HttpServletResponse res = (HttpServletResponse) servletresponse;
        HttpSession ses = req.getSession(false);
        
        String reqURI = req.getRequestURI();
        if (reqURI.contains("/register.xhtml")
            || reqURI.contains("/public/")
            || reqURI.contains("javax.faces.resource")
            || (ses != null && ses.getAttribute("userId") != null)){
            chain.doFilter(req, servletresponse);
        }else{
            res.sendRedirect(req.getContextPath() + "/faces/index.xhtml");
            
        }
        
    }
    catch (IOException | ServletException e){
        System.out.println(e.getMessage());
    }   
    }

    @Override
    public void destroy() {
     
    }
    
    
}
