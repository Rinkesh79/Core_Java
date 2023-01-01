<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<style type="text/css">
        
        #header{
        background-color:silver;
        padding:20px;
        
        }
        
        h2{
        color : Black;
         margin-top:15px; 
        margin-left: 15px;
        }
        
        table{
        
        width : 100%;
        
        }
        #loginlink{
        float: right;
        margin-top:15px; 
        margin-right: 15px;
        }
        
        
        #form{
        margin-top:15px;
        text-align: center;
        }
        
        </style>

</head>

<body>
<div id="header">
       <table>
           <tr>
               <td>
               <h2>MyApp</h2>
               </td>
               <td>
               <h2>Login</h2>
               </td>
               <td id="loginlink">
               <a href="index.jsp">Signup</a>
               <a href="Forgetpassword.jsp">ForgetPassword</a>
               </td>
           </tr>           
       
       </table>

    
    </div>
    
    
        <h3>${responseMsg}</h3>
       <form id="form"action="login" method="post" >
           <label>Email:-</label>
           <input type="text" name="email"><br>
           
           <label>Password:-</label>
           <input type="password" name="password"><br>
           
           
           <input type="submit" value="submit"> 
       
       </form>
    



</body>
</html>