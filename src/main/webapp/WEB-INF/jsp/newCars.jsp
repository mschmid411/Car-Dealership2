<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<%-- This is JSP comment --%>
<head>
    <meta charset="utf-8">
    <link href="/css/lux.css" rel="stylesheet">


</head>
<title>New Inventory</title>

<body>
<header>
    <%@ include file="navbar.jsp" %>
</header>
<div>
    <table class="table table-hover">

        <thead>
        <tr>
            <td>Image</td>
            <td>New/Pre-Owned</td>
            <td>Make</td>
            <td>Model</td>
            <td>Year</td>
            <td>Price</td>
            <td>Purchase</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${newCars}" var="car">
            <tr class="table-active">
                <td><img src="${car.imageurl}" width="350" height="200"></td>
                <td>${car.printPreOwned()}</td>
                <td>${car.make}</td>
                <td>${car.model}</td>
                <td>${car.year}</td>
                <td>${car.formatPrice(price)}</td>
                <td>
                    <button type="purchase" class="btn btn-outline-secondary"><a href="/purchase?vin=${car.vin}">Purchase</a>
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


</body>
</html>