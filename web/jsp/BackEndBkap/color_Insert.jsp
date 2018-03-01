<%-- 
Document   : tableCatalog
Created on : Apr 20, 2017, 11:43:12 AM
Author     : admin
--%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                            <h1 class="page-header">New Color</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    New Color
                                </div>
                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                <f:form role="form" action="insertColor.htm" method="GET" commandName="newColor" >
                                    <div class="form-group">
                                        <label>Color ID</label>
                                        <f:input path="colorId"  class="form-control" required="1" />
                                    </div>
                                    <div class="form-group">
                                        <label>Color Name</label>
                                        <f:input path="colorName" class="form-control" required="1" />
                                    </div>
                                    <div class="form-group">
                                        <label>Status</label>
                                        <f:select path="status" class="form-control">
                                            <f:option  value="true" label="Active"/>
                                            <f:option value="false" label="Inactive"/>
                                        </f:select>
                                    </div>
                                    <button type="submit" class="btn btn-default">Insert</button>
                                    <button type="reset" class="btn btn-default">Reset</button>
                                    <button type="button" class="btn btn-default" onclick="history.go(-1)">Back</button>
                                </f:form>
                                   
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
            </div>
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

