<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        display: table;
  
       
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
    
    
    
      
    <form id="form" action="getallticket" method="post" >

            
            <a href="CustomerNewTicket.jsp">Create New Ticket</a>
            <a href="GetAllTicket.jsp">Get All Ticket</a><br>
            
           
            <table style="padding-top:25px;">
                  
               
                  <tr><td><label>Email:-</label></td>
                  <td><input type="text" name="email" onblur="display()" ppattern="^[a-zA-Z0-9]+(\.[_a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*(\.[a-zA-Z]{2,15})$" title=" Enter valid Email ID"></td></tr>
                  
                  
        
       </table>
    
            <div id="button" style="text-align: left ; margin-left:65px; padding: 20px;">
                <input type="submit" value="Get Ticket" name="getticket" >
                <input type="submit" value="Reset" name="reset" >
    
            </div>
             
            <div id="data" style=" display: none;">
            Email id:-${msg.email}<br>Model:-${msg.model}<br>Issue:-${msg.issue}<br>
            
           </div>
    
    </form>
    
            
    </div>


    <div id="footer">
        <h1>Info</h1>
        <a>qactecbang@gmail.com</a>
        <a>+918160881122</a>
    </div>


<script type="text/javascript">

function display()
{
    var detail=document.getElementById("data");
    console.log("functionall");
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






</body>
</html>