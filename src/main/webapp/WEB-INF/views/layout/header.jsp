<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%--    <link rel="stylesheet" type="text/css"--%>
<%--          href="${request.contextPath}/resources/css/styles.css">--%>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

<%--    <script--%>
<%--            src="<%=request.getContextPath()%>/resources/js/register-user.js"></script>--%>
</head>
<body>
<header class="row header text-secondary">
    <div class="col-6 diff">
        <h4>CMS</h4>
    </div>
    <div class="col-6 d-flex justify-content-end">
        <div class="btn-group">
            <button
                    type="button "
                    class="btn dropdown-toggle"
                    data-toggle="dropdown"
                    aria-haspopup="true"
                    aria-expanded="false"
            >
                <i class="fa fa-user icons-color" aria-hidden="true"></i>
            </button>
            <div class="dropdown-menu dropdown-menu-right icons-color">
                <a class="dropdown-item" href="#">
                    <i class="fa fa-user" aria-hidden="true"></i>
                    User Profile</a
                >
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">
                    <i class="fas fa-sign-out-alt"></i>
                    Logout</a
                >
            </div>
        </div>
    </div>
</header>
</body>
</html>
