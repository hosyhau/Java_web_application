<%-- 
    Document   : listProduct
    Created on : Apr 24, 2017, 11:13:29 AM
    Author     : Neo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <jsp:include page="LinkFile.jsp"></jsp:include>			
        </head>
        <body>

            <!--top-header-->
        <jsp:include page="header.jsp"></jsp:include>
            <!--bottom-header-->
            <!--banner-starts-->
            <div class="bnr" id="home">
                <div  id="top" class="callbacks_container">
                    <ul class="rslides" id="slider4">
                        <li>
                            <img src="/ProjectBkap/images/bnr-1.jpg" alt=""/>
                        </li>
                        <li>
                            <img src="/ProjectBkap/images/bnr-2.jpg" alt=""/>
                        </li>
                        <li>
                            <img src="/ProjectBkap/images/bnr-3.jpg" alt=""/>
                        </li>
                    </ul>
                </div>
                <div class="clearfix"> </div>
            </div>
            <!--banner-ends--> 
            <!--Slider-Starts-Here-->
            <script src="/ProjectBkap/jsp/js/responsiveslides.min.js"></script>
            <script>
// You can also use "$(window).load(function() {"
                $(function () {
// Slideshow 4
                    $("#slider4").responsiveSlides({
                        auto: true,
                        pager: true,
                        nav: true,
                        speed: 500,
                        namespace: "callbacks",
                        before: function () {
                            $('.events').append("<li>before event fired.</li>");
                        },
                        after: function () {
                            $('.events').append("<li>after event fired.</li>");
                        }
                    });

                });
            </script>
            <!--End-slider-script-->


            <!--product-starts-->
        <jsp:include page="about.jsp"></jsp:include>

            <div class="product"> 
                <div class="container">

                    <div class="col-md-3 single-right">
                        <div class="w_sidebar">
                            <section  class="sky-form">
                                <h4>Catogories</h4>
                                <div class="row1 scroll-pane">
                                    <div class="col col-4">
                                        <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>All Accessories</label>
                                    </div>

                                    <div class="col col-4">	
                                    <c:forEach var="car" items="${listCategory}" >
                                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i><a href="<%=request.getContextPath()%>/product/getAllCategogy.htm?categoryId=${car.categoryId}">${car.categoryName}</a></label>
                                            </c:forEach>

                                </div>
                        </section>
                        <section  class="sky-form">
                            <h4>Brand</h4>
                            <div class="row1 row2 scroll-pane">

                                <div class="col col-4">
                                    <c:forEach var="product" items="${listMaterial}">
                                        <label class="checkbox"><input type="checkbox" name="checkbox"><i></i>${product.material}</label>
                                </c:forEach>

                                </div>
                            </div>
                        </section>
                        <section class="sky-form">
                            <h4>Colour</h4>
                            <ul class="w_nav2">
                                <li><a class="color1" href="#"></a></li>
                                <li><a class="color2" href="#"></a></li>
                                <li><a class="color3" href="#"></a></li>
                                <li><a class="color4" href="#"></a></li>
                                <li><a class="color5" href="#"></a></li>
                                <li><a class="color6" href="#"></a></li>
                                <li><a class="color7" href="#"></a></li>
                                <li><a class="color8" href="#"></a></li>
                                <li><a class="color9" href="#"></a></li>
                                <li><a class="color10" href="#"></a></li>
                                <li><a class="color12" href="#"></a></li>
                                <li><a class="color13" href="#"></a></li>
                                <li><a class="color14" href="#"></a></li>
                                <li><a class="color15" href="#"></a></li>
                                <li><a class="color5" href="#"></a></li>
                                <li><a class="color6" href="#"></a></li>

                            </ul>
                        </section>
                        <section class="sky-form">
                            <h4>Size</h4>
                            <div class="row1 row2 scroll-pane">

                                <div class="col col-4">
                                    <c:forEach var="size" items="${listSize}">
                                        <label class="radio"><input type="radio" name="radio"><i></i><a href="#">${size.size}</a></label>
                                            </c:forEach>


                                </div>
                            </div>						
                        </section>
                        <section class="sky-form">
                            <h4>Price</h4>
                            <div class="row1 row2 scroll-pane">
                                <div class="col col-4">
                                    <label class="radio"><input type="radio" name="radio" checked=""><i></i>60 % and above</label>
                                    <label class="radio"><input type="radio" name="radio"><i></i>50 % and above</label>
                                    <label class="radio"><input type="radio" name="radio"><i></i>40 % and above</label>
                                </div>
                                <div class="col col-4">
                                    <label class="radio"><input type="radio" name="radio"><i></i>30 % and above</label>
                                    <label class="radio"><input type="radio" name="radio"><i></i>20 % and above</label>
                                    <label class="radio"><input type="radio" name="radio"><i></i>10 % and above</label>
                                </div>
                            </div>						
                        </section>
                    </div>
                </div>
                <div class="product-top">
                    <c:forEach var="cate" items="${listCate}">
                        <div class="product-one">

                            <div class="col-md-3 product-left">
                                <div class="product-main simpleCart_shelfItem">
                                    <a href="initSingle.htm?productID=${cate.productId}" class="mask"><img class="img-responsive zoom-img" src="${cate.image}" alt="" /></a>
                                    <div class="product-bottom">
                                        <h3>${cate.productName}</h3>
                                        <p>${cate.content}</p>
                                        <h4><a class="item_add" href="<%=request.getContextPath()%>/display/addCart.htm?productId=${cate.productId}"><i></i></a> <span class=" item_price">$ ${cate.priceExport}</span></h4>
                                    </div>
                                    <div class="srch">
                                        <span>-${cate.discount}%</span>
                                    </div>
                                </div>
                            </div>

                        </div>	

                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- end product one
        -->
        <div class="clearfix"> </div>
        <div class="pagenatin">

            <div class="col-md-6 col-xs-6">
            </div>

            <div class="col-md-6 col-xs-6">
                <nav>
                    <ul class="pagination pagination-xs">
                        <li class="#"> <a href="">${url}</a></li>

                    </ul>
                </nav>
            </div>

        </div>
        <!--                            <div class="clearfix"> </div>-->


        <!-- end product one				 -->
        <!--        <div class="scrollToTop"><a href="#"></a></div>-->
        <a href="#" class="scrollToTop"></a>
        <jsp:include page="footer.jsp"></jsp:include>

        <!--footer-end-->	
    </body>

</html>
