<?php


$host = "localhost";
$user_name = "root";
$user_password = "";
$db_name = "mydb";

$con = mysqli_connect($host, $user_name, $user_password, $db_name);

$name = $_GET["name"];
$password = $_GET["password"];
$e_mail = $_GET["e_mail"];
$phone_no = $_GET["phone_no"];

$sql = "INSERT INTO `customer`(`name`, `password`, `e_mail`, `phone_no`) VALUES ($name,$password,$e_mail,$phone_no)";

$result = mysqli_query($con, $sql);


if(mysqli_num_rows($result)>0){
	$status = "failed";
}
else
{	
	$sql = "insert into customer(name, password, e_mail, phone_no) values('$name','$password','$e_mail','$phone_no')";
	if(mysqli_query($con,$sql))
	{
	$status = "ok";
	}
	else
	{
	$status = "error";
	}
}

echo json_encode(array("response"=>$status));

mysqli_close($con);

?>