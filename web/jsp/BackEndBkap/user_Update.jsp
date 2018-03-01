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
                            <h1 class="page-header">Update User</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-8">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                   User Infor
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-10">
                                        <f:form role="form" action="updateUser.htm" method="GET" modelAttribute="updateUser" >
                                             <div class="form-group">
                                                <label>User ID </label>
                                                <f:input path="userId" readonly="true" class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>User Name </label>
                                                <f:input path="userName" class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>Password</label>
                                                <f:input path="passWord"  class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>phone </label>
                                                <f:input path="phone" class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>Email </label>
                                                <f:input path="email" class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>Address </label>
                                                <f:input path="address" class="form-control" required="1" />
                                            </div>
                                            
                                            <div class="form-group">
                                                <label>Gender </label>
                                                <f:select path="gender" class="form-control">
                                                    <f:option  value="true" label="male"/>
                                                    <f:option value="false" label="female"/>
                                                </f:select>
                                            </div>
                                            <div class="form-group">
                                                <label>Birthday </label>
                                                <f:input path="birthDay" type="text" class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>User Type </label>
                                                <f:input path="userType" class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>Package ID </label>
                                                <f:input path="packageId" class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>Group ID </label>
                                                <f:input path="groupId" type="number" class="form-control" required="1" />
                                            </div>
                                            <div class="form-group">
                                                <label>Status </label>
                                                <f:select path="status" class="form-control">
                                                    <f:option  value="true" label="active"/>
                                                    <f:option value="false" label="inactive"/>
                                                </f:select>
                                            </div>
                                            <button type="submit" class="btn btn-default">update</button>
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
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="/QLOT_Nhom6/jsp/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="/QLOT_Nhom6/jsp/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="/QLOT_Nhom6/jsp/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="/QLOT_Nhom6/jsp/vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/QLOT_Nhom6/jsp/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="/QLOT_Nhom6/jsp/vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="/QLOT_Nhom6/jsp/dist/js/sb-admin-2.js"></script>

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

