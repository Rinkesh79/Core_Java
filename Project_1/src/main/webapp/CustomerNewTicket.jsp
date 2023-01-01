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
    
    #header h1
    {
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
        padding:100Px;
        text-align:center;
        margin:auto;
        display: table;
 
    }


    #form a
    {
     	background-color: White;
    	color: green;
  		padding: 10px;
    	text-align: center;
    }
    
    #form
    {
       	padding: 20px;
    }

    
   #footer
   {
          position: fixed;
          left: 0;
          bottom: 0;
          width: 100%;
          background-color: green;
          color: white;
          text-align: center;
    
   }
   
   #footer a
   {
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
               <h1 style="text-align: center; color:White; margin-left:100px;  ">Ticket</h1>
               </td>
               <td id="button">
               
                    <a href="index.jsp">Home</a>
                
                 
                <a href="Login.jsp">Log out</a>
               
               </td>
                
           </tr>
       
       </table>
       
    </div>
    
    
    
    <div id="bd">
 
    <h3 style="color:blue">${msg}</h3>
    
    <form id="form" action="customernewticket" method="post">

            
            <a href="CustomerNewTicket.jsp">Create New Ticket</a>
            <a href="GetAllTicket.jsp">Get All Ticket</a><br>
            
           
            <table style="padding-top:25px;">
                  
               
                  <tr><td><label>Email:-</label></td>
                  <td><input type="text" name="email" pattern="^[a-zA-Z0-9]+(\.[_a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*(\.[a-zA-Z]{2,15})$" title=" Enter valid Email ID"></td></tr>
                  <tr><td><label>Model:-</label></td>
                  <td><input type="text" name="model"></td></tr>
                  <tr><td><label>Issue:-</label></td>
                   <td><input type="text" name="issue"></td></tr>
                  
        
       		</table>
    
            <div id="button" style="text-align: left ; margin-left:65px; padding: 20px;">
                <input type="submit" value="Creat Ticket" name="creatticket">
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