<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page import="java.util.List" %>
 <%@page isELIgnored="false" %>
<!DOCTYPE html>



<html>
<head>
<meta charset="ISO-8859-1">
<title>GetAllTicket</title>
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
               
               <td id="button">
                                                  
		            <a href="Login.jsp">Log Out</a>
		            <a href="index.jsp">Home</a><br>               
                                         
               </td>
                
           </tr>
       
       	</table>
       
    </div>
    
 
    <div id="bd">
   
      <form id="form" action="getallopenticket" method="post" >  
      
      			<label>Statuse</label>
      			<select name="statuse">
                    <option value="open" >OPEN</option>
                    <option value="close">CLOSE</option>
                   
                </select>
    
            	<div id="button" style="text-align: left ; margin-left:65px; padding: 20px;">
            	
                <input type="submit" value="Get Data" name="getticket" >
               
            	</div>            
          
      </form>
                
    </div>
	




<c:foreach>


</c:foreach>






















    <div id="footer">
    
        <h1>Info</h1>
        <a>qactecbang@gmail.com</a>
        <a>+918160881122</a>
        
    </div>


</body>
</html>