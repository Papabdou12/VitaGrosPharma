<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="/webjars/bootstrap/4.6.1/css/bootstrap.min.css">
    <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
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
<br/>
<div class="text-info text-lg-left">
    <h1 class="tex" >Owner Information</h1>
</div>
<div class="container">
    <div class="content-table">

        <br/>
        <div class="table-responsive " >

            <table class="table table-md table-bordered ">
                <tbody>
                <tr>
                    <td>NAME</td>
    <td><c:out value="${detailsOwners.firstName} ${detailsOwners.lastName}" /></td>
                </tr>
                <tr>
                    <td>Address</td>
    <td><c:out value="${detailsOwners.address} " /></td>
                </tr>
                <tr>
                    <td>City</td>
    <td><c:out value="${detailsOwners.city} " /></td>
                </tr>
                <tr>
                    <td>Telephone</td>
    <td><c:out value="${detailsOwners.telephone} " /></td>

                </tr>
                </tbody>
</table>

        </div>
        <div class="create-btn">
            <a class="btn btn-outline-info mb-3" href="/owners/update/${id}" >Update</a>
            <a href="/owners/new" class="btn btn-outline-success mb-3">Add Owners</a>
        </div>

    </div>
</div>
<div class="container">
    <div class="col-6">
        <div class="table-responsive " >
            <table class="table table-md d-print-table ">
<tbody>
                <c:forEach items="${detailsOwners.pets}" var="p">
                    <tr>
                        <th>name:</th><br>
                        <td><c:out value="${p.name}"  /></td>

                        <th>Birth Date</th>
                        <td><c:out value="${p.dateOfBirth} " /></td>

                        <th>Type</th>
                        <td><c:out value="${p.petType} " /></td>

                        <th>Visits</th>
                        <td><c:out value="${p.visits} " /></td>

                    </tr>
                </c:forEach>
</tbody>
            </table>
            <div>
                <a href="/pets/update/${id}" class="btn btn-outline-success mb-3">Edit pets</a>
                <a href="/pets/new" class="btn btn-outline-success mb-3">Add Pets</a>
            </div>
        </div>
    </div>
</div>

<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
<script src="webjars/bootstrap/4.6.1/js/bootstrap.min.js"></script>
</body>
</html>
