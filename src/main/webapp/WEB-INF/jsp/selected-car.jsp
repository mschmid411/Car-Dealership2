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
    <title>Car Details</title>

<body>
<header>
    <%@ include file="navbar.jsp" %>
</header>
<body>


    <section class="py-5 text-center container">
    <div class="row py-lg-5">
        <div class="col-lg-6 col-md-8 mx-auto">
            <h1 class="fw-light">${carList.year} ${carList.model}</h1>
            <p class="lead text-muted">Make: ${carList.make}</p>
            <p class="lead text-muted">Model: ${carList.model}</p>
            <p class="lead text-muted">Year: ${carList.year}</p>
            <p class="lead text-muted">Mileage: ${carList.currentOdometer}</p>
            <p class="lead text-muted">Color: ${carList.color}</p>
            <p class="lead text-muted">Trim-Level: ${carList.trimLevel}</p>
            <p class="lead text-muted">New/Pre-Owned: ${carList.printPreOwned()}</p>
            <p class="lead text-muted">Body-Style:${carList.bodyStyle}</p>
            <p class="lead text-muted">Total Price: ${carList.formatPrice(price)}</p>
            <img src="${carList.imageurl}" alt="Image Not Found" width="100%" height="225"/>


        </div>
    </div>
    </section>


</body>
</header>

</body>
</html>
