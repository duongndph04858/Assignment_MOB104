<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.servletContext.contextPath}/">
<title>Đặt lại mật khẩu</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"> -->
</head>

<body>
	<div class="container">
		<jsp:include page="patterns/_head.jsp"></jsp:include>
		<jsp:include page="patterns/_menu.jsp"></jsp:include>
		<div class="row banner">
			<div id="carouselExampleIndicators" class="carousel slide"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img class="d-block w-100" src="images/index-banner1.jpg"
							alt="First slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" src="images/index-banner2.png"
							alt="Second slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" src="images/index-banner3.png"
							alt="Third slide">
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>
		<div style="margin: 15px" class="row">
			<div style="border-bottom: 1px solid #ccc;" class="col-4">
				<h4>Đặt lại mật khẩu</h4>
			</div>
		</div>
		<div style="margin-bottom: 15px" class="row">
			<div class="col-6">
				<form action="change-pass.htm">
					<div class="form-group row">
						<label for="newpass" class="col-3 col-form-label">Mật khẩu
							mới: </label>
						<div class="col-9">
							<input name="newpass" type="password" class="form-control"
								id="newpass">
						</div>
					</div>
					<div class="form-group row">
						<label for="renewpass" class="col-3 col-form-label">Nhập
							lại: </label>
						<div class="col-9">
							<input name="renewpass" type="password" class="form-control"
								id="renewpass">
						</div>
					</div>
					<div class="form-group row">
						<label for="maXacNhan" class="col-3 col-form-label">Mã xác
							nhận: </label>
						<div class="col-9">
							<input name="maXacNhan" type="text" class="form-control"
								id="maXacNhan">
						</div>
					</div>
					<div style="width: 100%" class="d-flex justify-content-center">
						<button type="submit" class="btn btn-primary">Đổi mật
							khẩu</button>
					</div>
				</form>
			</div>


		</div>
		<div style="margin-top: 10px" class="row footer">
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
</body>
</html>