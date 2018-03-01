<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
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
                <li><a href="#">Taking Care of Customer</a></li>
                <li id="demo"><a href="<%= request.getContextPath()%>/login/initLogin.htm">Login</a></li>
              <li id="demo"><a href="<%= request.getContextPath()%>/register/initInsertUser.htm">Register</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div>
</nav>
<div class="top-header">
    <div class="container">
        <div class="top-header-main">
            <div class="col-md-6 top-header-left">
                <div class="drop">
                    <div class="box">
                        <select tabindex="4" class="dropdown drop">
                            <option value="" class="label">Dollar :</option>
                            <option value="1">VND</option>
                            <option value="2">USD</option>
                        </select>
                    </div>
                    <div class="box1">
                        <select tabindex="4" class="dropdown">
                            <option value="" class="label">English :</option>
                            <option value="1">English</option>
                            <option value="2">VietNam</option>
                            <option value="3">German</option>
                        </select>
                    </div>

                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="col-md-6 top-header-left">
                <div class="cart box_1">
                    <a href="#">
                        <div class="total">
                            <span class="simpleCart_total"></span></div>
                        <img src="/ProjectBkap/images/cart-1.png" alt="" />
                    </a>
                    <span><a href="<%=request.getContextPath()%>/display/showCart.htm" class="simpleCart_empty">$<%=request.getSession().getAttribute("total")%></a></span>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="clearfix"></div>

        </div>
    </div>
</div>
<!--top-header-->
<!--start-logo-->
<div class="logo">
    <a href="<%=request.getContextPath()%>/product/getAll.htm"><h1>Luxury Watches</h1></a>

</div>
<!--start-logo-->
<!--bottom-header-->
<div class="header-bottom">
    <div class="container">
        <div class="header">
            <div class="col-md-9 header-left">
                <div class="top-nav">
                    <ul class="memenu skyblue"><li class="active"><a href="<%=request.getContextPath()%>/product/getAll.htm">Home</a></li>
                        <li class="grid"><a href="#">Men</a>
                            <div class="mepanel">
                                <div class="row">
                                    <div class="col1 me-one">
                                        <h4>Smart Watch</h4>
                                        <ul>
                                            <c:forEach var="cate" items="${listManufacter}">
                                                <li><a href="<%=request.getContextPath()%>/product/getManufacter.htm?Manufacter=${cate.manufacter}">${cate.manufacter}</a></li>
                                              </c:forEach>

                                        </ul>
                                    </div>
                                    <div class="col1 me-one">
                                        <h4>Trademark</h4>
                                        <ul>
                                            <c:forEach var="manu" items="${listManufacter_2}">
                                                <li><a href="#">${manu.manufacter}</a></li>
                                                </c:forEach>

                                        </ul>	
                                    </div>
                                    <div class="col1 me-one">
                                        <h4>Watch chain</h4>
                                        <ul>
                                            <c:forEach var="mater" items="${listMaterial}">
                                                <li><a href="#">${mater.material}</a></li>
                                                </c:forEach>

                                        </ul>		
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li class="grid"><a href="#">Women</a>
                            <div class="mepanel">
                                <div class="row">
                                    <div class="col1 me-one">
                                        <h4>Smart Watch</h4>
                                        <ul>
                                            <c:forEach var="cate" items="${listManufacter}">
                                                <li><a href="<%=request.getContextPath()%>/product/getManufacter.htm?Manufacter=${cate.manufacter}">${cate.manufacter}</a></li>
                                                </c:forEach>
                                        </ul>
                                    </div>
                                    <div class="col1 me-one">
                                        <h4>Trademark</h4>
                                        <ul>
                                            <c:forEach var="manu" items="${listManufacter_2}">
                                                <li><a href="#">${manu.manufacter}</a></li>
                                                </c:forEach>

                                        </ul>	
                                    </div>
                                    <div class="col1 me-one">
                                        <h4>Watch chain</h4>
                                        <ul>
                                            <c:forEach var="mater" items="${listMaterial}">
                                                <li><a href="#">${mater.material}</a></li>
                                                </c:forEach>

                                        </ul>		
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li class="grid"><a href="#">Kids</a>
                            <div class="mepanel">
                                <div class="row">
                                    <div class="col1 me-one">
                                        <h4>Smart Watch</h4>
                                        <ul>
                                            <c:forEach var="cate" items="${listManufacter}">
                                                <li><a href="#">${cate.manufacter}</a></li>
                                                </c:forEach>

                                        </ul>
                                    </div>
                                    <div class="col1 me-one">
                                        <h4>Trademark</h4>
                                        <ul>
                                            <c:forEach var="manu" items="${listManufacter_2}">
                                                <li><a href="#">${manu.manufacter}</a></li>
                                                </c:forEach>
                                        </ul>	
                                    </div>
                                    <div class="col1 me-one">
                                        <h4>Watch chain</h4>
                                        <ul>
                                            <c:forEach var="mater" items="${listMaterial}">
                                                <li><a href="#">${mater.material}</a></li>
                                                </c:forEach>


                                        </ul>		
                                    </div>
                                </div>
                            </div>
                        </li>
                        </li>
                        <li class="grid"><a href="<%=request.getContextPath()%>/register/initInsertUser.htm">Contact</a>

                        </li>
                    </ul>
                </div>
                <div class="clearfix"> </div>
            </div>


            <div class="col-md-3 header-right"> 
                <div class="search-bar">
                    <form action="byName.htm" method="post" >
                        <input type="text" placeholder="Search for..." name="productName" >
                        <input type="submit" value="">
                    </form>  
                </div>
            </div>

            <div class="clearfix"> </div>
        </div>
    </div>
</div>