<%-- 
    Document   : tableCatalog
    Created on : Apr 20, 2017, 11:43:12 AM
    Author     : admin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Neo Admin</title>

        <!-- Bootstrap Core CSS -->
        <link href="/BackEndBkap/jsp/css/bootstrap.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="/BackEndBkap/jsp/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- DataTables CSS -->
        <link href="/BackEndBkap/jsp/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

        <!-- DataTables Responsive CSS -->
        <link href="/BackEndBkap/jsp/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="/BackEndBkap/jsp/dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="/BackEndBkap/jsp/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

       
    </head>
    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <jsp:include page="nav.jsp"></jsp:include>
                <div id="page-wrapper">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">Insert New ImageLink</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-8">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                     ImageLink
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-10">
                                        <f:form role="form" action="insertImageLink.htm" method="POST" modelAttribute="newImageLink" enctype="multipart/form-data" >
                                            <div class="form-group">
                                                <label>ImageLink ID</label>
                                                <f:input path="imageId"  class="form-control" require="1"/>
                                            </div>
                                             <div class="form-group">
                                                <label>URL</label>
                                                <f:input  type="file" path="URL" class="form-control" />
                                            </div>
                                            <div class="form-group">
                                                <label>description</label>
                                                <f:input path="description" class="form-control" />
                                            </div>
                                            <div class="form-group">
                                                <label>status</label>
                                                <f:select path="status" class="form-control">
                                                    <f:option  value="true" label="Active"/>
                                                    <f:option value="false" label="Inactive"/>
                                                </f:select>
                                            </div>
                                            <div class="form-group">
                                                <label>ProductID</label>
                                                <f:input path="productId" class="form-control" />
                                            </div>
                                           
                                            

                                            <button type="submit" class="btn btn-default">Insert</button>
                                            <button type="reset" class="btn btn-default">Reset</button>
                                            <button type="button" class="btn btn-default" onclick="history.go(-1)">Back</button>
                                        </f:form>
                                    </div>
                                    <!-- /.col-lg-6 (nested) -->

                                </div>
                                <!-- /.row (nested) -->
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="/BackEndBkap/jsp/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="/BackEndBkap/jsp/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="/BackEndBkap/jsp/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="/BackEndBkap/jsp/vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/BackEndBkap/jsp/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="/BackEndBkap/jsp/vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="/BackEndBkap/jsp/dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
                                                $(document).ready(function () {
                                                    $('#dataTables-example').DataTable({
                                                        responsive: true
                                                    });
                                                });
    </script>

</body>

</html>

