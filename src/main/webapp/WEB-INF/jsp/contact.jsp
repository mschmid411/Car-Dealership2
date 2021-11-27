<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<head>
    <head>
        <meta charset="utf-8">
        <link href="/css/lux.css" rel="stylesheet">

    </head>
    <title>Contact Us</title>


    <header>
        <%@ include file="navbar.jsp" %>
    </header>

</head>
<body>
<%--<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">--%>
<%--<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>--%>
<%--<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>
<!------ Include the above in your HEAD tag ---------->

<div class="container">

    <h3 class="text-center">Contact us</h3><br/>

    <div class="row">
        <div class="col-md-8">

            <input class="form-control" name="name" placeholder="Name..."/><br/>
            <input class="form-control" name="phone" placeholder="Phone..."/><br/>
            <input class="form-control" name="email" placeholder="E-mail..."/><br/>
            <textarea class="form-control" name="text" placeholder="How can we help you?"
                      style="height:150px;"></textarea><br/>
            <a href="/thank-you">
                <div class="pt-1 mb-4">
                    <button type="button" style="width: 15rem;" align="center" class="btn btn-primary disabled" >Send</button>
                </div>
            </a>
        </div>
        <div class="col-md-4">
            <b>Customer service:</b> <br/>
            Phone: +1 800 209 291<br/>
            E-mail: <a href="mailto:support@mysite.com">support@luxcars.com</a><br/>
            <br/><br/>
            <b>Headquarter:</b><br/>
            Lux Cars Inc, <br/>
            Chicago street Rush<br/>
            60661 IL, USA<br/>
            Phone: +1 312 000 101<br/>
            <a href="mailto:luxcars@mysite.com">info@luxcars.com</a><br/>


            <br/><br/>
            <b>Berlin:</b><br/>
            LL Berlin Litd, <br/>
            25/F.168 Queen<br/>
            Dusseldorn District, Germany<br/>
            Phone: +852 129 209 291<br/>
            <a href="">hk@mysite.com</a><br/>


        </div>
    </div>

</div>

</body>
</html>
