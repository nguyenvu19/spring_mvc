<%@ page import="java.util.List"%>
<%@ page import="edu.fa.model.SuDungMay"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<title>Danh sách sử dụng dịch vụ</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
	<div class="container-fluid">

		<jsp:include page="/WEB-INF/views/layout/header.jsp" />
		<div class="row">
			<jsp:include page="/WEB-INF/views/layout/navbar.jsp" />

			<%--Content--%>
			<div class="col-10 p-3">
				<h2>Danh sách sử dụng máy</h2>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Mã khách hàng</th>
							<th>Tên khách hàng</th>
							<th>Địa chỉ</th>
							<th>Số điện thoại</th>
							<th>Địa chỉ email</th>
							<th>Sử dụng máy</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach var="khachHang" items="${khachHangs}">
							<c:set var="hasUsageRecord" value="false" />

							<c:forEach var="suDungMay" items="${suDungMays}">
								<c:if test="${suDungMay.khachHang.maKH eq khachHang.maKH}">
									<c:set var="hasUsageRecord" value="true" />
								</c:if>
							</c:forEach>

							<c:if test="${hasUsageRecord}">
								<tr>
									<td>${khachHang.maKH}</td>
									<td>${khachHang.tenKH}</td>
									<td>${khachHang.diaChi}</td>
									<td>${khachHang.soDienThoai}</td>
									<td>${khachHang.diaChiEmail}</td>
									<td>
										<table class="table table-bordered">
											<thead>
												<th>Mã máy</th>
												<th>Vị trí</th>
												<th>Trạng thái</th>
												<th>Ngày bắt đầu sử dụng</th>
												<th>Giờ bắt đầu sử dụng</th>
												<th>Thời gian sử dụng</th>
											</thead>

											<tbody>

												<c:forEach var="suDungMay" items="${suDungMays}">
													<c:if test="${suDungMay.khachHang.maKH eq khachHang.maKH}">
														<tr>
															<td>${suDungMay.may.maMay}</td>
															<td>${suDungMay.may.viTri}</td>
															<td>${suDungMay.may.trangThai}</td>
															<td>${suDungMay.id.ngayBatDauSuDung}</td>
															<td>${suDungMay.id.gioBatDauSuDung}</td>
															<td>${suDungMay.thoiGianSuDung}</td>

														</tr>
													</c:if>
												</c:forEach>

											</tbody>
										</table>
									</td>
								</tr>
							</c:if>
						</c:forEach>
					</tbody>
				</table>

				<a href="/useComputer/add">Thêm sử dụng máy</a>
			</div>
		</div>
	</div>
</body>
</html>
