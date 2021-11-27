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
    <title>Lux Cars Home</title>

<body>
<header>
    <%@ include file="navbar.jsp"%>
</header>
    <style>
        body {
            background-image: url("/images/HomePage2.JPG");
            background-repeat: no-repeat; /* Do not repeat the image */
            background-size: cover; /* Resize the background image to cover the entire container */

        }
    </style>

</body>
<body>



<!-- Full Page Image Header with Vertically Centered Content -->
<header class="masthead">

    <div class="container h-100">
        <div class="row h-100 align-items-center">
            <div class="col-12 text-center">
                <h1 class="fw-bold">Chicago's Premier Luxury Car Dealer</h1>
                <p class="lead" style="text-emphasis-color: #cbe0d2">Visit the city's largest selection of exotic, limited production vehicles.</p>
            </div>
        </div>
    </div>
</header>

</body>
</html>