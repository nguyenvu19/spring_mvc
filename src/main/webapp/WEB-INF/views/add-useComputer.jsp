<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Thêm sử dụng máy</title>
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
            <form action="#" method="post" name="addUseComputer">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <h2>Tạo mới sử dụng máy</h2>
                        <%--        <p style="color: blue">${message}</p>--%>

                        <label>Chọn khách hàng:</label>
                        <select name="maKH" class="form-control">
                            <c:forEach items="${khachHangs}" var="khachHang">
                                <option value="${khachHang.maKH}">${khachHang.tenKH}</option>
                            </c:forEach>
                        </select>
                        <br>

                        <label>Chọn máy:</label>
                        <select name="maMay" class="form-control">
                            <c:forEach items="${mays}" var="may">
                                <option value="${may.maMay}">${may.viTri}</option>
                            </c:forEach>
                        </select>

                        <div class="form-group">
                            <label>Ngày bắt đầu sử dụng</label>
                            <input type="date" name="ngayBatDauSuDung" class="form-control" value="">
                        </div>

                        <div class="form-group">
                            <label>Giờ bắt đầu sử dụng</label>
                            <input type="time" name="gioBatDauSuDung" class="form-control" value="">
                        </div>

                        <div class="form-group">
                            <label>Thời gian sử dụng</label>
                            <input type="number" name="thoiGianSuDung" class="form-control" value="">
                        </div>

                        <button type="submit" id="btn-addService" class="btn btn-primary">
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
