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
                            <img src="/ProjectBkap/jsp/FrontEnd/images/bnr-1.jpg" alt=""/>
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
            <script src="/ProjectBkap/jsp/FrontEnd/js/responsiveslides.min.js"></script>
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

            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">

                <div class="container">
                    <h3>Top Sellers</h3>
                    <div class="carousel-inner" role="listbox">
                        <div class="item active ">
                        <c:forEach var="pro" items="${listTopSeller}">
                            <div class="col-md-3 product-left">
                                <div class="product-main simpleCart_shelfItem">
                                    <a href="initSingle.htm?productID=${pro.productId}" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/${pro.image}" alt="" /></a>
                                    <div class="product-bottom">
                                        <h3>${pro.productName}</h3>
                                        <p>${pro.content}</p>
                                        <h4><a class="item_add" href="<%=request.getContextPath()%>/display/addCart.htm?productId=${pro.productId}"><i></i></a> <span class=" item_price">$ ${pro.priceExport}</span></h4>
                                    </div>
                                    <div class="srch">
                                        <span>-${pro.discount}%</span>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>  
                       </div>
                        <div class="item">
                            <c:forEach var="pro" items="${listTopSeller}">
                            <div class="col-md-3 product-left">
                                <div class="product-main simpleCart_shelfItem">
                                    <a href="initSingle.htm?productID=${pro.productId}" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/${pro.image}" alt="" /></a>
                                    <div class="product-bottom">
                                        <h3>${pro.productName}</h3>
                                        <p>${pro.content}</p>
                                        <h4><a class="item_add" href="<%=request.getContextPath()%>/display/addCart.htm?productId=${pro.productId}"><i></i></a> <span class=" item_price">$ ${pro.priceExport}</span></h4>
                                    </div>
                                    <div class="srch">
                                        <span>-${pro.discount}%</span>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>  
                        </div>

                    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                        <span class="icon-prev" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                        <span class="icon-next" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
        </div>

        <div class="product"> 
            <div class="container">
                <jsp:include page="checkBox.jsp"></jsp:include>
                    <div class="product-top">
                    <c:forEach var="product" items="${listProduct}">
                        <div class="product-one">

                            <div class="col-md-3 product-left">
                                <div class="product-main simpleCart_shelfItem">
                                    <a href="initSingle.htm?productID=${product.productId}" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/${product.image}" alt="" /></a>
                                    <div class="product-bottom">
                                        <h3>${product.productName}</h3>
                                        <p>${product.content}</p>
                                        <h4><a class="item_add" href="<%=request.getContextPath()%>/display/addCart.htm?productId=${product.productId}"><i></i></a> <span class=" item_price">$ ${product.priceExport}</span></h4>
                                    </div>
                                    <div class="srch">
                                        <span>-${product.discount}%</span>
                                    </div>
                                </div>
                            </div>

                        </div>	

                    </c:forEach>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <!-- end product one
        -->
        
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
