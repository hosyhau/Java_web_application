<%-- 
    Document   : fileUpload
    Created on : May 5, 2017, 1:52:02 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    
<!-- Mirrored from bootstraplovers.com/themeforest-html/ultima-v1.2/form-upload.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 04 May 2017 23:46:13 GMT -->
<head>
         <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="/BackEndBkap/jsp/plugins/ionicons/css/ionicons.min.css" rel="stylesheet">
        <title>Ultima</title>
        <!--Import Google Icon Font-->
        <link href="/BackEndBkap/jsp/css/bootstrap.css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="/BackEndBkap/jsp/plugins/materialize/css/materialize.min.css"  media="screen"/>
              <!--dropzone-->
        <link href="/BackEndBkap/jsp/plugins/dropzone/css/basic.css" rel="stylesheet">
        <link href="/BackEndBkap/jsp/plugins/dropzone/css/dropzone.css" rel="stylesheet">
        <!--Template style-->
        <link href="/BackEndBkap/jsp/css/style.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
     
        <main class="main-content">

            <div class="page-content">
                <div class="row margin-b-0">
                    <div class="col s12 m12 l12">
                        <div class="card no-shadow">
                            <div class="card-content">  
                                <span class="card-title">Basic forms</span>
                                 <form id="my-awesome-dropzone" action="#" class="dropzone">
                                <button type="submit" class="btn teal rounded right-align">Submit!</button>
                            </form>

                            </div>
                        </div>
                    </div>
                </div>
              
            </div>
        </main>
        <!--\\\\\\\\\\\\\\\\\\\\\\\\\\\\Main content end\\\\\\\\\\\\\\\\\\\\\\\-->


        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="/BackEndBkap/jsp/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/plugins/materialize/js/materialize.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/js/app.js"></script>
   <!-- DROPZONE -->
        <script src="/BackEndBkap/jsp/plugins/dropzone/js/dropzone.js"></script>
         <script src="/BackEndBkap/jsp/js/dropzone-custom.js"></script>
    </body>
</html>


