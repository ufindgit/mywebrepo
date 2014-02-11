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
        <script src="jquery-1.8.0.min.js">
        </script>
        <script>
            $(document).ready(function(){
               
                $('#email').blur(function(){
                   var email=$("#email").val();
                   
                   $.get("./register.do?optype=checkEmail&email="+email+"",function(data,status){
                        
                        if(data == "existing"){
                            alert("This email is already registerd.");
                            $("#email").focus();
                            
                        }
                   });
                    
                });
        
        
                $('#submit').click(function(){
                   var email =$("#email").val();
                   var pwd = $("#password").val();
                   var fname = $("#fname").val();
       
                    if(email == null || email == ''){
                        alert("Please enter email ");
                        $("#email").focus();
                        return false;

                    }else if(pwd == null || pwd ==''){
                        alert("please enter password ");
                        $("#password").focus();
                        return false;
                    }else if(fname == null || fname==''){
                        alert("please enter fname ");
                        $("#fname").focus();
                        return false;
                        
                    }
                    })
                });
</script>
    </head>
    <body>
        
        
        <html:form action="/register" >
            <table>
                <tr>
                    <td>Email:</td>
                    <td><html:text styleId="email" property="email"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><html:password styleId="password" property="password"/></td>
                </tr>
                <tr>
                    <td>Fname:</td>
                    <td><html:text styleId="fname" property="fname"/></td>
                </tr>
                <tr>
                    <td>Mname:</td>
                    <td><html:text styleId="mname" property="mname"/></td>
                </tr>
                <tr>
                    <td>Lname:</td>
                    <td><html:text styleId="lname" property="lname"/></td>
                </tr>
                
            </table>
            
                    <html:hidden property="optype" value="registerMember"/>
            
                    <html:submit styleId="submit"/>
            
        </html:form>
        
        
        
        
        
        
    </body>
</html>
