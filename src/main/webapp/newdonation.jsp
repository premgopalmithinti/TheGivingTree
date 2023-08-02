<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>

<link rel="preconnect" href="https://fonts.googleapis.com"> 
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin> 
<link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
<head>
<meta charset="UTF-8">
<title>Donate Now</title>
</head>
<style>

.navbar
{

    display: flex;
    flex-direction: row;
    justify-content: space-between;
        margin-bottom: 50px;



}
.navlist
{
    display: flex;
    flex-direction: row;
    align-items: center;
    
  }
  
  a{
  		color : black ;
      margin-left: 30px;
      text-decoration: none;
  }
  
  li
  {
  list-style: none;
  }
  body
  {
    padding-left: 30px;
    padding-right: 30px;
    font-family: poppins;
  }
  
  .decoratorinform
  {
  width: 247px;
	border: 0.4px solid #C0C0C0;
  
  }
  input 
  {
  


width: 40%;
height: 40px;

background: #FAFAFA;
border: 1px solid #B0B0B0;

/* Inside auto layout */

flex: none;
order: 1;
align-self: stretch;
flex-grow: 0;
    padding-left: 20px;

  }
  
  .lable
  {
  font-weight : 500;
  }
  
  p{
  width: 60%;}
  
  .formsubmitbutton
  {
  	    height: 40px;
    width: 20%;
    margin-top: 40px;
    background: #004323;
    border-radius: 5px;
    color: white;
    font-weight: 500;
	
  }
  select 
  {
      width: 10%;
    height: 40px;
    background: #fafafa;
    padding-left: 10px;
    padding-right: 10px;
   }
  
</style>
<body>
	
	
	<div class = "navbar">
		<svg class= "navbarlogo" width="120" height="53" viewBox="0 0 120 53" fill="none" xmlns="http://www.w3.org/2000/svg">
