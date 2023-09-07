<%@ page import="java.util.List" %>
<%@ page import="edu.fa.model.SuDungMay" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Danh sách sử dụng dịch vụ</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
<div class="container-fluid">

    <jsp:include page="/WEB-INF/views/layout/header.jsp"/>
    <div class="row">
        <jsp:include page="/WEB-INF/views/layout/navbar.jsp"/>

        <%--Content--%>
        <div class="col-10 p-3">
            <h2>Danh sách sử dụng máy</h2>
            <table class="table table-border">
                <thead>
                <tr>
                    <th>Mã khách hàng</th>
                    <th>Tên khách hàng</th>
                    <th>Địa chỉ</th>
                    <th>Số điện thoại</th>
                    <th>Địa chỉ email</th>
                    <th>Mã máy</th>
                    <th>Vị trí</th>
                    <th>Trạng thái</th>
                </tr>
                </thead>
                <tbody>
                <%--        <c:forEach items="${khachHangs}" var="khachHang">--%>
                <%--          <tr>--%>
                <%--            <td>${khachHang.maKH}</td>--%>
                <%--            <td>${khachHang.tenKH}</td>--%>
                <%--            <td>${khachHang.diaChi}</td>--%>
                <%--            <td>${khachHang.soDienThoai}</td>--%>
                <%--            <td>${khachHang.diaChiEmail}</td>--%>
                <%--            <c:forEach items="${mays}" var="mays">--%>
                <%--              <td>${mays.maMay}</td>--%>
                <%--              <td>${mays.viTri}</td>--%>
                <%--              <td>${mays.trangThai}</td>--%>
                <%--            </c:forEach>--%>
                <%--          </tr>--%>

                <%--        </c:forEach>--%>

<%--                <%--%>
<%--                    List<SuDungMay> suDungMays = (List) request.getAttribute("suDungMays");--%>
<%--                    for(int i = 0; i <= suDungMays.size(); i++){--%>
<%--                        int tongTien = 0;--%>
<%--                    }--%>
<%--                %>--%>
<%--                    <tr>--%>
<%--                        <td>${suDungMays.maKH}</td>--%>
<%--                        <td>${khachHang.tenKH}</td>--%>
<%--                        <td>${khachHang.diaChi}</td>--%>
<%--                        <td>${khachHang.soDienThoai}</td>--%>
<%--                        <td>${khachHang.diaChiEmail}</td>--%>
<%--                        <c:forEach items="${khachHang.suDungMays}" var="suDungMay">--%>
<%--                            <td>${suDungMay.may.maMay}</td>--%>
<%--                            <td>${suDungMay.may.viTri}</td>--%>
<%--                            <td>${suDungMay.may.trangThai}</td>--%>
<%--                        </c:forEach>--%>
<%--                    </tr>--%>

                </tbody>
            </table>

            <a href="/useComputer/add">Thêm sử dụng máy</a>
        </div>
    </div>
</div>
</body>
</html>
