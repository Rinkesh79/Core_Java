<html>

    <head>
        
        <style type="text/css">
        
        #header{
        background-color:gray;
        padding:20px;
        
        }
        
        h2{
        color : white;
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
               <h2>Signup</h2>
               </td>
	           <td id="loginlink">
	           <a href="Login.jsp">Login</a>
	           </td>
           </tr> 	       
	   
	   </table>

	
	</div>
	
	
	
	   <form id="form" action="signup" method="post" >
	       <label>Email:-</label>
	       <input type="text" name="email"><br>
	       
	       <label>Password:-</label>
           <input type="password" name="password"><br>
           
           <label>Confirm Password:-</label>
           <input type="password" name="cnfpassword"><br>
           
           <label>Contact Number</label>
           <input type="tel" name="number"><br>
	        
           <input type="submit" value="submit"> 
       
       </form>
    
	</body>
</html>
