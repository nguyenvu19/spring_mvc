<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Thêm máy</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
<div class="container-fluid">

    <jsp:include page="/WEB-INF/views/layout/header.jsp"/>
    <div class="row">
        <jsp:include page="/WEB-INF/views/layout/navbar.jsp"/>

        <%--Content--%>
        <div class="col-10 p-3">
            <form action="#" method="post" name="addComputer">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <h2>Tạo mới máy</h2>
                        <%--        <p style="color: blue">${message}</p>--%>

                        <div class="form-group">
                            <label>Vị trí</label>
                            <input type="text" name="viTri" placeholder="Nhập vị trí máy" class="form-control" value="">
                        </div>

                        <div class="form-group">
                            <label>Trạng thái</label>
                            <input type="text" name="trangThai" placeholder="Nhập trạng thái máy" class="form-control" value="">
                        </div>

                        <button type="submit" id="btn-addCustomer" class="btn btn-primary">
                            Thêm mới
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
