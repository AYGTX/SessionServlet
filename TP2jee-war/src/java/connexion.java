/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author starinfo
 */
public class connexion extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        etudiant student = new  etudiant("Aymen","123456","Aymen","Hamadi","143073XX","Groupe3","H");
        
        String login= request.getParameter("login");
        String password= request.getParameter("password");
        
    if(login.equals(student.getLogin())&& password.equals(student.getPassword())){
        
        HttpSession session=request.getSession();
        session.setAttribute("Etudiant",student);
        //etudiant etudiant=(etudiant)session.getAttribute("Etudiant");
        response.sendRedirect("/TP2jee-war/espaceMembre.jsp");        
    }else{
      response.sendRedirect("/TP2jee-war/connexion_error.html");        

    
    
    }
    
     
        }
        
      
    }

 


