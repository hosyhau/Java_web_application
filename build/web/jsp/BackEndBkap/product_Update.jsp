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
                        <h1 class="page-header">Update Product</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-6" style="height: 100%">
                        <f:form role="form" action="updateProduct.htm" method="GET" commandName="updateProduct" >
                            <div class="form-group">
                                <label>Product ID</label>
                                <f:input path="productId" readonly="true" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Product Name</label>
                                <f:input path="productName" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Content</label>
                                <f:textarea path="content" class="form-control" required="1" rows="4"></f:textarea>
                                </div>
                                 <div class="form-group">
                                <label>Content Detail</label>
                                <f:textarea path="contentDetail" class="form-control" required="1" rows="4"></f:textarea>
                                </div>
                                
                            <div class="form-group">
                                <label>Price Import</label>
                                <f:input path="priceImport" type="number" step="0.01" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>price Export</label>
                                <f:input path="priceExport" type="number" step="0.01" class="form-control" required="1" />
                            </div>
                            
                           
                            <div class="form-group">
                                <label>Quantity </label>
                                <f:input path="quantity" type="number" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Category </label>
                                <f:input path="categoryId" type="text" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Color </label>
                                <f:input path="colorId" type="text" class="form-control" required="1" />
                            </div>
                            
                            <div class="form-group">
                                <label>status</label>
                                <f:select path="status" class="form-control">
                                    <f:option  value="true" label="Active"/>
                                    <f:option value="false" label="Inactive"/>
                                </f:select>
                            </div>
                            <div class="form-group">
                                <label>Country</label>
                                <f:input path="country" type="text"  class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Year</label>
                                <f:input path="year" type="text" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Guarantee</label>
                                <f:input path="guarantee" type="text" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Size</label>
                                <f:input path="size" type="number" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Material)</label>
                                <f:input path="material" type="text"  class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Discount </label>
                                <f:input path="discount" type="number" step="0.01" class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Pin)</label>
                                <f:input path="pin" type="number"  class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Shape)</label>
                                <f:input path="shape" type="text"  class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Manufacter)</label>
                                <f:input path="manufacter" type="text"  class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Rate</label>
                                <f:input path="rate" type="number"  class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <f:input path="image" type="file"  class="form-control" />
                            </div>
                           <div class="form-group">
                                <label>View Of Product</label>
                                <f:input path="viewOfProduct" type="number"  class="form-control" required="1" />
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-default">Update</button>
                                <button type="button" class="btn btn-default" onclick="history.go(-1)">Back</button>
                            </div>

                        </f:form>
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

