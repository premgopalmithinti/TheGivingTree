<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The Giving Tree Admin</title>
</head>
<link rel="preconnect" href="https://fonts.googleapis.com"> 
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin> 
<link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">

<style>
table 
{
	width: 100%;
}
.boldtext
{
	font-weight: 500;
}

body
{
padding-left : 40px;
padding-right : 40px;
}

table
{
	 border-collapse: collapse;
}
td
{
border-top: 1px solid #ddd;
 padding: 15px;
  text-align: left;
 vertical-align: top;
}
tr:hover
{
	background-color : #ececec;
}

ul
{

        display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: space-around;
    flex-wrap: nowrap;
    background-color: #e9e9e9;
    padding-top: 20px;
    padding-bottom: 20px;
    paddin-left : 40px;
    padding-right : 40px;
}
li
{

    text-decoration: none;
    text-anchor: none;
    list-style: none;
  }

a{
text-decoration: none;
color : black
}
</style>

<body style ="font-family: poppins";>
<svg width=100% height="80" viewBox="0 0 1918 80" fill="none" xmlns="http://www.w3.org/2000/svg">
<path d="M1049.45 0.636151C1050.37 1.51021 1050.4 2.95776 1049.52 3.86934L1034.1 19.949V77.3769C1034.1 78.6399 1033.08 79.6637 1031.82 79.6637C1030.55 79.6637 1029.53 78.6399 1029.53 77.3769V36.6921L1019.58 26.3157L985.962 26.3157L974.331 36.8798C973.396 37.7289 971.95 37.6593 971.101 36.7245C970.252 35.7896 970.321 34.3434 971.256 33.4943L979.16 26.3157L929.419 26.3157C928.156 26.3157 927.133 25.2919 927.133 24.029C927.133 22.7661 928.156 21.7423 929.419 21.7423L961.484 21.7423L948.19 9.66789C947.255 8.81879 947.186 7.3726 948.035 6.43772C948.884 5.50284 950.33 5.4333 951.265 6.2824L968.287 21.7423L1020.43 21.7423C1020.82 21.7423 1021.19 21.8403 1021.51 22.013C1021.8 22.1303 1022.08 22.3105 1022.31 22.5532L1029.53 30.084V7.63213C1029.53 6.36922 1030.55 5.34542 1031.82 5.34542C1033.08 5.34542 1034.1 6.36922 1034.1 7.63213V13.3409L1046.22 0.704095C1047.09 -0.207487 1048.54 -0.237907 1049.45 0.636151Z" fill="black"/>
<path d="M872.369 15.0444H867.5V10.8107H881.895V15.0444H877.026V40.4465H872.369V15.0444Z" fill="black"/>
<path d="M884.149 10.8107H888.806V22.8767H893.802V10.8107H898.459V40.4465H893.802V27.1104H888.806V40.4465H884.149V10.8107Z" fill="black"/>
<path d="M901.927 10.8107H914.629V15.0444H906.585V22.8767H912.977V27.1104H906.585V36.2128H914.629V40.4465H901.927V10.8107Z" fill="black"/>
<path d="M875.332 79.058C873.074 79.058 871.353 78.4229 870.167 77.1528C868.982 75.8545 868.389 74.0058 868.389 71.6067V56.0267C868.389 53.6276 868.982 51.793 870.167 50.5229C871.353 49.2246 873.074 48.5754 875.332 48.5754C877.59 48.5754 879.312 49.2246 880.497 50.5229C881.683 51.793 882.276 53.6276 882.276 56.0267V58.5669H877.873V55.7304C877.873 53.7829 877.068 52.8091 875.459 52.8091C873.851 52.8091 873.046 53.7829 873.046 55.7304V71.9454C873.046 73.8647 873.851 74.8243 875.459 74.8243C877.068 74.8243 877.873 73.8647 877.873 71.9454V66.1452H875.544V61.9115H882.276V71.6067C882.276 74.0058 881.683 75.8545 880.497 77.1528C879.312 78.4229 877.59 79.058 875.332 79.058Z" fill="black"/>
<path d="M885.266 48.9988H889.923V78.6346H885.266V48.9988Z" fill="black"/>
<path d="M892.183 48.9988H896.882L899.93 71.9877H900.015L903.063 48.9988H907.339L902.852 78.6346H896.67L892.183 48.9988Z" fill="black"/>
<path d="M909.576 48.9988H914.233V78.6346H909.576V48.9988Z" fill="black"/>
<path d="M917.721 48.9988H923.564L928.094 66.7379H928.178V48.9988H932.327V78.6346H927.543L921.955 57.0005H921.87V78.6346H917.721V48.9988Z" fill="black"/>
<path d="M942.393 79.058C940.135 79.058 938.414 78.4229 937.228 77.1528C936.043 75.8545 935.45 74.0058 935.45 71.6067V56.0267C935.45 53.6276 936.043 51.793 937.228 50.5229C938.414 49.2246 940.135 48.5754 942.393 48.5754C944.651 48.5754 946.373 49.2246 947.558 50.5229C948.744 51.793 949.337 53.6276 949.337 56.0267V58.5669H944.933V55.7304C944.933 53.7829 944.129 52.8091 942.52 52.8091C940.911 52.8091 940.107 53.7829 940.107 55.7304V71.9454C940.107 73.8647 940.911 74.8243 942.52 74.8243C944.129 74.8243 944.933 73.8647 944.933 71.9454V66.1452H942.605V61.9115H949.337V71.6067C949.337 74.0058 948.744 75.8545 947.558 77.1528C946.373 78.4229 944.651 79.058 942.393 79.058Z" fill="black"/>
<path d="M962.748 53.2325H957.879V48.9988H972.274V53.2325H967.405V78.6346H962.748V53.2325Z" fill="black"/>
<path fill-rule="evenodd" clip-rule="evenodd" d="M974.529 48.9988H981.43C983.829 48.9988 985.579 49.5633 986.679 50.6923C987.78 51.793 988.33 53.5006 988.33 55.815V57.6355C988.33 60.712 987.314 62.6595 985.282 63.478V63.5627C986.411 63.9014 987.201 64.5929 987.653 65.6372C988.133 66.6815 988.373 68.0786 988.373 69.8285V75.036C988.373 75.8827 988.401 76.5742 988.457 77.1105C988.514 77.6185 988.655 78.1266 988.881 78.6346H984.139C983.97 78.1548 983.857 77.7032 983.8 77.2798C983.744 76.8565 983.716 76.0944 983.716 74.9936V69.5745C983.716 68.2197 983.49 67.2742 983.038 66.7379C982.615 66.2017 981.867 65.9335 980.794 65.9335H979.186V78.6346H974.529V48.9988ZM980.879 61.6999C981.811 61.6999 982.502 61.4599 982.954 60.9801C983.433 60.5003 983.673 59.6959 983.673 58.5669V56.2807C983.673 55.2082 983.476 54.432 983.081 53.9522C982.714 53.4724 982.121 53.2325 981.303 53.2325H979.186V61.6999H980.879Z" fill="black"/>
<path d="M991.604 48.9988H1004.31V53.2325H996.261V61.0648H1002.65V65.2985H996.261V74.4009H1004.31V78.6346H991.604V48.9988Z" fill="black"/>
<path d="M1006.98 48.9988H1019.69V53.2325H1011.64V61.0648H1018.03V65.2985H1011.64V74.4009H1019.69V78.6346H1006.98V48.9988Z" fill="black"/>
<path d="M0 40L768 39.9999" stroke="#8C8C8C"/>
<path d="M1150 40H1918" stroke="#8C8C8C"/>
</svg>


