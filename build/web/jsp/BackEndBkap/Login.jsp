<%-- 
    Document   : login
    Created on : May 5, 2017, 1:50:54 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="/BackEndBkap/jsp/plugins/ionicons/css/ionicons.min.css" rel="stylesheet">
        <title>Neo Admin</title>
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="/BackEndBkap/jsp/plugins/materialize/css/materialize.min.css"  media="screen"/>
        <link href="/BackEndBkap/jsp/plugins/fullcalendar/fullcalendar.css" rel="stylesheet"> 
        <!--Template style-->
        <link href="/BackEndBkap/jsp/css/style.css" rel="stylesheet">
        <script type="text/javascript" src="/BackEndBkap/jsp/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/plugins/materialize/js/materialize.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/js/app.js"></script>
    </head>
    <body>

 <div id="preloader">
            <div class="preloader-wrapper big active">
                <div class="spinner-layer spinner-blue">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div><div class="gap-patch">
                        <div class="circle"></div>
                    </div><div class="circle-clipper right">
                        <div class="circle"></div>
                    </div>
                </div>

                <div class="spinner-layer spinner-red">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div><div class="gap-patch">
                        <div class="circle"></div>
                    </div><div class="circle-clipper right">
                        <div class="circle"></div>
                    </div>
                </div>

                <div class="spinner-layer spinner-yellow">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div><div class="gap-patch">
                        <div class="circle"></div>
                    </div><div class="circle-clipper right">
                        <div class="circle"></div>
                    </div>
                </div>

                <div class="spinner-layer spinner-green">
                    <div class="circle-clipper left">
                        <div class="circle"></div>
                    </div><div class="gap-patch">
                        <div class="circle"></div>
                    </div><div class="circle-clipper right">
                        <div class="circle"></div>
                    </div>
                </div>               
            </div>
        </div>
        <!-- end preloader-->
        <div class="display-table">
            <div class="vertical-middle">
                <div class="container">
                    <div class="row margin-b-0">
                        <div class="col s12 l4 offset-l4">
                            <div class="card margin-b-0">
                                <div class="card-content">
                                    <div style="color:red">${msg}</div> 
                                    <span class="card-title center-align">Login to NEO admin</span>
                                    <div class="row">
                                       
                                        <f:form action="LoginCheck.htm" method="post" commandName="user"  class="col s12 margin-b-0">
                                               <div class="input-field col s12">
                                                   <f:input path="userName" placeholder="userName" type="text"/>
                                                   
                                               </div>
                                               <div class="input-field col s12 margin-b-20">
                                                   <f:input path="passWord" placeholder="password" type="password" class="validate"/>
                                                  
                                               </div>
                                               <div class="col s12 right-align margin-b-20">                                                
                                                   <button type="submit" value="submit" class="waves-effect waves-light btn teal btn-block">sign in</button>
                                               </div>
                                               <div class="col s12 center-align">                                                
                                                   <a href="<%= request.getContextPath() %>/user/initInsertUser.htm">Create an account</a>
                                               </div>
                                                <div class="col s12 center-align">
                                                
                                                   <a href="../home/forgotPassword.htm">Forgot password</a>
                                               </div>
                                         </f:form>
                                      </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--Import jQuery before materialize.js-->
         <script type="text/javascript" src="/BackEndBkap/jsp/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/plugins/materialize/js/materialize.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/js/app.js"></script>
    </body>
</html>
