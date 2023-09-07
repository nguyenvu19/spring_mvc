<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Danh sách khách hàng</title>
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
            <h2>Danh sách khách hàng</h2>

            <table class="table table-border">
                <thead>
                <tr>
                    <th>Mã khách hàng</th>
                    <th>Tên khách hàng</th>
                    <th>Địa chỉ</th>
                    <th>Số điện thoại</th>
                    <th>Email</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${khachHangs}" var="khachHang">
                    <tr>
                        <td>${khachHang.maKH}</td>
                        <td>${khachHang.tenKH}</td>
                        <td>${khachHang.diaChi}</td>
                        <td>${khachHang.soDienThoai}</td>
                        <td>${khachHang.diaChiEmail}</td>
                        <td>
                            <a href="/customer/update?maKH=${khachHang.maKH}">Cập nhật</a>
                            <a href="#" onclick="confirmDelete('${khachHang.maKH}')">Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a href="/customer/add">Add customer</a>
        </div>
    </div>
</div>
<script>
    function confirmDelete(maKH) {
        let result = confirm("Bạn có muốn xóa không?");
        if (result) {
            // Redirect to the delete endpoint if user confirms
            window.location.href = "/customer/delete?maKH=" + maKH;
        }
    }
</script>
</body>
</html>
