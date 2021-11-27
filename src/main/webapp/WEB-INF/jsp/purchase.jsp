<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <head>
        <meta charset="utf-8">
        <link href="/css/lux.css" rel="stylesheet">

    </head>
    <title>Payment Page</title>


    <header>
        <%@ include file="navbar.jsp" %>
    </header>

</head>
<body>
<form:form method="post" action="/purchase" modelAttribute="transaction">
    <form:input type="hidden" path="car.vin" value="${car.vin}" />
    <form:input type="hidden" path="price" value="${price}" />
    <div class="container">
        <div class="py-5 text-center">
            <h2>Purchase Form</h2>
            <p class="lead">If you've selected a special offer vehicle, Congratulations! You're offer has been accepted.</p>
        </div>

        <div class="row">
            <div class="col-md-4 order-md-2 mb-4">
                <h4 class="d-flex justify-content-between align-items-center mb-3">
                    <span class="text-muted">Your Purchase</span>
                    <span class="badge badge-secondary badge-pill">3</span>
                </h4>
                <ul class="list-group mb-3">
                    <li class="list-group-item d-flex justify-content-between lh-condensed">
                        <div>
                            <h6 class="my-0">Product name</h6>
                        </div>
                        <span class="text-muted"></span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between lh-condensed">
                            ${transaction.car.year}, ${transaction.car.make}, ${transaction.car.model}
<%--                    </li>--%>
<%--&lt;%&ndash;                     <div>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <small class="text-muted">Purchase Price</small>&ndash;%&gt;--%>
<%--&lt;%&ndash;                    </div>&ndash;%&gt;--%>
<%--                    <span class="text-muted"></span>--%>
<%--                    </li>--%>
                    <li class="list-group-item d-flex justify-content-between bg-light">
                        <div class="text-success">
                            <h6 class="my-0">Amount Due</h6>
<%--                            <small>Offer Accepted</small>--%>
                        </div>
<%--                        <span class="text-success">up to 10%</span>--%>
                    </li>
                    <li class="list-group-item d-flex justify-content-between">
                        <span>Total USD</span>
                        <strong>${transaction.car.formatPrice(price)}</strong>
                    </li>
                    <li class="list-group-item d-flex justify-content-between">
                        <span>Amount Bid</span>
                        <strong>${transaction.bid.formatPrice(offer)}</strong>
                    </li>
                </ul>


<%--                <div class="input-group">--%>
<%--                    <input type="text" class="form-control" placeholder="Make Offer">--%>
<%--                    <div class="input-group-append">--%>
<%--                        <button type="submit" class="btn btn-secondary">Submit</button>--%>
<%--                    </div>--%>
<%--                </div>--%>
            </div>
            <div class="col-md-8 order-md-1">
                <h4 class="mb-3">Billing Information</h4>

                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="firstName">First name</label>
                        <form:input name="customer.firstName" type="text" class="form-control" id="firstName"
                               path="customer.firstName"></form:input>
                        <div class="invalid-feedback">
                            Valid first name is required.
                        </div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="lastName">Last name</label>
                        <form:input name="lastName" type="text" path="customer.lastName" class="form-control" id="lastName"
                                ></form:input>
                        <div class="invalid-feedback">
                            Valid last name is required.
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="phonenumber">Phone Number</label>
                    <div class="input-group">
                        <div class="input-group-prepend">
                        </div>
                        <form:input name="phoneNumber" type="text" path="customer.phoneNumber" class="form-control" id="phonenumber"
                               placeholder="555-555-5555"  ></form:input>
                        <div class="invalid-feedback" style="width: 100%;">
                            Your username is required.
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="email">Email</label>
                    <form:input name="email" type="email" path="customer.email" class="form-control" id="email"
                           placeholder="you@example.com"></form:input>
                    <div class="invalid-feedback">
                        Please enter a valid email address.
                    </div>
                </div>

                <div class="custom-control custom-checkbox">
                    <form type="checkbox" class="custom-control-input" id="save-info"></form>
                    <label class="custom-control-label" for="save-info">Save this information for next time</label>
                </div>
                <hr class="mb-4">

                <h4 class="mb-3">Payment</h4>

                <div class="d-block my-3">
                    <div class="custom-control custom-radio">
                        <input id="credit" name="paymentMethod" type="radio" class="custom-control-input" checked=""
                               required="">
                        <label class="custom-control-label" for="credit">Credit card</label>
                    </div>
<%--                    <div class="custom-control custom-radio">--%>
<%--                        <input id="debit" name="paymentMethod" type="radio" class="custom-control-input" required="">--%>
<%--                        <label class="custom-control-label" for="debit">Debit card</label>--%>
<%--                    </div>--%>

                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="cc-name">Name on card</label>
                            <form:input
                                    name="ccName"
                                    type="text"
                                    path="payment.ccName"
                                    class="form-control"
                                    id="cc-name"
                            ></form:input>
                            <small class="text-muted">Full name as displayed on card</small>
                            <div class="invalid-feedback">
                                Name on card is required
                            </div>
                        </div>
                        <div class="col-md-6 mb-3">
                            <label for="cc-number">Credit card number</label>
                            <form:input name="ccNumber" path="payment.ccNumber" type="text" class="form-control" id="cc-number"
                                  ></form:input>
                            <div class="invalid-feedback">
                                Credit card number is required
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-3 mb-3">
                            <label for="cc-expiration">Expiration</label>
                            <form:input name="ccExpiration" path="payment.ccExpiration" type="text" class="form-control" id="cc-expiration"
                                 ></form:input>
                            <div class="invalid-feedback">
                                Expiration date required
                            </div>
                        </div>
                        <div class="col-md-3 mb-3">
                            <label for="cc-expiration">CVV</label>
                            <input name="ccCvv" path="payment.ccCvv" type="text" class="form-control" id="cc-cvv"
                                    ></input>
                            <div class="invalid-feedback">
                                Security code required
                            </div>
                        </div>
                    </div>
                    <hr class="mb-4">
                    <button class="btn btn-primary btn-lg btn-block" type="submit">Continue to checkout</button>
                </div>
            </div>
        </div>
        <footer class="my-5 pt-5 text-muted text-center text-small">
            <p class="mb-1">© 2021 Lux Cars</p>
            <ul class="list-inline">
                <li class="list-inline-item"><a href="#">Privacy</a></li>
                <li class="list-inline-item"><a href="#">Terms</a></li>
                <li class="list-inline-item"><a href="#">Support</a></li>
            </ul>
        </footer>
    </div>
</form:form>
</body>
</html>
