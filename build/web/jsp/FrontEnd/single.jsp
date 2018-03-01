<%-- 
    Document   : single.jsp
    Created on : Apr 24, 2017, 6:11:37 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <title>Luxury Watches A Ecommerce Category Flat Bootstarp Resposive Website Template</title>
        <link href="/ProjectBkap/jsp/FrontEnd/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
        <script src="/ProjectBkap/jsp/FrontEnd/js/jquery-1.11.0.min.js"></script>
        <!--Custom-Theme-files-->
        <!--theme-style-->
        <link href="/ProjectBkap/jsp/FrontEnd/css/style.css" rel="stylesheet" type="text/css" media="all" />	
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--start-menu-->
        <script src="/ProjectBkap/jsp/FrontEnd/js/simpleCart.min.js"></script>
        <link href="/ProjectBkap/jsp/FrontEnd/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="/ProjectBkap/jsp/FrontEnd/js/memenu.js"></script>
        <script>$(document).ready(function () {
    $(".memenu").memenu();
});</script>	
      
        <script src="/ProjectBkap/jsp/FrontEnd/js/jquery.easydropdown.js"></script>	
        <script type="text/javascript">
$(function () {

    var menu_ul = $('.menu_drop > li > ul'),
            menu_a = $('.menu_drop > li > a');

    menu_ul.hide();

    menu_a.click(function (e) {
        e.preventDefault();
        if (!$(this).hasClass('active')) {
            menu_a.removeClass('active');
            menu_ul.filter(':visible').slideUp('normal');
            $(this).addClass('active').next().stop(true, true).slideDown('normal');
        } else {
            $(this).removeClass('active');
            $(this).next().stop(true, true).slideUp('normal');
        }
    });

});
        </script>		
    </head>
    <body>
        <jsp:include page="headerSingle.jsp"></jsp:include>

            <!--start-breadcrumbs-->
            <div class="breadcrumbs">
                <div class="container">
                    <div class="breadcrumbs-main">
                        <ol class="breadcrumb">
                            <li><a href="<%=request.getContextPath()%>/product/getAll.htm">Home</a></li>
                            <li class="active">Single</li>
                        </ol>
                    </div>
                </div>
            </div>
            <!--end-breadcrumbs-->
            <!--start-single-->
            <div class="single contact">
                <div class="container">
                    <div class="single-main">
                        <div class="col-md-9 single-main-left">
                            <div class="sngl-top">
                                <div class="col-md-5 single-top-left">	
                                    <div class="flexslider">
                                        <ul class="slides">
                                            <c:forEach var="image" items="${listImage}">
                                                 <li data-thumb="/ProjectBkap/images/${image.URL}">
                                                <div class="thumb-image"> <img src="/ProjectBkap/images/${image.URL}" data-imagezoom="true" class="img-responsive" alt=""/> </div>
                                            </li>
                                            </c:forEach>
                                           
<!--                                            <li data-thumb="/ProjectBkap/images/s-2.jpg">
                                                <div class="thumb-image"> <img src="/ProjectBkap/images/s-2.jpg" data-imagezoom="true" class="img-responsive" alt=""/> </div>
                                            </li>
                                            <li data-thumb="/ProjectBkap/images/s-3.jpg">
                                                <div class="thumb-image"> <img src="/ProjectBkap/images/s-3.jpg" data-imagezoom="true" class="img-responsive" alt=""/> </div>
                                            </li> -->
                                        </ul>
                                    </div>
                                    <!-- FlexSlider -->
                                    <script src="/ProjectBkap/jsp/FrontEnd/js/imagezoom.js"></script>
                                    <script defer src="/ProjectBkap/jsp/FrontEnd/js/jquery.flexslider.js"></script>
                                    <link rel="stylesheet" href="/ProjectBkap/jsp/FrontEnd/css/flexslider.css" type="text/css" media="screen" />

                                    <script>
