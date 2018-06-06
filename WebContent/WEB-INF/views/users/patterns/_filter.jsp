<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="col-3 product-option">
		<div class="row product-sort">
			<form action="sort-by-price.htm">
				<div class="form-group">
					<label for="sel">Sắp xếp theo:</label> <select class="form-control"
						id="sel" name="sellist">
						<option>Giá tăng dần</option>
						<option>Giá giảm dần</option>
					</select>
				</div>
			</form>
		</div>
		<div class="row product-filter">
			Chọn mức giá:
			<form class="mt-2" action="">
				<div class="form-check-inline">
					<label class="form-check-label" for="radio1"> <input
						type="radio" class="form-check-input" id="radio1" name="optradio"
						value="option1" checked>Tất cả
					</label>
				</div>
				<br>
				<div class="form-check-inline">
					<label class="form-check-label" for="radio2"> <input
						type="radio" class="form-check-input" id="radio2" name="optradio"
						value="option2">Dưới 1.000.000 đ
					</label>
				</div>
				<br>
				<div class="form-check-inline">
					<label class="form-check-label" for="radio3"> <input
						type="radio" class="form-check-input" id="radio3" name="optradio"
						value="option3">Từ 1.000.000 đ đến 2.000.000 đ
					</label>
				</div>
				<br>
				<div class="form-check-inline">
					<label class="form-check-label" for="radio4"> <input
						type="radio" class="form-check-input" id="radio4" name="optradio"
						value="option4">Từ 2.000.000 đ đến 5.000.000 đ
					</label>
				</div>
				<br>
				<div class="form-check-inline">
					<label class="form-check-label" for="radio5"> <input
						type="radio" class="form-check-input" id="radio5" name="optradio"
						value="option5">Từ 5.000.000 đ đến 10.000.000 đ
					</label>
				</div>
				<br>
				<div class="form-check-inline">
					<label class="form-check-label" for="radio6"> <input
						type="radio" class="form-check-input" id="radio6" name="optradio"
						value="option6">Trên 10.000.000 đ
					</label>
				</div>
			</form>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.2.1.slim.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$('input[name="optradio"]').on('change', function() {
			location.replace('home.htm?' + this.value);
		});
	</script>
</body>
</html>