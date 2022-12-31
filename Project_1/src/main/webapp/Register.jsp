<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    
    <link rel="icon" href="C:\Users\Rinkesh\Downloads\download.png">
    <meta name='viewport' content='width=device-width, initial-scale=1'>

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
    
    
    
     <script type="text/javascript">
    
    function boxchnage() {
        
        var check =  document.getElementById("ckbox1") ;
       
        var butt =  document.getElementById("btsubmit") ;
       
        if (check.checked == true)
        {
            butt.removeAttribute("disabled");
            
        } 
        else{
            butt.disabled=true;
           
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
               <h1 style="text-align: center; color:White; margin-right: 90px; ">Registeration</h1>
               </td>
               <td id="button">
                <a href="Login.jsp">Sign In</a>
                 <a href="index.jsp">Home</a>
               </td>
                
           </tr>
       
       </table>
       
    </div>
    
    
    <div id="bd">
    
      
    <form id="form" action="signup" method="post">
          <h3 style="color:blue;">${msg}</h3>
            <table >
                  
	             <tr><td><label>First Name:-</label></td>
	              <td><input type="text" name="firstname" pattern="[A-Za-z]{3-10}"  title=" Alphabet Only (at least three Alphabet)"></td></tr>
               
	               <tr><td><label>Sure Name:-</label></td>
	               <td><input type="text" name="surename"pattern="[A-Za-z]{3-10}"  title=" Alphabet Only (at least three Alphabet)"></td></tr>
               
	              <tr><td><label>Email:-</label></td>
	              <td><input type="text" name="email"  pattern="^[a-zA-Z0-9]+(\.[_a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*(\.[a-zA-Z]{2,15})$" title=" Enter valid Email ID"></td></tr>
                  
                  <tr><td><label>Password:-</label></td>
                  <td><input type="password" name="password" pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,20}$" title=" Enter valid password note:-min 8 letter password, with at least a symbol, upper and lower case letters and a number "></td></tr>
                  
                  <tr><td><label>Confirm Password:-</label></td>
                  <td><input type="password" name="cnfpassword"></td></tr>
                  
                  <tr><td><label>Date Of Birth:-</label></td>
                  <td><input type="date" name="dob"></td></tr>
                  
                  <tr><td><label>Contact:-</label></td>
                  <td><input type="tel" name="contact" pattern="[0-9]{10}" title=" Enter valid 10 digit Number"></td></tr>
                  
                  <tr><td><label>City:-</label></td>
                  <td><input type="text" name="City" pattern="[A-Za-z]{3-10}"  title=" Alphabet Only (at least three Alphabet)"></td></tr>
                  
                  <tr><td><label>State:-</label></td>
                  <td><input type="text" name="state" pattern="[A-Za-z]{3-10}"  title=" Alphabet Only (at least three Alphabet)"></td></tr>
                  
                  <tr><td><label>Country:-</label></td>
                  <td><input type="text" name="country" pattern="[A-Za-z]{3-10}"  title=" Alphabet Only (at least three Alphabet)"></td></tr>
                  
                  <tr><td><label>Zip/Pincode</label></td>
                  <td><input type="text" name="pincod" pattern="[0-9]{6}" title=" Enter valid 6 digit code"></td></tr>
                  
                   <tr><td><label>Profile</label></td>
                  <td><select name="profile">
                    <option value="customer" >Customer</option>
                    <option value="Employe">Employe</option>
                    <option value="admin">Admin</option>
                  </select></td></tr> 
                  
                  <tr><td style="padding-left:110px;"><input type="checkbox" id="ckbox1" onclick="boxchnage()" ></td>
                  <td><label>Tearms and Condition</label></td></tr>
        
                  
       </table>
    
            <div id="button" style="text-align: left ; margin-left: 100px; padding: 20px;">
                <input type="submit" value="SignUp" name="signup" id="btsubmit"  disabled>
                <input type="submit" value="Reset" name="reset" id="btreset" >
    
            </div>
    
    
    </form>
    </div>


    <div id="footer">
        <h1>Info</h1>
        <a>qactecbang@gmail.com</a>
        <a>+918160881122</a>
    </div>


<script type="text/javascript">
function emailvalidation()
{

    var email=document.getElementsByName("email")[0].value;
    var formate = "^[a-zA-Z0-9]+(\.[_a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*(\.[a-zA-Z]{2,15})$";
    if(!email.match(formate))
    	{
    alert ("Enter valid Email Id");
    document.getElementsByName("email")[0].value="";
    	}
}


</script>

</body>
</html>