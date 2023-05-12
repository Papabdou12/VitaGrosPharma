
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="webjars/bootstrap/4.6.1/css/bootstrap.min.css">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->

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
<div class="container col-md-5" style="margin-top: 5%;">
    <div class="card">
        <div class="card-body">
            <fieldset class="form-group" >
                <form action="/owners" method="post" modelAttribute="ownerDto" enctype="multipart/form-data">
                    <div>
                        <label>FistName:</label>
                        <input type="text" value="" class="form-control" name="firstName" />

                    </div>
                    <div>
                        <label>LastName:</label>
                        <input type="text" value="" class="form-control" name="lastName" />

                    </div>
                    <div>
                        <label>Adress:</label>
                        <input type="text"  value="" class="form-control" name="address" />

                    </div>
                    <div>
                        <label>City:</label>
                        <input type="text" value="" class="form-control" name="city" />

                    </div>
                    <div>
                        <label>Telephone:</label>
                        <input type="number" value="" class="form-control" name="telephone" />

                    </div>
                    <div>
                    Pets : <select  name="">
                    <option value="">Select Pets</option>
                    <c:forEach items="${pets}" var="p">
                        <option value="${p.id}">${p.name}</option>
                    </c:forEach>
                    </select>
                    </div>
                    <div>
                        <input type="submit" class="btn btn-success" value="submit">
                    </div>
                </form>
            </fieldset>
        </div>
    </div>
</div>

<!-- Java Script CSS -->
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
<script src="webjars/bootstrap/4.6.1/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>
