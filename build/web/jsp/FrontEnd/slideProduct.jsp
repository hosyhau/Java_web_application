<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    
    <div class="container">
        <h3>Top Sellers</h3>
        <div class="carousel-inner" role="listbox">
             <c:forEach var="product" items="${listTopSeller}">
            <div class="item active ">
               
                 <div class="col-md-3 product-left">
                                <div class="product-main simpleCart_shelfItem">
                                    <a href="initSingle.htm?productID=${product.productId}" class="mask"><img class="img-responsive zoom-img" src="${product.image}" alt="" /></a>
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
               
<!--                <div class="product-left  col-md-3">
                    <div class="product-main simpleCart_shelfItem">
                        <a href="single.html" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/h1.jpg" alt="" /></a>
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
                <div class="product-left  col-md-3">
                    <div class="product-main simpleCart_shelfItem">
                        <a href="single.html" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/h2.jpg" alt="" /></a>
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
                <div class="product-left  col-md-3">
                    <div class="product-main simpleCart_shelfItem">
                        <a href="single.html" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/h3.jpg" alt="" /></a>
                        <div class="product-bottom">
                            <h3>Smart Watches</h3>
                            <p>Explore Now</p>
                            <h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
                        </div>
                        <div class="srch">
                            <span>-50%</span>
                        </div>
                    </div>
                </div>-->
            </div>
              </c:forEach>
<!--            <div class="item">
                <div class="product-left  col-md-3">
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
                <div class="product-left  col-md-3">
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
                <div class="product-left  col-md-3">
                    <div class="product-main simpleCart_shelfItem">
                        <a href="single.html" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/h1.jpg" alt="" /></a>
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
                <div class="product-left  col-md-3">
                    <div class="product-main simpleCart_shelfItem">
                        <a href="single.html" class="mask"><img class="img-responsive zoom-img" src="/ProjectBkap/images/h1.jpg" alt="" /></a>
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
            </div>-->
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