<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="webjars/bootstrap/4.6.1/css/bootstrap.min.css">
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
<div class="container">
    <div class="page-title">
        <h2>Owners </h2>
    </div>
    <div class="content-table">

        <br/>
        <div class="table-responsive">
            <table class="table table-sm table-bordered">
            <thead class="thead-dark">
            <tr>
                <th class="text-center">#</th>
                <th class="text-center">Name</th>
                <th class="text-center">address</th>
                <th class="text-center">city</th>
                <th class="text-center">telephone</th>
                <th class="text-center">Pet</th>
                <th class="text-center">Actions</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="own" items="${owners}">
                <tr>
                    <td class="text-center"><c:out value="${own.id}" /></td>
                    <td class="text-center"><c:out value="${own.firstName} ${own.lastName} " /></td>
                    <td class="text-center"><c:out value="${own.address}" /></td>
                    <td class="text-center"><c:out value="${own.city}" /></td>
                    <td class="text-center"><c:out value="${own.telephone}" /></td>
                    <c:forEach items="${pets}" var="pet">
                    <td class="text-center"><c:out value="${pet.name}" /></td>
                    </c:forEach>
                    <td class="text-center">
                        <a href="/owners/details/${own.id}">Detail</a>
<%--                        <a href="owners/update/${own.id}">Update</a> |--%>
<%--                        <a href="owners/delete/${own.id}">Delete</a>--%>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        </div>
    </div>
</div>

<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
<script src="webjars/bootstrap/4.6.1/js/bootstrap.min.js"></script>
</body>
</html>
