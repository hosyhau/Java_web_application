<%-- 
    Document   : calendar
    Created on : May 5, 2017, 1:52:32 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <link href="/BackEndBkap/jsp/plugins/ionicons/css/ionicons.min.css" rel="stylesheet">
        <title>Neo admin</title>
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="/BackEndBkap/jsp/plugins/materialize/css/materialize.min.css"  media="screen"/>
        <link href="/BackEndBkap/jsp/plugins/fullcalendar/fullcalendar.css" rel="stylesheet"> 
        <!--Template style-->
        <link href="/BackEndBkap/jsp/css/style.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <main class="main-content">
            <div class="page-content">
                <div class="row margin-b-0">
                    <div class="col s12 m3">
                        <div class="card">                       
                            <div class="card-content">
                                 <div id='external-events'>
                                        <h4>Drag a event and drop into calendar.</h4>
                                        <div class='fc-event'>My Event 1</div>
                                        <div class='fc-event'>My Event 2</div>
                                        <div class='fc-event'>My Event 3</div>
                                        <div class='fc-event'>My Event 4</div>
                                        <div class='fc-event'>My Event 5</div>
                                        <p>
                                            <input type='checkbox' class="i-checks" id='drop-remove' />
                                            <label for='drop-remove'>remove after drop</label>
                                        </p>
                                    </div>

                            </div>
                        </div><!--end cards-->
                    </div>
                    <div class="col s12 m9">
                        <div class="card">                       
                            <div class="card-content">
                                <div id='calendar'></div>
                            </div>
                        </div><!--end cards-->
                    </div>
                </div><!--end row-->
            </div>
        </main>
        <script type="text/javascript" src="/BackEndBkap/jsp/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/plugins/materialize/js/materialize.min.js"></script>
        <script type="text/javascript" src="/BackEndBkap/jsp/js/app.js"></script>
        <!--page scripts-->
        <script src="/BackEndBkap/jsp/plugins/jquery-ui/jquery-ui.min.js"></script>
        <script src="/BackEndBkap/jsp/plugins/momentJs/moment.min.js"></script>
        <script src="/BackEndBkap/jsp/plugins/fullcalendar/fullcalendar.min.js"></script>
        <script src="/BackEndBkap/jsp/js/calendar.custom.js"></script>
    </body>
</html>
