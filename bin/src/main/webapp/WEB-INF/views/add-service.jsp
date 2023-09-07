<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
  <title>Thêm dịch vụ</title>
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
      <form action="#" method="post" name="addService">
        <div class="row">
          <div class="col-md-6 offset-md-3">
            <h2>Tạo mới dịch vụ</h2>
            <%--        <p style="color: blue">${message}</p>--%>

            <div class="form-group">
              <label>Tên dịch vụ</label>
              <input type="text" name="tenDV" placeholder="Nhập tên dịch vụ" class="form-control" value="">
            </div>

            <div class="form-group">
              <label>Đơn vị tính</label>
              <input type="text" name="donViTinh" placeholder="Nhập đơn vị tính" class="form-control" value="">
            </div>

            <div class="form-group">
              <label>Đơn giá</label>
              <input type="number" name="donGia" placeholder="Nhập đơn giá" class="form-control" value="">
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
