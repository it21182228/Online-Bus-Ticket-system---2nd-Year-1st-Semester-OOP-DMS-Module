<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>


<style type="text/css">

  
    #hero{
    background-image: url('images/home01.jpg');
    background-size: cover;
    background-repeat: no-repeat;
    background-position: center;
    width: 100%;
    height: 65vh;
    
}

.hpara{
    background-color: rgb(223, 228, 227);
    padding: 20px;
}

.hpara p{
    width: 80%;
    margin: auto;
    text-align: center;
    line-height: 1.6em;
}

.discription
{
    display: flex;
    align-items: center;
    margin: 20px 0;
}

.discription img{
    width: 300px;
    margin: 20px;
}
.discription p{
    line-height: 1.6em;
    margin: 10px;

*{
    padding: 0;
    margin: 0;
    font-family: Arial, Helvetica, sans-serif;
    box-sizing: border-box;
    /* border: 1px solid red; */
}

/* header */
#header{
    background: linear-gradient(45deg, black, teal);
}
header{
    display: flex;
    justify-content: space-between;
    align-items: center;
}

header #logo{
    display: flex;
    align-items: center;
}

header #logo img{
    width: 60px;
    display: block;
}

header #logo h1{
    margin-left: 10px;
    color: rgb(6, 193, 203);
}
header #logo h1 span{
    margin-left: 10px;
    font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
}

header ul{
    display: flex;
    list-style: none;
    margin: 10px;
    background-color: rgb(11, 101, 101);
    border-radius: 10px;
}

header ul a{
    display: inline-block;
    text-decoration: none;
    font-size: 12px;
    color: rgb(201, 201, 201);
    padding: 10px;
}

header ul a:hover{
    background-color: rgb(11, 68, 68);
    border-radius: 10px;
}

header ul li:first-child{
    border-right: 1px slategray solid;
    border-width: 50%;
}

/* Navigation Bar */

nav{
    display: flex;
    justify-content: space-between;
    align-items: center;
}

nav ul{
    display: flex;
    list-style: none;
}

nav ul a{
    display: inline-block;
    text-decoration: none;
    color: rgb(201, 201, 201);
    padding: 15px;
}

nav ul a:hover{
    background-color: teal;
}



</style>

<meta charset="ISO-8859-1">
<title>Online Bus Ticket Reservation</title>

</head>

<body>
          <div id="header">
            <header>
                <div>
                    <h1>online bus ticket<span> reservations</span></h1>
                </div>
                <ul>
                    <li><a href="../User Profile/register.php">Sign Up</a></li>
                    <li><a href="login.html">Login</a></li>
                </ul>
            </header>
            <nav>
                <div>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="../Gallary/Galary.html">Gallery</a></li>
                    </ul>
                </div>
                <div>
                    <ul>
                        <li><a href="about us.html">About Us</a></li>
                        <li><a href="../Contact us/index.html">Contact Us</a></li>
                    </ul>
                </div>
            </nav>
        </div>    
  <h1>Users Inquiries Details </h1>
  
	<form action="log" method= "post">
	User Id <input type="text" name= "uid"><br>
	User Name <input type="text" name= "uname"><br>
	
	 
	    <input type="submit" name="submit" value="View details">
	 
	 
	 
	 
	 </form>



</body>
</html>