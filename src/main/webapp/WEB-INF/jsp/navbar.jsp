<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <!--- Bootswatch css --->

    <link href="/css/lux.css" rel="stylesheet">
    <!--- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
            integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>

</head>
<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="/">Lux Cars</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01"
                    aria-controls="navbarColor03" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarColor01">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">
                        <a class="nav-link active" href="/contact">Contact
                            <span class="visually-hidden">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/about">About</a>
                    </li>
                    <%--                    <li class="nav-item">--%>
                    <%--                        <a class="nav-link" href="/purchase">Purchase</a>--%>
                    <%--                    </li>--%>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button"
                           aria-haspopup="true" aria-expanded="false">Sales Experts</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="/saleslogin">Login</a>

                            <%--                        Can I have the following two dropdowns only appear if the sales rep is logged in?--%>

                            <a class="dropdown-item" href="/addCarForm">Add Vehicle</a>
                            <a class="dropdown-item" href="/salesdash">Transactions</a>
                            <%--                        <div class="dropdown-divider"></div>--%>
                            <%--                        <a class="dropdown-item" href="#">Separated link</a>--%>
                        </div>
                        <%--                    <li class="nav-item">--%>
                        <%--                        <a class="nav-link" href="/saleslogin">Sales Experts</a>--%>
                        <%--                    </li>--%>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" role="button"
                           aria-haspopup="true" aria-expanded="false">Inventory</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="/allCars">View All</a>
                            <a class="dropdown-item" href="/newCars">New Vehicles</a>
                            <a class="dropdown-item" href="/preowned">Certified Pre-Owned</a>
                            <a class="dropdown-item" href="/promoCars">Special Offers</a>

                            <div class="dropdown-divider"></div>

                            <!-- Default dropright button -->
                            <div class="btn-group dropright">
                                <%--                    <div class="btn-group dropright">--%>
                                <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false">
                                    Make/Model
                                </button>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="/promoCars">Special Offers</a>
                                    <a class="dropdown-item" href="/promoCars">Special Offers</a>
                                    <a class="dropdown-item" href="/promoCars">Special Offers</a>
                                    <!-- Dropdown menu links -->
                                </div>
                                <%--                    </div>--%>

                            </div>
                        </div>
            </div>
            </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-sm-2" type="text" placeholder="Make, model, or keyword">
                <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>

            </form>
        </div>
        </div>
    </nav>
</header>
</body>
</html>
