<%-- 
    Document   : listPayment
    Created on : May 6, 2017, 6:34:43 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="/BackEndBkap/jsp/plugins/ionicons/css/ionicons.min.css" rel="stylesheet">
        <title>Neo Admin</title>
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="/BackEndBkap/jsp/plugins/materialize/css/materialize.min.css"  media="screen"/>
        <!-- dataTables -->
        <link href="/BackEndBkap/jsp/plugins/datatables/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css">
        <link href="/BackEndBkap/jsp/plugins/datatables/css/responsive.bootstrap.min.css" rel="stylesheet" type="text/css">
        <!--Template style-->
        <link href="/BackEndBkap/jsp/css/style.css" rel="stylesheet">
        </head>
        <body>
        <jsp:include page="header.jsp"></jsp:include>
            <main class="main-content">
                <div class="page-content">
                    <div class="row margin-b-0">
                        <div class="col s12">
                            <div class="card">                       
                                <div class="card-content">
                                    <span class="card-title">Payment</span> 
                                    <table id="datatable" class="bordered dt-responsive nowrap">
                                        <thead>
                                            <tr>
                                                <th>paymentId</th>
                                                <th>oderId</th>
                                                <th>createDate</th>
                                                <th>status</th>
                                                <th>paymentTypeId</th>
                                                <th>update</th>
                                                <th>delete</th>
                                            </tr>
                                        </thead>

                                     <tbody>
                                            <c:forEach var="payment" items="${listPayment}">
                                                <tr>
                                                    <td>${payment.paymentId}</td>
                                                    <td>${payment.orderId}</td>
                                                    <td>${payment.createDate}</td>
                                                    <td>${payment.status}</td>
                                                    <td>${payment.paymentTypeId}</td>
                                                    <td><a href="#">update</a></td>
                                                    <td><a href="#">delete</a></td>
                                                </tr>

                                            </c:forEach>
                                    </tbody>

                                    
                                </table>

                            </div>

                        </div><!--end cards-->
                    </div>
                </div><!--end row-->
            </div>
                 <a href="initInsertPayment.htm" class="col-md-6 btn btn-primary btn-block insert">New Payment</a>
        </main>
          <script type="text/javascript" src="/BackEndBkap/jsp/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/plugins/materialize/js/materialize.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/js/app.js"></script>
             <!-- Datatables-->
        <script src="/BackEndBkap/jsp/plugins/datatables/js/jquery.dataTables.min.js"></script>
        <script src="/BackEndBkap/jsp/plugins/datatables/js/dataTables.responsive.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#datatable').dataTable();
            });
        </script>
    </body>
</html>
