<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh Sach San Pham</title>
</head>
<body>
	<h1>DANH SACH SAN PHAM</h1>
	<table border="1">
		<tr>
			<th>Ma San Pham</th>
			<th>Ten San Pham</th>
			<th>Danh Muc San Pham</th>
			<th>Hinh Anh</th>
			<th>Trang Thai</th>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.id_san_pham }</td>
				<td>${s.ten_san_pham }</td>
				<td>${s.danhmucsanpham.danh_muc_san_pham }</td>
			<!--  	<td><img
					src="<spring:url value="resources"/>/images/${s.hinh_anh}"
					alt="${s.hinh_anh }">
					
				</td> -->
				<td>${s.trang_thai?"Ton tai":"Khong ton tai"}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="initInsertSanPham">Them San Pham</a>
	<td><a href="deleteSanPham?id_san_pham=${s.id_san_pham}"
		onclick="return confirm('Sure?')">delete</a></td>
</body>
</html>