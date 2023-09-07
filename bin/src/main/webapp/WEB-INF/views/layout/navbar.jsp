<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/css/styles.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

    <style>
        body, html {
            height: 100%;
            margin: 0;
        }

        .col-2.diff {
            background-color: #f8f9fa; /* Set your desired background color */
            padding: 0;
            height: 100vh; /* Set the height to 100% of the viewport height */
            display: flex;
            flex-direction: column;
        }

        .nav-items {
            padding: 10px;
            cursor: pointer;
            display: flex;
            align-items: center;
        }
        .nav-search {
            padding-top: 15px;
            border-bottom: 1px solid var(--border-color);
        }
        nav {
            background-color: var(--background-color);
            border-right: 1px solid var(--border-color);
        }
        .nav-items:hover {
            background-color: #ddd;
        }
        object{
            width: 100%;
            height: 100vh;
        }
    </style>
</head>
<body>
<nav class="col-2 diff">
    <div class="nav-search ">
        <div class="input-group mb-3">
            <input type="text" class="form-control" placeholder="Search..."/>
            <div class="input-group-append">
                <span class="input-group-text bg-white"
                ><i class="fa fa-search" aria-hidden="true"></i
                ></span>
            </div>
        </div>
    </div>
    <div class="nav-items icons-color flex align-item-center">
        <i class="fa fa-table" aria-hidden="true"></i>
        <a href="/computer/list">List computer</a>
    </div>
    <div class="nav-items icons-color">
        <i class="fa fa-table" aria-hidden="true"></i>
        <a href="/customer/list">List customer</a>
    </div>
    <div class="nav-items icons-color">
        <i class="fa fa-table" aria-hidden="true"></i>
        <a href="/service/list">List service</a>
    </div>
    <div class="nav-items icons-color">
        <i class="fa fa-table" aria-hidden="true"></i>
        <a href="/useService/list">List use service</a>
    </div>
    <div class="nav-items icons-color">
        <i class="fa fa-table" aria-hidden="true"></i>
        <a href="/useComputer/list">List use computer</a>
    </div>
</nav>
</body>
</html>
