<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
  <title>Danh sách máy</title>
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
      <h2>Danh sách dịch vụ</h2>

      <table class="table table-border">
        <thead>
        <tr>
          <th>Mã dịch vụ</th>
          <th>Tên dịch vụ</th>
          <th>Đơn vị tính</th>
          <th>Đơn giá</th>
          <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${dichVus}" var="dichVu">
          <tr>
            <td>${dichVu.maDV}</td>
            <td>${dichVu.tenDV}</td>
            <td>${dichVu.donViTinh}</td>
            <td>${dichVu.donGia}</td>
            <td>
              <a href="/service/update?maDV=${dichVu.maDV}">Cập nhật</a>
              <a href="#" onclick="confirmDelete('${dichVu.maDV}')">Xóa</a>
            </td>
          </tr>
        </c:forEach>

        </tbody>
      </table>
      <a href="/service/add">Add Service</a>
    </div>
  </div>
</div>
<script>
  function confirmDelete(maDV) {
    let result = confirm("Bạn có muốn xóa không?");
    if (result) {
      // Redirect to the delete endpoint if user confirms
      window.location.href = "/service/delete?maDV=" + maDV;
    }
  }
</script>
</body>
</html>