<ul>
		<li><a href="/adminhome">all donations</a></li>
	<li><a href="/AcceptedDonationsAdmin">Accepted</a></li>
	<li><a href="/DeclinedDonationsAdmin">Declined</a></li>
	<li><a href="/OnProgressAdmin">On Progress</a></li>
	<li><a href="/CompletedAdmin">Completed</a></li>
	<li><a href="/VolunteerList">Volunteers</a></li>
	<li><a href="/logoutadmin">Logout</a></li>
</ul>

<table  >

<c:forEach items ="${donlist}" var ="don">

<tr border= 1>
	<td>
		<p class="boldtext">Donar Name : </p> <c:out value ="${don.fullname}"></c:out>
		<br>
		<p class="boldtext">Phone number : </p> <c:out value ="${don.phoneNumber}"></c:out>
		<br>
		<p class="boldtext">PickUp Location :</p>
		
		<c:out value ="${don.address}"></c:out>,
		<br>
		<c:out value ="${don.city}"></c:out>,
		<br>
		<c:out value ="${don.state}"></c:out>
	</td>
	
	<td>
		<p class="boldtext">Food Items : </p>
		<br>
		<c:out value ="${don.foodDetails}"></c:out>
	</td>
	<td>
		<p class="boldtext">Status : </p>
		<br>
		<c:out value ="${don.status}"></c:out>
	</td>
	
	<td>
		<p class="boldtext">Update Status</p>
		<br>
		<form action="updateStatus" method="post" modelAttribute="donn">
			<input name = "id" type ="hidden" value ="${don.id}">
			<input name = "fullname" type ="hidden" value ="${don.fullname}">
			<input name = "gender" type ="hidden" value ="${don.gender}">
			<input name = "foodDetails" type ="hidden" value ="${don.foodDetails}">
			<input name = "phoneNumber" type ="hidden" value ="${don.phoneNumber}">
			<input name = "mail" type ="hidden" value ="${don.mail}">
			<input name = "address" type ="hidden" value ="${don.address}">
			<input name = "city" type ="hidden" value ="${don.city}">
			<input name = "state" type ="hidden" value ="${don.state}">
			 <select name ="status">
	            <option value="${don.status}">${don.status}</option>
	            <option value="Accepted">Accepted</option>
	            <option value="Denied">Denied</option>
	            <option value="On Progress">On Progress</option>
	            
	        </select>
	        <button class ="formsubmitbutton" type="submit">Update</button>
        </form>
	</td>
	
	
</tr>


</c:forEach>


</table>
</body>
</html>