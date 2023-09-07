<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Cập nhật dịch vụ</title>
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
            <h2>Cập nhật dịch vụ</h2>
            <form:form action="/service/update" method="post" name="updateService" modelAttribute="dichVu">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                            <%--        <p style="color: blue">${message}</p>--%>

                        <div class="form-group">
                            <label>Mã dịch vụ</label>
                            <input type="text" name="maDV" class="form-control"
                                   value="${dichVu.maDV}" readonly>
                        </div>

                        <div class="form-group">
                            <label>Tên dịch vụ</label>
                            <input type="text" name="tenDV" placeholder="Nhập tên dịch vụ" class="form-control"
                                   value="${dichVu.tenDV}">
                        </div>

                        <div class="form-group">
                            <label>Đơn vị tính</label>
                            <input type="text" name="donViTinh" placeholder="Nhập đơn vị tính" class="form-control"
                                   value="${dichVu.donViTinh}">
                        </div>

                        <div class="form-group">
                            <label>Đơn giá</label>
                            <input type="number" name="donGia" placeholder="Nhập đơn giá" class="form-control"
                                   value="${dichVu.donGia}">
                        </div>

                        <button type="submit" id="btn-addService" class="btn btn-primary">
                            Cập nhật
                        </button>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>
