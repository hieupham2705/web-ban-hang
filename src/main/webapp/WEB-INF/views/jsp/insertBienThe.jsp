<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Them Chi Tiet San Pham</title>
</head>
<body>
	<h1>THÊM CHI TIET SẢN PHẨM</h1>
	<h3 style="color: red">${error}</h3>
	<form:form action="insertBienThe" modelAttribute="b" method="post">
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
				<td><input type="submit" value="Thêm" /> <input type="reset"
					value="Xóa" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>