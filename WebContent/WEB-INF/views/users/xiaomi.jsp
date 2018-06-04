<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>LVD - HomePage</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/product.css">
</head>
<body>
	
    <div class="container">
         <jsp:include page="patterns/_head.jsp"></jsp:include>
        <div class="row menu">
            <ul class="nav nav-pills">
                <li class="nav-item">
                    <a class="nav-link" href="home.htm">
                        <i class="fa fa-home"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="oppo.htm">OPPO</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="iphone.htm">IPHONE</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="samsung.htm">SAMSUNG</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="sony.htm">SONY</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="xiaomi.htm">XIAOMI</a>
                </li>
            </ul>
        </div>
        <div class="row banner">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="images/index-banner1.jpg" alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/index-banner2.png" alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="images/index-banner3.png" alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <div class="row list">
            <div class="col-3 product-option">
                <div class="row product-sort">
                    <form action="">
                        <div class="form-group">
                            <label for="sel">Sắp xếp theo:</label>
                            <select class="form-control" id="sel" name="sellist">
                                <option>Giá tăng dần</option>
                                <option>Giá giảm dần</option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-primary">Sắp xếp</button>
                    </form>
                </div>
                <div class="row product-filter">
                    Chọn mức giá:
                    <form class="mt-2" action="">
                        <div class="form-check-inline">
                            <label class="form-check-label" for="radio1">
                                <input type="radio" class="form-check-input" id="radio1" name="optradio" value="option1" checked>Tất cả
                            </label>
                        </div><br>
                        <div class="form-check-inline">
                            <label class="form-check-label" for="radio2">
                                <input type="radio" class="form-check-input" id="radio2" name="optradio" value="option2">Dưới 1.000.000 đ
                            </label>
                        </div><br>
                        <div class="form-check-inline">
                            <label class="form-check-label" for="radio3">
                                <input type="radio" class="form-check-input" id="radio3" name="optradio" value="option3">Từ 1.000.000 đ đến 2.000.000 đ
                            </label>
                        </div><br>
                        <div class="form-check-inline">
                            <label class="form-check-label" for="radio4">
                                <input type="radio" class="form-check-input" id="radio4" name="optradio" value="option4">Từ 2.000.000 đ đến 5.000.000 đ
                            </label>
                        </div><br>
                        <div class="form-check-inline">
                            <label class="form-check-label" for="radio5">
                                <input type="radio" class="form-check-input" id="radio5" name="optradio" value="option5">Từ 5.000.000 đ đến 10.000.000 đ
                            </label>
                        </div><br>
                        <div class="form-check-inline">
                            <label class="form-check-label" for="radio6">
                                <input type="radio" class="form-check-input" id="radio6" name="optradio" value="option6">Trên 10.000.000 đ
                            </label>
                        </div><br>
                        <button type="submit" class="btn btn-primary">Lọc</button>
                    </form>
                </div>
            </div>
            <div class="col-9">
                <div class="row product-list">
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="product-div">
                            <img src="images/sp1.png" alt="">
                            <div class="product-title">
                                iPhone X
                            </div>
                            <div class="product-price">
                                29.990.000 đ
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- <div class="row page-navigation">
            <nav aria-label="Page navigation example">
                <ul class="pagination justify-content-center">
                    <li class="page-item">
                        <a class="page-link" href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                            <span class="sr-only">Previous</span>
                        </a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">1</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">2</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#">3</a>
                    </li>
                    <li class="page-item">
                        <a class="page-link" href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                            <span class="sr-only">Next</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div> -->
        <div class="row footer">
            <div class="col-2 logo-footer">
                <img src="images/logo.png" alt="">
            </div>
            <div class="col-7 info-footer">
                Công ty TNHH Công nghệ di động LVD - Tòa nhà FPT Polytechnic (Nhà H), Hàm Nghi, Mỹ Đình, Nam Từ Liêm, Hà Nội
                <br> Email: company@LVD.vn
                <br> Copyrights &copy; 2018 LVD.vn
                <br>
            </div>
            <div class="col-3 hotline-footer">
                <i class="fa fa-phone-square" aria-hidden="true"></i>
                <span>Hotline: 1998 9794</span>
            </div>
        </div>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
	
</body>
</html>