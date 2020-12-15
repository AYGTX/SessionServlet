<%-- 
    Document   : espaceMembre
    Created on : 9 nov. 2020, 17:35:07
    Author     : starinfo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        

        <h1> Hey ${Etudiant.nom} ${Etudiant.prenom}</h1>
        <h4> Welcome back,you're logged in as ${Etudiant.login} </h4>
 <p>
 Login Informations: <br />
 <b>Nom :</b> ${Etudiant.nom} <br />
 <b>Prénom :</b> ${Etudiant.prenom}<br />
 <b>CIN : </b>${Etudiant.cin} <br />
 <b>Groupe :</b> ${Etudiant.groupe} <br />
 <b>Genre : </b>${Etudiant.genre} <br />
 <b>Login : </b>${Etudiant.login} <br />
 <b>Mot de passe :</b> ${Etudiant.password}<br />   
 </p>
    </body>
</html>
