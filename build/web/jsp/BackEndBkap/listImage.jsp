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
                                    <span class="card-title">Image</span> 
                                    <table id="datatable" class="bordered dt-responsive nowrap">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>URL</th>
                                                <th>Description</th>
                                                <th>status</th>
                                                <th>product ID</th>
                                                <th>update</th>
                                                <th>delete</th>
                                            </tr>
                                        </thead>

                                     <tbody>
                                            <c:forEach var="image" items="${listImageLink}">
                                                <tr>
                                                    <td>${image.imageId}</td>
                                                    <td>${image.URL}</td>
                                                    <td>${image.description}</td>
                                                    <td>${image.status}</td>
                                                    <td>${image.productId}</td>
                                                    <td><a href="<%= request.getContextPath()%>/image/initUpdateImageLink.htm?imageLinkID=${image.imageId}">update</a></td>
                                                    <td><a href="<%= request.getContextPath()%>/image/deleteImage.htm?imageLinkId=${image.imageId}onclick="return confirm('Are you Sure?')">delete</a></td>
                                                </tr>

                                            </c:forEach>
                                    </tbody>

                                    
                                </table>

                            </div>

                        </div><!--end cards-->
                    </div>
                </div><!--end row-->
            </div>
                  <a href="initInsertImageLink.htm" class="col-md-6 btn btn-primary btn-block insert">New Image</a>
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
