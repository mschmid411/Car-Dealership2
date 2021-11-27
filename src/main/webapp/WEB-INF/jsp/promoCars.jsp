<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<%-- This is JSP comment --%>
<head>
    <meta charset="utf-8">
    <link href="/css/lux.css" rel="stylesheet">
</head>
<title>Promo Cars</title>

<body>
<header>
    <%@ include file="navbar.jsp" %>
</header>
<section class="py-5 text-center container">
    <div class="card mb-3">
        <h3 class="card-header">Special Promotions</h3>
        <div class="card-body">
            <h5 class="card-title">Select vehicles can be bid on with a competitive offer.</h5>
            <h6 class="card-subtitle text-muted"> Supplies are limited, join the bidding!</h6>
        </div>
        <div>
        </div>
    </div>
</section>
<table class="table table-hover">
    <thead>
    <tr>
        <td>Image Gallery</td>
        <td>Offer</td>
        <td>Make</td>
        <td>Model</td>
        <td>Year</td>
        <td>Price</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${promoCars}" var="car">
        <tr class="table-active">
            <td><img src="${car.imageurl}" width="350" height="200"></td>
                <%--                <form:form method="post" action="/promoCars" modelAttribute="car">--%>
                <%--                    <td><button type="purchase" class="btn btn-outline-secondary">Offer Here</button></td>--%>
                <%--                </form:form>--%>
            <td>
                <div class="input-group mb-3">
                    <form:form method="post" action="/bid/${car.vin}" modelAttribute="car">
                        <input type="number" name="bid" class="form-control" placeholder="Enter your Offer"
                               aria-label="Recipient's username" aria-describedby="button-addon2"/>
                        <button type="submit" class="btn btn-dark">Submit</button>
                    </form:form>
                </div>
            </td>
            <td>${car.make}</td>
            <td>${car.model}</td>
            <td>${car.year}</td>
            <td>${car.formatPrice(price)}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>


</body>
</html>