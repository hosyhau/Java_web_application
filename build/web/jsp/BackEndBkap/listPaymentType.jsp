<%-- 
    Document   : listPaymentType
    Created on : May 15, 2017, 11:25:25 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                                <span class="card-title">Payment Type</span> 
                                <table id="datatable" class="bordered dt-responsive nowrap">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Name</th>
                                            <th>Number</th>
                                            <th>Status</th>                                         
                                             <th>update</th>
                                             <th>delete</th>
                                        </tr>
                                    </thead>
                              
                                    <tbody>
                                      <c:forEach var="paymenttype" items="${listPaymentType}">
                                        <tr>
                                            <td>${paymenttype.paymentTypeId}</td>
                                            <td>${paymenttype.paymentName}</td>
                                            <td>${paymenttype.displayNumber}</td>
                                            <td>${paymenttype.status}</td>
                                            <td><a href="<%= request.getContextPath()%>/paymentType/initUpdatePaymentType.htm?paymentTypeID=${paymenttype.paymentTypeId}">update</a></td>
                                            <td><a href="<%= request.getContextPath()%>/paymentType/deletePaymentType.htm?paymentTypeID=${paymenttype.paymentTypeId}">delete</a></td>
                                        </tr>
                                       
                                      </c:forEach>
                                    </tbody>
                                </table>

                            </div>

                        </div><!--end cards-->
                    </div>
                </div><!--end row-->
            </div>
             <a href="initInsertPaymentType.htm" class="col-md-6 btn btn-primary btn-block insert">New PaymentType</a>
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
