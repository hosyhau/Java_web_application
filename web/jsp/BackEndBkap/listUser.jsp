<%-- 
    Document   : listUser
    Created on : May 6, 2017, 6:33:15 PM
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
                                <span class="card-title">User</span> 
                                <table id="datatable" class="bordered dt-responsive nowrap">
                                    <thead>
                                        <tr>
                                            <th>User ID</th>
                                            <th>UserName</th>
                                            <th>Password</th>
                                            <th>phone</th>
                                            <th>Email</th>
                                           <th>BirthDay</th>
                                            <th>Address</th>
                                            <th>Gender</th>
                                            <th>type</th>
                                            <th>group</th>
                                            <th>package</th>
                                            <th>status</th>
                                            <th>update</th>
                                            <th>delete</th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                    <c:forEach var="user" items="${listUser}">
                                        <tr>
                                            <td>${user.userId}</td>
                                            <td>${user.userName}</td>
                                            <td>${user.passWord}</td>
                                            <td>${user.phone}</td>
                                            <td>${user.email}</td>
                                            <td>${user.birthDay}</td>
                                            <td>${user.address}</td>
                                            <td>${user.gender}</td>
                                            <td>${user.userType}</td>
                                            <td>${user.groupId}</td>
                                            <td>${user.packageId}</td>
                                            <td>${user.status}</td>
                                            <td><a href="<%= request.getContextPath() %>/user/initUpdateUser.htm?userID=${user.userId}">Update</a></td>
                                            <td><a href="<%= request.getContextPath() %>/user/deleteUser.htm?userID=${user.userId}"onclick="return confirm('Are you Sure?')">Delete</a></td>
                                        </tr>
                                       
                                        </c:forEach>
                                    </tbody>
                                </table>

                            </div>

                        </div><!--end cards-->
                    </div>
                </div><!--end row-->
            </div>
            <a href="../user/initInsertUser.htm" class="col-md-6 btn btn-primary btn-block insert">New User</a>
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

