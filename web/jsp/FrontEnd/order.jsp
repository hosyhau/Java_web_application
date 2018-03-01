<%-- 
    Document   : order
    Created on : May 23, 2017, 11:06:22 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Order</title>
        <link rel="stylesheet" type="text/css" href="/ProjectBkap/jsp/FrontEnd/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="/ProjectBkap/jsp/FrontEnd/css/order.css">
        <script type="text/javascript" src="/ProjectBkap/jsp/FrontEnd/js/bootstrap.js"></script>

    </head>
    <body>
        <nav class="navbar navbar-default" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->


                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav">
                        <li class=""><a href="#">+84 0967245822</a></li>
                        <li><a href="#">Contact to: hosyhau97haui@gmail.com</a></li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Take care of Custormer</a></li>
                        <li><a href="<%= request.getContextPath()%>/login/initLogin.htm">Login</a></li>
                        <li><a href="<%= request.getContextPath()%>/register/initInsertUser.htm">Register</a></li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div>
        </nav>
        <div class="top-header">
            <div class="container">
                <div class="top-header-main">
                    <div class="logo">
                        <a href="<%=request.getContextPath()%>/product/getAll.htm"><h1>Luxury Watches</h1></a>

                    </div>
                </div>
            </div>
        </div>
        <div class="order">
            <div class="container ">
                <div class="col-md-8 right-order">
                    <!-- <div class="title-order">
                            <h3 class="col-md-4">Địa chỉ giao hàng cho quý khách</h3>
                            <p class="col-md-4"><a href="#">Đăng nhập để đặt hàng</a></p>
                    </div>  -->
                    <div class="checkout-box _heading">
                        <h3 class="checkout-box _title">
                            Customer's Address for Shipping                          
                        </h3>
                        <a class="checkout-box _link-speedy-login" href="<%=request.getContextPath()%>/login/initLogin.htm">Login to Order</a>
                        <div class="checkout-box _message">
                        </div>
                    </div>
                    <div class="clear-fix"></div>
                    <form class="form-horizontal">
                        <div class="form-group">
                            <div class="col-md-2"></div>
                            <!-- <label class="control-label col-md-2" for="userName">userName:</label> -->
                            <div class="col-md-6">
                                <input type="text" class="form-control" id="userName" placeholder="User Name">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-2"></div>
                            <div class="col-md-6">
                                <input type="email" class="form-control" id="email" placeholder="Enter email">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-2"></div>
                            <div class="col-md-6">
                                <input type="text" class="form-control" id="address" placeholder="Enter address">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-2"></div>
                            <div class="col-md-6">
                                <input type="n" class="form-control" id="phone" placeholder="Enter phone">
                            </div>
                        </div>
                        <div class="form-group"> 
                            <div class="col-sm-offset-2 col-md-8">
                                <div class="checkbox">
                                    <label><input type="checkbox" id="check">If The Information for payment is different with the Address for Ship</label>
                                </div>
                            </div>
                        </div>
                        <div class="ship-order">
                            <h4>Infor about Ship</h4>
                            <p>Standard Ship:Free</p>
                            <p>Ship from Wednesday to Saturday 27-05-2017</p>
                        </div>
                        <div class="col-md-6 btn-order">
                            <input class="btn btn-primary btn-block" type="submit" value="Continue">

                        </div>
                    </form>

                </div>
                <div class="checkout-main _sidebar col-md-4 ch-container">
                    <div id="mini-cart" class="ch-box" style="position: relative; zoom: 1;">
                        <div class="order_sum_container">
                            
                            <form>
                                <h4 class="ch-main-title">Order's Information<span>(<%=request.getSession().getAttribute("totalProduct")%> product)</span></h4>
                                <div class="order_sum">
                                    <input type="hidden" name="num_cart_item" id="num_cart_item" value="1">

                                    <table class="order_scroll_table_header">
                                        <thead>
                                            <tr>
                                                <th class="left_align">Product</th>
                                                <th class="qty">Quantity</th>
                                                <th class="right_align">price</th>
                                            </tr>
                                        </thead>
                                    </table>
                                    <c:forEach items="<%=request.getSession().getAttribute("listCart")%>" var="c">
                                    <div class="order_scrollable">
                                        <table class="order_scroll_table">
                                            <tbody>
                                                <tr class=" first_item ">
                                                    <td>
                                                       ${c.product.productName} - Product Import 
                                                    </td>
                                                    <td class="qty">${c.quantity}</td>

                                                    <td class="right_align sel-cart-item-total-AP069ELAA1N89VVNAMZ-2713926">$ ${c.product.priceExport*c.quantity} </td>

                                                </tr>


                                            </tbody>
                                        </table>
                                    </div>
                                     </c:forEach>               
                                    <div class="ch-cart-conclusion">
                                        <div style="display: none;">
                                        </div>
                                        <table class="total_item">

                                            <tbody>
                                                <tr class="first_subtotal">
                                                    <td class="subtotal sel-subtotal"></td>
                                                    <td colspan="2" class="right_align">$<%=request.getSession().getAttribute("total")%> USD</td>
                                                </tr>
                                                <tr>
                                                    <td class="subtotal highlight shipping_cost_free">Ship Cost</td>
                                                    <td colspan="2" class="right_align highlight shipping_cost_free">Free</td>
                                                </tr>
                                                <tr class="total">
                                                    <td class="total">
                                                        <strong class="total-label">Total</strong>
                                                        <span class="vat-minicart">(Total for payment)</span>
                                                    </td>
                                                    <td colspan="2" class="total right_align sel-total"><strong class="total-price">$<%=request.getSession().getAttribute("total")%></strong>
                                                    </td>
                                                </tr>

                                            </tbody>
                                        </table>
                                    </div>
                                    
                                </div>
                            </form>
                           
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
