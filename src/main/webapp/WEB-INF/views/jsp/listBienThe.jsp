<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="b" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi Tiet San Pham</title>
</head>
<body>
	<h1>CHI TIET SAN PHAM</h1>
	<table border="1">
		<tr>
			<th>Ten San Pham</th>
			<th>Hinh Anh</th>
			<th>Mo Ta</th>
			<th>Ngay Nhap</th>
			<th>Luot Xem</th>
			<th>Don Vi</th>
			<th>Don Gia</th>
			<th>Gia Khuyen Mai</th>
			<th>So Luong</th>
			<th>Trang Thai</th>
		</tr>
		<c:forEach items="${list }" var="b">
			<tr>
				<td>${b.sanpham.ten_san_pham }</td>
				<td>${b.hinh_anh }</td>
				<td>${b.mo_ta }</td>
				<td>${b.ngay_nhap}</td>
				<td>${b.luot_xem}</td>
				<td>${b.don_vi}</td>
				<td>${b.don_gia}</td>
				<td>${b.gia_khuyen_mai}</td>
				<td>${b.so_luong}</td>
				<td>${b.trang_thai}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="initInsertSanPham">Them San Pham</a>
	<tr>
		<td colspan="2"><a
			href="preUpdateBienThe?id_bien_the=${b.id_bien_the}">update</a></td>
	</tr>
</body>
</html>