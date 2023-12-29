<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>UPDATE CITY</h1>
	<h3 style="color: red">${err}</h3>
	<form:form action="updateBienThe" modelAttribute="b" method="post">
		<table>
			<tr>
				<td>Ten San Pham</td>
				<td><form:select path="sanpham.id_san_pham">
						<form:option value="">------- choose --------</form:option>
						<form:options items="${listSanPham }" itemLabel="ten_san_pham"
							itemValue="id_san_pham" />
					</form:select></td>
			</tr>
			<tr>
				<td>Hinh Anh</td>
				<td><form:input path="hinh_anh" /></td>
			</tr>
			<tr>
				<td>Mo Ta</td>
				<td><form:input path="mo_ta" /></td>
			</tr>
			<tr>
				<td>Ngay Nhap</td>
				<td><form:input path="ngay_nhap" type="date" /></td>
			</tr>
			<tr>
				<td>Luot Xem</td>
				<td><form:input path="luot_xem" /></td>
			</tr>
			<tr>
				<td>Don vi</td>
				<td><form:input path="don_vi" /></td>
			</tr>
			<tr>
				<td>Don gia</td>
				<td><form:input path="don_gia" /></td>
			</tr>
			<tr>
				<td>Gia Khuyen Mai</td>
				<td><form:input path="gia_khuyen_mai" /></td>
			</tr>
			<tr>
				<td>So Luong</td>
				<td><form:input path="so_luong" type="number" /></td>
			</tr>
			<tr>
				<td>Trang thai</td>
				<td><form:radiobutton path="trang_thai" value="true"
						label="Ton tai" /> <form:radiobutton path="trang_thai"
						value="false" label="Khong Ton tai" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Cap Nhat" /> <input
					type="reset" value="Xóa" /></td>
			</tr>
		</table>
	</form:form>
	<a href="listBienThe?id_bien_the=${b.id_bien_the}">Back</a>
</body>
</html>