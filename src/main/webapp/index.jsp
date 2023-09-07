<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/css/styles.css">
    <%--    <script--%>
    <%--            src="<%=request.getContextPath()%>/resources/js/register-user.js"></script>--%>
</head>
<body>


<jsp:include page="WEB-INF/views/list-customer.jsp"/>

</body>
</html>
