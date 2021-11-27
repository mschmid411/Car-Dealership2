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

<body class="main-bg">
<style>
    .bg-image-vertical {
        position: relative;
        overflow: hidden;
        background-repeat: no-repeat;
        background-position: right center;
        background-size: auto 100%;
    }

    @media (min-width: 1025px) {
        .h-custom-2 {
            height: 100%;
        }
    }
</style>

<section class="vh-100">
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-6 text-black">

                <div class="px-5 ms-xl-4">
                    <i class="fas fa-crow fa-2x me-3 pt-5 mt-xl-4" style="color: #709085;"></i>
<%--                    <span class="h1 fw-bold mb-0">Logo</span>--%>
                </div>

                <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

                    <form style="width: 27rem;">

                        <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Employee Login</h3>

                        <div class="form-outline mb-4">
                            <input type="email" id="form2Example18" class="form-control form-control-lg"/>
                            <label class="form-label" for="form2Example18">Employee Email</label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="password" id="form2Example28" class="form-control form-control-lg"/>
                            <label class="form-label" for="form2Example28">Password</label>
                        </div>
                        <a href="/salesdash">
                        <div class="pt-1 mb-4">
                            <button type="button" style="width: 15rem;" align="center" class="btn btn-primary disabled" >Login</button>
                        </div>
                        </a>
                        <p class="small mb-5 pb-lg-2"><a class="text-muted" href="#!">Forgot password?</a></p>
                        <p>Don't have an account? <a href="#!" class="link-info">Register here</a></p>

                    </form>
                </div>

            </div>
            <div class="col-sm-6 px-0 d-none d-sm-block">
                <img src="https://mdbootstrap.com/img/Photos/new-templates/bootstrap-login-form/img3.jpg"
                     alt="Login image" class="w-100 vh-100" style="object-fit: cover; object-position: left;">
            </div>
        </div>
    </div>
</section>
</body>
</html>
