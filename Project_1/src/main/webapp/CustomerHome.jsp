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
        padding:100Px;
        text-align:center;
        margin:auto;
        display: none;
  
       
    }


    #form a
    {
     background-color: White;
    color: green;
      padding: 10px;  
    text-align: center;
    }
    
    #form{
    
    padding: 20px;
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


<script type="text/javascript">
    function details() {
        
    	var detail=document.getElementsById("bd");

        if(detail.style.display=="none")
        {
            detail.style.display="block";
        }
        else
        {
           detail.style.display="none"; 
        }
    }
    </script> 



</head>
<body>

    <div id="header">
       
       <table style="width: 100%">
           <tr>
               <td>
               <h1>QAC 1.0</h1>
               </td>
               <td>
               <h1 style="text-align: center; color:White; margin-left:110px;  ">CustomerHome</h1>
               </td>
               <td id="button">
               
              
                 <a href="CustomerNewTicket.jsp">Ticket</a>
               
                 <a href="getprofile/${msg}" onclick="details()">Profile</a>                        
                 
                 <a href="Login.jsp">Log out</a>
               
               </td>
                
           </tr>
       
       </table>
       
    </div>
    
    
    
    <div id="bd" >
    
	    <h3 id="log">Login Sucessfull</h3>
	    
	    <h3 style="color:blue" id="hd">welcome</h3>
	        Email Id:-${details.email} ,firstname:-${details.firstname}
    </div>


    <div id="footer">
        <h1>Info</h1>
        <a>qactecbang@gmail.com</a>
        <a>+918160881122</a>
    </div>







</body>
</html>