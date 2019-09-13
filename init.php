<?php

$host = "localhost";
$user_name = "root";
$user_password = "";
$db_name = "mydb";

$con = mysqli_connect($host, $user_name, $user_password, $db_name);

if($con){
echo "Connection success..";
}
else{
echo "Woops! No connection..";
}

?>