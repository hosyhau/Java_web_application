<%-- 
    Document   : formLogin
    Created on : Apr 24, 2017, 11:13:52 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="LinkFile.jsp"></jsp:include>
            <title>JSP Page</title>
        </head>
        <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="breadcrumbs">
                <div class="container">
                    <div class="breadcrumbs-main">
                        <ol class="breadcrumb">
                            <li><a href="index-2.html">Home</a></li>
                            <li class="active">Account</li>
                        </ol>
                    </div>
                </div>
            </div>
            <!--end-breadcrumbs-->
            <!--account-starts-->
            <div class="account">
                <div class="container">
                    <div class="account-top heading">
                        <h2>ACCOUNT</h2>
                    </div>
                    <div class="account-main">
                        <div class="col-md-6 account-left">
                            <div style="color:red">${message}</div> 
                        <h4>Login your account</h4>      
                        <f:form action="Login.htm" method="post" commandName="user" >
                            <div class="account-bottom">

                                <f:input  path="email" placeholder="Email" type="text" tabindex="3" />
                                <f:input path="passWord" placeholder="Password" type="password" tabindex="4" />

                                <div class="address">
                                    <a class="forgot" href="#">Forgot Your Password?</a>
                                    <input type="submit" value="Login" />
                                </div>

                            </div>
                        </f:form>
                    </div>
                    <div class="col-md-6 account-right account-left">
                        <h3>New User? Create an Account</h3>
                        <p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
                        <a href="<%= request.getContextPath() %>/register/initInsertUser.htm">Create an Account</a>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
        <!--account-end-->

</body>
</html>
