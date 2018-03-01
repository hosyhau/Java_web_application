<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li class="sidebar-search">
                <div class="input-group custom-search-form">
                    <input type="text" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">
                            <i class="fa fa-search"></i>
                        </button>
                    </span>
                </div>
                <!-- /input-group -->
            </li>
            <li>
            <li>
                <a href="#"><i class="fa fa-dashboard fa-fw"></i> Manager Catalog</a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="<%= request.getContextPath() %>/image/getAllI.htm"> ImageLink</a>
                    </li>
                    <li>
                        <a href="<%= request.getContextPath() %>/cate/getAllC.htm"> Category</a>
                        <!--<span class="fa arrow"></span>-->
                    </li>
                    <li>
                        <a href="<%= request.getContextPath() %>/color/getAllCo.htm">Color </a>
                    </li>
                    
                </ul>
            </li>
            <li>
                <a href="getAllProduct.htm"><i class="fa fa-bar-chart-o fa-fw"></i> Product</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-table fa-fw"></i> Manager More</a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="<%= request.getContextPath() %>/order/getAllO.htm">Order</a>
                    </li>
                    <li>
                        <a href="<%= request.getContextPath() %>/orderDetail/getAllOD.htm">OrderDetail</a>
                    </li>
                     <li><a href="<%= request.getContextPath() %>/ship/getAllS.htm">Ship</a></li>
                    <li>
                        <a href="<%= request.getContextPath() %>/paymentType/getAllPT.htm">PaymentType </a>
                    </li>
                    <li>
                        <a href="<%= request.getContextPath() %>/payment/getAllP.htm">Payment </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#"><i class="fa fa-edit fa-fw"></i> Manager more User</a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="<%= request.getContextPath()%>/user/getAllU.htm">Manager User</a>
                    </li>
                    <li>
                        <a href="getAllComment.htm">Comment</a>
                    </li>
                    
                </ul>
            </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>