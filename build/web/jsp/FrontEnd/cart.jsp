<%-- 
    Document   : checkOut.jsp
    Created on : Apr 24, 2017, 7:01:03 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="LinkFile.jsp"></jsp:include>
        </head>
        <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="breadcrumbs">
                <div class="container">
                    <div class="breadcrumbs-main">
                        <ol class="breadcrumb">
                            <li><a href="<%=request.getContextPath()%>/product/getAll.htm">Home</a></li>
                        <li class="active">Checkout</li>
                    </ol>
                </div>
            </div>
        </div>
        <!--start-ckeckout-->
        <div class="ckeckout">
            <div class="container">
                <div class="ckeck-top heading">
                    <h2>CHECKOUT</h2>
                </div>

             <form action="<%=request.getContextPath()%>/display/update.htm" method="post">
                <div class="in-check" >
                    <ul class="unit">
                        <li><span>Item</span></li>
                        <li><span>Product Name</span></li>		
                        <li><span>Total Price</span></li>
                        <li><span>Quantity<input type="submit" value="Update" class="fa fa-refresh"/></span></li>
                        <li> </li>
                        <div class="clearfix"> </div>
                    </ul>
                    <c:forEach items="<%=request.getSession().getAttribute("listCart")%>" var="c">

                        <ul class="cart-header">
                            
                            <li class="ring-in"><a href="<%= request.getContextPath()%>/product/initSingle.htm?productID=${c.product.productId}" ><img src="${c.product.image}" alt="" width="82" height="117"></a>
                            </li>
                            <li><span class="name">${c.product.productName}</span></li>
                            <li><span class="cost">$ ${c.product.priceExport*c.quantity}</span></li>
                            <li class="cart_quantity">
                                <div class="cart_quantity_button">
                                    <a class="cart_quantity_down" href="<%=request.getContextPath()%>/display/decrement.htm?productId=${c.product.productId}"> - </a>
                                    <input class="cart_quantity_input" type="text" name="quantity" value="${c.quantity}" autocomplete="off" size="2">
                                   <a class="cart_quantity_up" href="<%=request.getContextPath()%>/display/increment.htm?productId=${c.product.productId}"> + </a>

                                </div>
                            </li>
                            <a class="close1" href="<%= request.getContextPath()%>/display/remove.htm?productId=${c.product.productId} "onclick="return confirm('Are you Sure?')"></a>
                            <div class="clearfix"> </div>
                        </ul>

                    </c:forEach>

                </div>
             </form>
            </div>  
        </div>
    </div>
</div>
<!--end-ckeckout-->
<section id="do_action">
    <div class="container">
        <div class="heading">
            <h3>What would you like to do next?</h3>
            <p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <div class="chose_area">
                    <ul class="user_option">
                        <li>
                            <input type="checkbox">
                            <label>Use Coupon Code</label>
                        </li>
                        <li>
                            <input type="checkbox">
                            <label>Use Gift Voucher</label>
                        </li>
                        <li>
                            <input type="checkbox">
                            <label>Estimate Shipping & Taxes</label>
                        </li>
                    </ul>
                    <ul class="user_info">
                        <li class="single_field">
                            <label>Country:</label>
                            <select>
                                <option>Vietnam</option>
                                <option>China</option>
                                <option>Singapore</option>
                                <option>India</option>
                                <option>Thai Land</option>
                                <option>Malaysia</option>
                                <option>Indonesia</option>
                                <option>Dubai</option>
                            </select>

                        </li>
                        <li class="single_field">
                            <label>Region / State:</label>
                            <select>
                                <option>Hanoi</option>
                                <option>Beijing</option>
                                <option>Singapore</option>
                                <option>Delhi</option>
                                <option>Lahore</option>
                                <option>Kuala</option>
                                <option>Jacaranda</option>
                                <option>Dubai</option>
                            </select>

                        </li>
                        <li class="single_field zip-field">
                            <label>Zip Code:</label>
                            <input type="text">
                        </li>
                    </ul>
                    <a class="btn btn-default update" href="">Get Quotes</a>
                    <a class="btn btn-default check_out" href="<%=request.getContextPath()%>/product/getAll.htm">Continue Shopping</a>
                </div>
            </div>
            <div class="col-sm-6">
                <div class="total_area">
                    <ul>
                        <li>Cart Sub Total <span>$<%=request.getSession().getAttribute("total")%></span></li>
                        <li>Eco Tax <span>$2</span></li>
                        <li>Shipping Cost <span>Free</span></li>
                        <li>Total <span>$<%=request.getSession().getAttribute("total")%></span></li>
                    </ul>
                    <a class="btn btn-default update" href="">Update</a>
                    <a class="btn btn-default check_out" href="<%= request.getContextPath()%>/display/order.htm">Check Out</a>
                </div>
            </div>
        </div>
    </div>
</section><!--/#do_action-->
<div class="introduction">
    <div class="container">
        <div class="top-infor col-md-12">
            <div class="col-md-4 infor-center">
                <h4>Khi nào tôi nhận được hàng</h4>
                <p>Thời gian giao hàng dự kiến là thời gian được tính từ lúc đơn hàng được tạo đến lúc giao đến địa chỉ của quý khách.
                    Thời gian này bao gồm thời gian duyệt đơn hàng, thực hiện đơn hàng, cộng với thời gian giao hàng sau khi chuyển đơn hàng qua đơn hàng vận chuyển.</p>
            </div>
            <div class="col-md-4 infor-center">
                <h4>Hình thức thanh toán của Luxury</h4>
                <p>Nhằm mang đến trải nghiệm mua sắm tuyệt vời nhất cho khách hàng, Luxury cung cấp nhiều hình thức thanh toán đa dạng sau: Thanh toán khi nhận hàng; Thanh toán qua thẻ tín dụng, thẻ ghi nợ; Thanh toán qua cổng Smartlink/ 123PAY; Thanh toán trả góp qua thẻ tín dụng.</p>
            </div>
            <div class="col-md-4 infor-center">
                <h4>Luôn bảo vệ khách hàng của mình?</h4>
                <p>Luxury cam kết tất cả sản phẩm bán ra là mới 100%, chính hãng, không hư hỏng kỹ thuật hay vật lý.
                    Trong trường hợp sản phẩm không đáp ứng được 1 trong các điều kiện trên, quý khách có thể hoàn trả sản phẩm trong vòng 7 ngày để được hoàn tiền 100%.</p>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
