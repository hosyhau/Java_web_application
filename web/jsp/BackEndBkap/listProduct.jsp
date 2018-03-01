<%-- 
    Document   : listProduct.jsp
    Created on : May 6, 2017, 6:33:01 PM
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
                                    <span class="card-title">Product</span> 
                                    <table id="datatable" class="bordered dt-responsive nowrap">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>Name</th>
                                                <th>Price</th>
                                                <th>Quantity</th>
                                                <th>colorId</th>
                                                <th>cateId</th>
                                                <th>status</th>
                                                <th>Country</th>
                                                <th>Year</th>
                                                <th>Size</th>
                                                <th>Material</th>
                                                <th>Discount</th>
                                                <th>Guarantee</th>
                                                <th>Pin</th>
                                                <th>Shape</th>
                                                <th>Rate</th>
                                                <th>image</th>
                                                <th>update</th>
                                                <th>delete</th>
                                            </tr>
                                        </thead>

                                        <tbody>
                                        <c:forEach var="product" items="${listProduct}">
                                            <tr>
                                                <td>${product.productId}</td>
                                                <td>${product.productName}</td>
                                                <td>${product.priceExport}</td>
                                                <td>${product.quantity}</td>
                                                <td>${product.country}</td>
                                                <td>${product.colorId}</td>
                                                <td>${product.categoryId}</td>
                                                <td>${product.status}</td>
                                               
                                                <td>${product.year}</td>
                                                <td>${product.size}</td>
                                                <td>${product.material}</td>
                                                <td>${product.discount}</td>
                                                <td>${product.guarantee}</td>
                                                <td>${product.pin}</td>
                                                <td>${product.shape}</td>
                                                <td>${product.rate}</td>
                                                <td>${product.image}</td>
                                                <td><a href="<%= request.getContextPath()%>/product/initUpdateProduct.htm?productID=${product.productId}">Update</a></td>
                                                <td><a href="<%= request.getContextPath()%>/product/deleteProduct.htm?productId=${product.productId} onclick="return confirm('Are you Sure?')">Delete</a></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>

                            </div>

                        </div><!--end cards-->
                    </div>
                </div><!--end row-->
            </div>
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
