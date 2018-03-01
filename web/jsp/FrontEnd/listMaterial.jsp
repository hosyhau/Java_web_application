<%-- 
    Document   : list
    Created on : May 17, 2017, 1:00:14 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="LinkFile.jsp"></jsp:include>
        </head>
        <body>

        <jsp:include page="header.jsp"></jsp:include>
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


        <jsp:include page="about.jsp"></jsp:include>
        
        <div class="product"> 
            <!--<h4 class="text">There are some Product for your search</h4>-->
            <div class="container">
                <%--<jsp:include page="checkbox.jsp"></jsp:include>--%>
                <div class="product-top">
                    <c:forEach var="product" items="${listMaterial}">
                        <div class="product-one">

                            <div class="col-md-3 product-left">
                                <div class="product-main simpleCart_shelfItem">
                                    <a href="../product/initSingle.htm?productID=${product.productId}" class="mask"><img class="img-responsive zoom-img" src="${product.image}" alt="" /></a>
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
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
