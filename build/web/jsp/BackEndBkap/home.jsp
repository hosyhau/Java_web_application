<%-- 
    Document   : home.jsp
    Created on : May 5, 2017, 1:29:23 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Admin NEO</title>
        <jsp:include page="head.jsp"></jsp:include>
        
    </head>
        <body>
        <jsp:include page="header.jsp"></jsp:include>
        <aside id="right-sidebar" class="side-nav  white right-sidebar-panel">
            <div class="side-nav-wrapper">
                <ul class="chat-list">
                    <li class="chat-item clearfix">
                        <a href="#">
                            <img src="/BackEndBkap/images/avatar-01.png" alt="" width="40" class="left">
                            <div class="overflow-hidden">
                                <h5>John Doe</h5>
                                <span class="green-text">Online</span>
                            </div>
                        </a>
                    </li><!--end chat item-->
                    <li class="chat-item clearfix">
                        <a href="#">
                            <img src="/BackEndBkap/images/avatar-02.png" alt="" width="40" class="left">
                            <div class="overflow-hidden">
                                <h5>David villa</h5>
                                <span class="red-text">Offline</span>
                            </div>
                        </a>
                    </li><!--end chat item-->
                    <li class="chat-item clearfix">
                        <a href="#">
                            <img src="/BackEndBkap/images/avatar-03.png" alt="" width="40" class="left">
                            <div class="overflow-hidden">
                                <h5>John Abraham</h5>
                                <span class="grey-text">Active 3h ago</span>
                            </div>
                        </a>
                    </li><!--end chat item-->
                    <li class="chat-item clearfix">
                        <a href="#">
                            <img src="/BackEndBkap/images/avatar-04.png" alt="" width="40" class="left">
                            <div class="overflow-hidden">
                                <h5>Johnny Liver</h5>
                                <span class="green-text">Online</span>
                            </div>
                        </a>
                    </li><!--end chat item-->
                    <li class="chat-item clearfix">
                        <a href="#">
                            <img src="/BackEndBkap/images/avatar-05.png" alt="" width="40" class="left">
                            <div class="overflow-hidden">
                                <h5>Mark Wough</h5>
                                <span class="green-text">Online</span>
                            </div>
                        </a>
                    </li><!--end chat item-->
                    <li class="chat-item clearfix">
                        <a href="#">
                            <img src="/BackEndBkap/images/avatar-06.png" alt="" width="40" class="left">
                            <div class="overflow-hidden">
                                <h5>Adam Smith</h5>
                                <span class="red-text">Offline</span>
                            </div>
                        </a>
                    </li><!--end chat item-->
                    <li class="chat-item clearfix">
                        <a href="#">
                            <img src="/BackEndBkap/images/avatar-07.png" alt="" width="40" class="left">
                            <div class="overflow-hidden">
                                <h5>Rakesh sharma</h5>
                                <span class="grey-text">Active 3h ago</span>
                            </div>
                        </a>
                    </li><!--end chat item-->
                </ul><!--end chat list-->
                <div class="center-align">
                    <a href="#" class="btn waves-effect waves-light teal">Load More...</a>
                </div>
            </div>
        </aside>
        <!--\\\\\\\\\\\\\\\\\\\\\\\\\\\\Right sidebar End\\\\\\\\\\\\\\\\\\\\\\\-->


        <!--\\\\\\\\\\\\\\\\\\\\\\\\\\\\Main content Start\\\\\\\\\\\\\\\\\\\\\\\-->
        <main class="main-content">
            <div class="page-content">
                
                <div class="col-md-12 home" style="font-size: 20px;text-transform: uppercase;">
                    <p style="text-align: center"> Welcome to my Manager website project Buying watch in Bach Khoa Aptech </p>
                </div>
           
                
            </div>
        </main>
        <script type="text/javascript" src="/ProjectBkap/jsp/BackEndBkap/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="/ProjectBkap/jsp/BackEndBkap/js/bootstrap.js"></script>
        <script type="text/javascript" src="/ProjectBkap/jsp/BackEndBkap/plugins/materialize/js/materialize.min.js"></script>
        <script type="text/javascript" src="/ProjectBkap/jsp/BackEndBkap/js/app.js"></script>
        <!-- Morris -->
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/morris/raphael-2.1.0.min.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/vplugins/morris/morris.js"></script>
        <!-- FLOT CHART-->       
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/flot/jquery.flot.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/flot/jquery.flot.tooltip.min.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/flot/jquery.flot.resize.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/flot/jquery.flot.pie.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/flot/jquery.flot.time.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/flot/jquery.flot.categories.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/flot/jquery.flot.spline.min.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/js/dashboard-1.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/datatables/js/jquery.dataTables.min.js"></script>
        <script src="/ProjectBkap/jsp/BackEndBkap/plugins/datatables/js/dataTables.responsive.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#datatable').dataTable();
            });
        </script>
    </body>
</html>
