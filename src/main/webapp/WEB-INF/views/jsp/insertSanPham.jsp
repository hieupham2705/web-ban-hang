<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Them San Pham</title>
</head>
<body>
	<h1>THÊM SẢN PHẨM</h1>
	<h3 style="color: red">${error}</h3>
	<form:form action="insertSanPham" modelAttribute="s" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>Danh Muc San Pham</td>
				<td><form:select path="danhmucsanpham.id_danh_muc">
						<form:option value="">------- choose --------</form:option>
						<form:options items="${listDanhMuc }" itemLabel="ten_danh_muc"
							itemValue="id_danh_muc" />
					</form:select></td>
			</tr>
			<tr>
				<td>Ten San Pham</td>
				<td><form:input path="ten_san_pham" /></td>
			</tr>
			<tr>
				<td>Hinh anh</td>
				<td><input type="file" name="imgFile"></td>
			</tr>
			<tr>
				<td>Trang Thai</td>
				<td><form:radiobutton path="trang_thai" value="true" />Ton tai
					<form:radiobutton path="trang_thai" value="false" />Khong Ton tai</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Thêm" /> <input type="reset"
					value="Xóa" /></td>
			</tr>
		</table>
		<a href="initInsertBienThe">Them Chi tiet San Pham</a>
	</form:form>
</body>
</html>