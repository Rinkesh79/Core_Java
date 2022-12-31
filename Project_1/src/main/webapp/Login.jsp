<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
    *{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    overflow: auto;
    }
    
    
    #header
    {
        padding:20px;
        background-color:green;
        
    }
    
    #button
    {
        padding:5px;
       
        text-align: right;  
    }
    
    #header h1{
    margin-top:5px;
    color: White;
    }
    
    
    #button a
    {
     background-color: White;
    color: green;
    padding: 10px 15px;
    text-align: center;
    }
    
    #bd
    {
        background-color:green;
       padding-teft:50px;
        text-align: left;
        margin:auto;
        display: table;
        
       
    }
    
    
    #form{
    padding: 50px;
    }
   #footer{
    
            position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: green;
  color: white;
  text-align: center;
    
        }
        #footer a{
            color: White;
        }
    
    </style>




</head>
<body>

    <div id="header">
       
       <table style="width: 100%">
           <tr>
               <td>
               <h1>QAC 1.0</h1>
               </td>
               <td>
               <h1 style="text-align: center; color:White; margin-left:200px;  ">Login</h1>
               </td>
               <td id="button">
                <a href="Register.jsp">Sign Up</a>
                <a href="ForgetPassword.jsp">Forgot Password</a>
                 <a href="index.jsp">Home</a>
               </td>
                
           </tr>
       
       </table>
       
    </div>
    
    
    <div id="bd">
    
     <h3 style="color:blue">${msg}</h3>    
    <form id="form" action="login" method="post">
            <table >
                  
               
                  <tr><td><label>Email:-</label></td>
                  <td><input type="text" name="email" pattern="^[a-zA-Z0-9]+(\.[_a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*(\.[a-zA-Z]{2,15})$" title=" Enter valid Email ID"></td></tr>
                  
                  <tr><td><label>Password:-</label></td>
                  <td><input type="password" name="password"></td></tr>
                  <tr><td><label>Profile</label></td>
                  <td><select name="profile">
                    <option value="customer" >Customer</option>
                    <option value="Employe">Employe</option>
                    <option value="admin">Admin</option>
                  </select></td></tr> 
                  
        
       </table>
    
            <div id="button" style="text-align: left ; margin-left: 100px; padding: 20px;">
                <input type="submit" value="Signin" name="signin">
                <input type="submit" value="Reset" name="reset">
    
            </div>
    
    
    </form>
    </div>


    <div id="footer">
        <h1>Info</h1>
        <a>qactecbang@gmail.com</a>
        <a>+918160881122</a>
    </div>


</body>
</html>