<path d="M119.537 0.41793C120.136 0.992157 120.156 1.94315 119.582 2.54203L109.453 13.1058V50.834C109.453 51.6637 108.781 52.3363 107.951 52.3363C107.121 52.3363 106.449 51.6637 106.449 50.834V24.1055L99.9123 17.2886H77.8258L70.1845 24.2288C69.5703 24.7866 68.6202 24.7409 68.0624 24.1267C67.5045 23.5126 67.5502 22.5625 68.1644 22.0046L73.3569 17.2886L40.6789 17.2886C39.8492 17.2886 39.1766 16.616 39.1766 15.7863C39.1766 14.9566 39.8492 14.284 40.6789 14.284L61.7446 14.284L53.0107 6.35148C52.3965 5.79365 52.3508 4.84355 52.9086 4.22937C53.4665 3.61518 54.4166 3.5695 55.0308 4.12733L66.2135 14.284L100.47 14.284C100.727 14.284 100.968 14.3483 101.18 14.4618C101.372 14.5389 101.552 14.6573 101.705 14.8167L106.449 19.7642V5.01406C106.449 4.18436 107.121 3.51176 107.951 3.51176C108.781 3.51176 109.453 4.18436 109.453 5.01406V8.76451L117.413 0.462567C117.988 -0.136312 118.939 -0.156297 119.537 0.41793Z" fill="black"/>
<path d="M3.1986 9.88363H0V7.10224H9.45673V9.88363H6.25813V26.572H3.1986V9.88363Z" fill="black"/>
<path d="M10.938 7.10224H13.9976V15.0292H17.2796V7.10224H20.3391V26.572H17.2796V17.8106H13.9976V26.572H10.938V7.10224Z" fill="black"/>
<path d="M22.6177 7.10224H30.9619V9.88363H25.6772V15.0292H29.8771V17.8106H25.6772V23.7906H30.9619V26.572H22.6177V7.10224Z" fill="black"/>
<path d="M5.14557 51.9384C3.66216 51.9384 2.53107 51.5212 1.75228 50.6868C0.973487 49.8338 0.584092 48.6193 0.584092 47.0432V36.8077C0.584092 35.2315 0.973487 34.0263 1.75228 33.1919C2.53107 32.3389 3.66216 31.9124 5.14557 31.9124C6.62898 31.9124 7.76008 32.3389 8.53887 33.1919C9.31766 34.0263 9.70705 35.2315 9.70705 36.8077V38.4765H6.81441V36.613C6.81441 35.3335 6.28594 34.6938 5.22901 34.6938C4.17209 34.6938 3.64362 35.3335 3.64362 36.613V47.2657C3.64362 48.5266 4.17209 49.157 5.22901 49.157C6.28594 49.157 6.81441 48.5266 6.81441 47.2657V43.4552H5.28464V40.6738H9.70705V47.0432C9.70705 48.6193 9.31766 49.8338 8.53887 50.6868C7.76008 51.5212 6.62898 51.9384 5.14557 51.9384Z" fill="black"/>
<path d="M11.6714 32.1906H14.7309V51.6603H11.6714V32.1906Z" fill="black"/>
<path d="M16.2157 32.1906H19.3031L21.3057 47.2935H21.3613L23.3639 32.1906H26.1731L23.2248 51.6603H19.164L16.2157 32.1906Z" fill="black"/>
<path d="M27.6427 32.1906H30.7022V51.6603H27.6427V32.1906Z" fill="black"/>
<path d="M32.9936 32.1906H36.8319L39.808 43.8446H39.8636V32.1906H42.5894V51.6603H39.4464L35.775 37.4474H35.7194V51.6603H32.9936V32.1906Z" fill="black"/>
<path d="M49.2024 51.9384C47.719 51.9384 46.5879 51.5212 45.8091 50.6868C45.0303 49.8338 44.6409 48.6193 44.6409 47.0432V36.8077C44.6409 35.2315 45.0303 34.0263 45.8091 33.1919C46.5879 32.3389 47.719 31.9124 49.2024 31.9124C50.6858 31.9124 51.8169 32.3389 52.5957 33.1919C53.3745 34.0263 53.7638 35.2315 53.7638 36.8077V38.4765H50.8712V36.613C50.8712 35.3335 50.3427 34.6938 49.2858 34.6938C48.2289 34.6938 47.7004 35.3335 47.7004 36.613V47.2657C47.7004 48.5266 48.2289 49.157 49.2858 49.157C50.3427 49.157 50.8712 48.5266 50.8712 47.2657V43.4552H49.3414V40.6738H53.7638V47.0432C53.7638 48.6193 53.3745 49.8338 52.5957 50.6868C51.8169 51.5212 50.6858 51.9384 49.2024 51.9384Z" fill="black"/>
<path d="M62.5748 34.9719H59.3762V32.1906H68.8329V34.9719H65.6343V51.6603H62.5748V34.9719Z" fill="black"/>
<path fill-rule="evenodd" clip-rule="evenodd" d="M70.3142 32.1906H74.8479C76.424 32.1906 77.5736 32.5614 78.2968 33.3031C79.02 34.0263 79.3815 35.1481 79.3815 36.6686V37.8646C79.3815 39.8857 78.714 41.1652 77.3789 41.7029V41.7585C78.1206 41.9811 78.6398 42.4353 78.9365 43.1214C79.2517 43.8075 79.4094 44.7254 79.4094 45.875V49.2961C79.4094 49.8524 79.4279 50.3067 79.465 50.659C79.5021 50.9928 79.5948 51.3265 79.7431 51.6603H76.628C76.5167 51.3451 76.4425 51.0484 76.4055 50.7703C76.3684 50.4921 76.3498 49.9915 76.3498 49.2683V45.7081C76.3498 44.8181 76.2015 44.1969 75.9048 43.8446C75.6267 43.4923 75.1353 43.3161 74.4307 43.3161H73.3737V51.6603H70.3142V32.1906ZM74.4863 40.5347C75.0982 40.5347 75.5525 40.3771 75.8492 40.0619C76.1644 39.7467 76.322 39.2182 76.322 38.4765V36.9745C76.322 36.2699 76.1922 35.76 75.9326 35.4448C75.6916 35.1296 75.3022 34.9719 74.7644 34.9719H73.3737V40.5347H74.4863Z" fill="black"/>
<path d="M81.5321 32.1906H89.8763V34.9719H84.5917V40.1175H88.7916V42.8989H84.5917V48.8789H89.8763V51.6603H81.5321V32.1906Z" fill="black"/>
<path d="M91.6364 32.1906H99.9806V34.9719H94.6959V40.1175H98.8958V42.8989H94.6959V48.8789H99.9806V51.6603H91.6364V32.1906Z" fill="black"/>
</svg> 
		
		<ul class= "navlist">
			<li><a class = "active" href= "/">About Us</a></li>
			<li><a class = "active" href= "/">Activities</a></li>
			<li><a class = "active" href= "/newdonation">Donate Now</a></li>
			
		</ul>
	</div>
	
	
	<h1>Donate Now</h1>
	<div class = "decoratorinform"></div>
	<form action="adddonation" method="post" modelAttribute="don">
    
    <div class="decoratorinform"></div>
    <h3>Personal Details</h3>
    <p class="lable">Full Name</p>
    <input name="fullname" required ="required"/>
   

    <div class="genderandage">
        <p class="lable">Gender</p>
        <select name ="gender" required="required">
            <option value="none" selected>Gender</option>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">other</option>
        </select>
        
    </div>
    <h3>Food Details</h3>
    <p>please mention the details of the food like what items available, quantity and quality</p>
    <input name="foodDetails" required="required"></input>

    <h3>Contact & Address</h3>
    <p>please provide a phone number and address of pickup location, so our team will contact you and pickup the food once the donation is confirmed</p>
    <p class="lable">Phone Number</p>
    <input name ="phoneNumber" required="required"></input>
     <p class="lable">Email Id</p>
    <input name ="mail" required="required"></input>
    <p class="lable">Address</p>
    <input name ="address" required="required"></input>
    <p class="lable">City</p>
    <input name= "city" required="required"></input>
    <p class="lable">State</p>
    <input name = "state" required="required"></input>
    <br>
    <input class ="formsubmitbutton" type="submit" value="Submit" class ="button">
</form>
</body>
</html>