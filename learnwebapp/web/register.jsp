<%-- 
    Document   : register
    Created on : Feb 10, 2014, 10:02:38 PM
    Author     : Rishitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <html:form action="/register">
            <table>
                <tr>
                    <td>Email:</td>
                    <td><html:text property="email"/></td>
                </tr>
                <tr>
                    <td>Fname:</td>
                    <td><html:text property="fname"/></td>
                </tr>
                <tr>
                    <td>Mname:</td>
                    <td><html:text property="mname"/></td>
                </tr>
                <tr>
                    <td>Lname:</td>
                    <td><html:text property="lname"/></td>
                </tr>
                
            </table>
            
                    <html:hidden property="optype" value="registerMember"/>
            
            <html:submit/>
            
        </html:form>
        
        
        
        
        
        
    </body>
</html>
