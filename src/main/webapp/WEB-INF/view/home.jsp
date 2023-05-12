<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Saraya Employee Management</title>
    <link rel="stylesheet" href="webjars/bootstrap/4.6.1/css/bootstrap.min.css">
    <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
<style>

</style>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">VitaGros Pharm</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarID"
                aria-controls="navbarID" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarID">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="/home">Home</a>
                <a class="nav-link active" aria-current="page" href="/owners">Owners</a>
                <a class="nav-link active" aria-current="page" href="/pets">Pets</a>
                <a class="nav-link active" aria-current="page" href="/vets">Vets</a>

            </div>
        </div>
    </div>
</nav>
<h1>WELCOME</h1>
 <a href="/owners"> <img src="/resources/img/images.jpg"> </a>

    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
    <script src="webjars/bootstrap/4.6.1/js/bootstrap.min.js"></script>
</body>
</html>