// Can also be used with $(document).ready()
$(window).load(function () {
    $('.flexslider').flexslider({
        animation: "slide",
        controlNav: "thumbnails"
    });
});
                                    </script>
                                </div>	
                                <div class="col-md-7 single-top-right">
                                    <div class="single-para simpleCart_shelfItem">
                                        <h2>${single.productName}</h2>
                                        <div class="star-on">
                                            <ul class="star-footer">
                                                <li><a href="#"><i> </i></a></li>
                                                <li><a href="#"><i> </i></a></li>
                                                <li><a href="#"><i> </i></a></li>
                                                <li><a href="#"><i> </i></a></li>
                                                <li><a href="#"><i> </i></a></li>
                                            </ul>
                                            <div class="review">
                                                <a href="#"> ${single.viewOfProduct} customer review </a>

                                            </div>
                                            <div class="clearfix"> </div>
                                        </div>

                                        <h5 class="item_price">$ ${single.priceExport}</h5>
                                        <p> ${single.content}.</p>
                                        <div class="available">
                                            <ul>
                                                <li>Color
                                                    <select>
                                                        <option>${single.colorName}</option>
                                                    </select></li>
                                                <li class="size-in">Size<select>
                                                        <option>${single.size}</option>
                                                        
                                                    </select></li>
                                                <div class="clearfix"> </div>
                                            </ul>
                                        </div>
                                        <ul class="tag-men">
                                            <li><span>TAG</span>
                                                <span class="women1">: Women,</span></li>
                                            <li><span>SKU</span>
                                                <span class="women1">: CK09</span></li>
                                        </ul>
                                        <a href="<%=request.getContextPath()%>/display/addCart.htm?productId=${single.productId}" class="add-cart item_add">ADD TO CART</a>

                                    </div>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                            <div class="tabs">
                                <ul class="menu_drop">
                                    <li class="item1"><a href="#"><img src="/ProjectBkap/images/arrow.png" alt="">Description</a>
                                        <ul>
                                            <li class="subitem1"><a href="#">${single.contentDetail}.</a></li>
                                            <li class="subitem2"><a href="#"> ${single.contentDetail}</a></li>
                                            <li class="subitem3"><a href="#">${single.contentDetail} </a></li>
                                        </ul>
                                    </li>
                                    <li class="item2"><a href="#"><img src="/ProjectBkap/images/arrow.png" alt="">Additional information</a>
                                        <ul>
                                            <li class="subitem2"><a href="#"> ${single.contentDetail}</a></li>
                                            <li class="subitem3"><a href="#">${single.contentDetail} </a></li>
                                        </ul>
                                    </li>
                                    <li class="item3"><a href="#"><img src="/ProjectBkap/images/arrow.png" alt="">Reviews (10)</a>
                                        <ul>
                                            <li class="subitem1"><a href="#">${single.contentDetail}.</a></li>
                                            <li class="subitem2"><a href="#"> ${single.contentDetail}.</a></li>
                                            <li class="subitem3"><a href="#">${single.contentDetail}.</a></li>
                                        </ul>
                                    </li>
                                    <li class="item4"><a href="#"><img src="/ProjectBkap/images/arrow.png" alt="">Helpful Links</a>
                                        <ul>
                                            <li class="subitem2"><a href="#"> ${single.contentDetail}.</a></li>
                                            <li class="subitem3"><a href="#">${single.contentDetail}. </a></li>
                                        </ul>
                                    </li>
                                    <li class="item5"><a href="#"><img src="/ProjectBkap/images/arrow.png" alt="">Make A Gift</a>
                                        <ul>
                                            <li class="subitem1"><a href="#">${single.contentDetail}.</a></li>
                                            <li class="subitem2"><a href="#"> ${single.contentDetail}.</a></li>
                                            <li class="subitem3"><a href="#">${single.contentDetail}. </a></li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>

                            <div class="latestproducts">
                                <div class="product-one">
                                    <div class="col-md-4 product-left p-left"> 
                                        <div class="product-main simpleCart_shelfItem">
                                            <a href="single.html" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/p-1.png" alt="" /></a>
                                            <div class="product-bottom">
                                                <h3>Smart Watches</h3>
                                                <p>Explore Now</p>
                                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                                            </div>
                                            <div class="srch">
                                                <span>-50%</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 product-left p-left"> 
                                        <div class="product-main simpleCart_shelfItem">
                                            <a href="single.html" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/p-2.png" alt="" /></a>
                                            <div class="product-bottom">
                                                <h3>Smart Watches</h3>
                                                <p>Explore Now</p>
                                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                                            </div>
                                            <div class="srch">
                                                <span>-50%</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-4 product-left p-left"> 
                                        <div class="product-main simpleCart_shelfItem">
                                            <a href="single.html" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/p-3.png" alt="" /></a>
                                            <div class="product-bottom">
                                                <h3>Smart Watches</h3>
                                                <p>Explore Now</p>
                                                <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                                            </div>
                                            <div class="srch">
                                                <span>-50%</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                            </div>
                        </div>
                        <!-- phần check bock -->
                    <%--<jsp:include page="checkBox.jsp"></jsp:include>--%>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
            <!--end-single-->
            <!--information-starts-->
        <jsp:include page="footer.jsp"></jsp:include>
        <!--footer-end-->	
    </body>


</html>
