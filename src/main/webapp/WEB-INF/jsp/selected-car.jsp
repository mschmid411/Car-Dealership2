<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%-- This is JSP comment --%>
<html>
<head>
    <meta charset="utf-8">
    <link href="/css/lux.css" rel="stylesheet">

</head>
<title>Car Details</title>

<header>
    <%@ include file="navbar.jsp" %>
</header>
<body>
<section class="py-5 text-center container">

    <div class="card mb-3">
        <h3 class="card-header">${carList.make} ${carList.model}</h3>
        <div class="card-body">
            <h5 class="card-title">${carList.year} </h5>
            <h6 class="card-subtitle text-muted"> ${carList.printPreOwned()}</h6>
        </div>

        <div class="card-body">
            <p class="card-text"> Model ${carList.model} | Year ${carList.year} | Mileage ${carList.currentOdometer} |
                Color ${carList.color} | Trim-Level ${carList.trimLevel} | Body-Style ${carList.bodyStyle} | Total
                Price: ${carList.formatPrice(price)}</p>

            <div class="card-body">
                <a href="/allCars" class="card-link">Back to Inventory</a>
                <a href="/purchase" path="/purchase" class="card-link">Purchase</a>
            </div>
            <img src="${carList.imageurl}" class="img-fluid" alt="Responsive image">
        </div>
    </div>
</section>
</body>
</html>
