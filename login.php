<?php
//include "init.php"

$host = "localhost";
$user_name = "root";
$user_password = "";
$db_name = "mydb";

$con = mysqli_connect($host, $user_name, $user_password, $db_name);

$name = $_GET["name"];
$password = $_GET["password"];

$sql = "select * from customer where name = '$name' and password = '$password'";

$result = mysqli_query($con, $sql);

if(!mysqli_num_rows($result) > 0)
{
$status = "failed";
echo json_encode(array("response"=>$status));
}

else
{
	$row = mysqli_fetch_assoc($result);
	$name = $row['name'];
	$status = "ok";
	echo json_encode(array("response"=>$status, "name"=>$name));
}

mysqli_close($con);

?>