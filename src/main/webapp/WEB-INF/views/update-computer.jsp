<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Cập nhật máy</title>
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
            <h2>Cập nhật máy</h2>
            <form:form action="/computer/update" method="post" name="updateComputer" modelAttribute="may">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                            <%--        <p style="color: blue">${message}</p>--%>

                        <div class="form-group">
                            <label>Mã máy</label>
                            <form:input type="text" path="maMay" value="${may.getMaMay()}" class="form-control" readonly="true" />
                        </div>
                        <div class="form-group">
                            <label>Vị trí</label>
                            <input type="text" name="viTri" value="${may.getViTri()}" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Trạng thái</label>
                            <input type="text" name="trangThai" value="${may.getTrangThai()}" class="form-control">
                        </div>

                        <button type="submit" id="btn-updateComputer" class="btn btn-primary">
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
