<%-- 
    Document   : formRegister
    Created on : Apr 24, 2017, 11:14:12 AM
    Author     : admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="LinkFile.jsp"></jsp:include>
            <title>JSP Page</title>
        </head>
        <body>
        <jsp:include page="headerSingle.jsp"></jsp:include>
        <div class="breadcrumbs">
            <div class="container">
                <div class="breadcrumbs-main">
                    <ol class="breadcrumb">
                        <li><a href="../product/getAll.htm">Home</a></li>
                        <li class="active">Register</li>
                    </ol>
                </div>
            </div>
        </div>



        <div class="register">
            <div class="container">
                <div class="register-top heading">
                    <h2>REGISTER</h2>
                </div>
              <f:form action="insertUser.htm" method="GET" commandName="Register">
                <div class="register-main">
                    <div class="col-md-6 account-left">
                    
                        <f:input path="userName" placeholder="username"/>
                        <f:input path="passWord" placeholder="Password"/>
                         <f:input path="phone" placeholder="Mobile"/>            
                    </div>
                    <div class="col-md-6 account-left">
                         <f:input path="email" placeholder="Email address"/>
                        <f:input path="address" placeholder="Address"/>
                        <f:select path="gender">                      
                            <f:option value="true" label="Male"/>
                            <f:option value="false" label="Female"/>
                         </f:select>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="address submit">
                    <input type="submit" value="Submit">
                </div>
              </f:form>
            </div>
        </div>
    </body>

</html>