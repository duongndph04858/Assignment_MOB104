<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thông tin cá nhân</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"> -->
<link rel="stylesheet" href="css/index.css">
<style type="text/css">
.user-infor {
	height: 100px
}
</style>
</head>
<body>

	<div class="container">
		<jsp:include page="patterns/_head.jsp"></jsp:include>
		<jsp:include page="patterns/_menu.jsp"></jsp:include>
		<div style="margin-bottom: 15px" class="row">
			<div style="border-bottom: 1px solid #ccc;" class="col-4">
				<h4>Thông tin cá nhân</h4>
			</div>
		</div>
		<div class="row">
			<div class="col-6">
				<div class="row user-infor">
					<div class="col-3">Họ và tên:</div>
					<div class="col-9">${user.fullname }</div>
				</div>
				<div class="row user-infor">
					<div class="col-3">Địa chỉ:</div>
					<div class="col-9">${user.address }</div>
				</div>
				<div class="row user-infor">
					<div class="col-3">Điện thoại:</div>
					<div class="col-9">${user.phone }</div>
				</div>
			</div>
			<div class="col-6">
				<div class="row user-infor">
					<div class="col-3">Giới tính:</div>
					<div class="col-9">${((user.male)==true)?'Nam':'Nữ' }</div>
				</div>
				<div class="row user-infor">
					<div class="col-3">Email:</div>
					<div class="col-9">${user.address }</div>
				</div>
				<div class="row user-infor">
					<div class="col-3">Ngày sinh:</div>
					<div class="col-9">${user.birthday }</div>
				</div>
			</div>
		</div>
		<div class="row footer" style="margin-top: 240px;">
			<div class="col-2 logo-footer">
				<img src="images/logo.png" alt="">
			</div>
			<div class="col-7 info-footer">
				Công ty TNHH Công nghệ di động LVD - Tòa nhà FPT Polytechnic (Nhà
				H), Hàm Nghi, Mỹ Đình, Nam Từ Liêm, Hà Nội<br> Email:
				company@LVD.vn<br> Copyrights &copy; 2018 LVD.vn<br>
			</div>
			<div class="col-3 hotline-footer">
				<i class="fa fa-phone-square" aria-hidden="true"></i> <span>Hotline:
					1998 9794</span>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.2.1.slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<!-- <script
		src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"
		type="text/javascript"></script> -->
	<script src="js/validate.js"></script>
</body>
</html>