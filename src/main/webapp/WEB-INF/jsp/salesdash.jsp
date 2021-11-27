<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%-- This is JSP comment --%>
<html>
<head>
    <head>
        <meta charset="utf-8">
        <link href="/css/lux.css" rel="stylesheet">

    </head>
    <title>About Lux Cars</title>


    <header>
        <%@ include file="navbar.jsp" %>
    </header>

</head>
<title>Sales Dashboard</title>
<body>


<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">Date</th>
        <th scope="col">Purchase</th>
        <th scope="col">Purchase Price</th>
        <th scope="col">Customer</th>
        <th scope="col">Contact</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${transactions}" var="transaction">
    <tr class="table-active">
        <td>${transaction.transactionDate}</td>
        <td>${transaction.car.year} ${transaction.car.make} ${transaction.car.model}</td>
        <td>${transaction.car.formatPrice(price)}</td>
        <td>${transaction.customer.firstName} ${transaction.customer.lastName}</td>
        <td>${transaction.customer.email}</td>
    </tr>
    </tbody>
    </c:forEach>
</table>

</body>
</html>
