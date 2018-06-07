<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/product-information.css">
<link rel="stylesheet" href="css/cart.css">
<title>Giỏ hàng</title>
</head>
<body>
	<div class="container">
		<jsp:include page="patterns/_head.jsp"></jsp:include>
		<div class="row menu">
			<ul class="nav nav-pills">
				<li class="nav-item"><a class="nav-link" href="home.htm"> <i
						class="fa fa-home"></i>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="oppo.htm">OPPO</a>
				</li>
				<li class="nav-item"><a class="nav-link " href="iphone.htm">IPHONE</a></li>
				<li class="nav-item"><a class="nav-link" href="samsung.htm">SAMSUNG</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="sony.htm">SONY</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="xiaomi.htm">XIAOMI</a>
				</li>
			</ul>
		</div>
		<div class="row">
			<div style="padding: 0; padding-right: 5px" class="col-6 banner">
				<div id="banner1" class="carousel slide" data-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img class="d-block w-100" src="images/banner1.png"
								alt="First slide">
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src="images/banner2.png"
								alt="Second slide">
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src="images/banner3.png"
								alt="Third slide">
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src="images/banner4.png"
								alt="Forth slide">
						</div>
						<a class="carousel-control-prev" href="#banner1" role="button"
							data-slide="prev"> <span class="carousel-control-prev-icon"
							aria-hidden="true"></span> <span class="sr-only">Previous</span>
						</a> <a class="carousel-control-next" href="#banner1" role="button"
							data-slide="next"> <span class="carousel-control-next-icon"
							aria-hidden="true"></span> <span class="sr-only">Next</span>
						</a>
					</div>
				</div>
			</div>
			<div style="padding: 0; padding-left: 5px" class="col-6 banner">
				<div id="banner2" class="carousel slide" data-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img class="d-block w-100" src="images/banner5.png"
								alt="First slide">
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src="images/banner6.png"
								alt="Second slide">
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src="images/banner7.png"
								alt="Third slide">
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src="images/banner8.png"
								alt="Forth slide">
						</div>
						<a class="carousel-control-prev" href="#banner2" role="button"
							data-slide="prev"> <span class="carousel-control-prev-icon"
							aria-hidden="true"></span> <span class="sr-only">Previous</span>
						</a> <a class="carousel-control-next" href="#banner2" role="button"
							data-slide="next"> <span class="carousel-control-next-icon"
							aria-hidden="true"></span> <span class="sr-only">Next</span>
						</a>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div style="margin-top: 20px; width: 100%" class="row">
				<a class="product-name">Giỏ hàng</a>
			</div>
			<div class="row th">
				<table align="center" class="table table-striped">
					<thead>
						<tr align="center">
							<th scope="col">STT</th>
							<th scope="col">Hình ảnh</th>
							<th scope="col">Tên sản phẩm</th>
							<th scope="col">Số lượng</th>
							<th scope="col">Đơn giá</th>
							<th scope="col">Thành tiền</th>
							<th></th>
						</tr>
					</thead>
					<tbody align="center">
						<c:forEach var="p" items="${shop }">
							<tr>

								<th scope="row">1</th>
								<td class="cart-img-product"><img
									src="images/${p.value.product.product_colors.get(0).img_front }"
									alt="" class="img-fluid"></td>
								<td>${p.value.product.name }</td>
								<td>100000000</td>
								<td>100000000</td>
								<td><i class="fa fa-trash-o" aria-hidden="true"></i></td>
							</tr>
						</c:forEach>
						<tr>
							<th scope="row">1</th>
							<td class="cart-img-product"><img src="images/sp1.png"
								alt="" class="img-fluid"></td>
							<td>something</td>
							<td>1</td>
							<td>100000000</td>
							<td>100000000</td>
							<td><i class="fa fa-trash-o" aria-hidden="true"></i></td>
						</tr>
						<tr>
							<th scope="row">1</th>
							<td class="cart-img-product"><img src="images/sp1.png"
								alt="" class="img-fluid"></td>
							<td>something</td>
							<td>1</td>
							<td style="display: table-cell; vertical-align: inherit">100000000</td>
							<td>100000000</td>
							<td><i class="fa fa-trash-o" aria-hidden="true"></i></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row page-navigation justify-content-center">
			<nav aria-label="Page navigation example">
			<ul class="pagination ">
				<li class="page-item"><a class="page-link" href="#"
					aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
						<span class="sr-only">Previous</span>
				</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#"
					aria-label="Next"> <span aria-hidden="true">&raquo;</span> <span
						class="sr-only">Next</span>
				</a></li>
			</ul>
			</nav>
		</div>
		<div class="row footer">
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
	<script src="js/validate.js"></script>
</body>
</html>