
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


    <!--\\\\\\\\\\\\\\\\\\\\\\\\\\\\Start top bar header\\\\\\\\\\\\\\\\\\\\\\\-->
    <header id="header" class="top-bar">
        <div class="navbar-fixed">
            <nav class="teal">
                <div class="nav-wrapper">
                    <ul class="left">                      
                        <li><h1 class="logo-wrapper center-align"><a href="<%= request.getContextPath() %>/home/getHome.htm" class="brand-logo">Admin Neo</a></h1></li>
                    </ul>

                    <ul class="right col s9 m3 nav-right-menu">
                     
                        <li class="hide-on-med-and-down"><a href="javascript:void(0)" data-activates="dropdown1" class="dropdown-button dropdown-right show-on-large"><i class="material-icons">email</i><span class="badge blue">4</span></a></li>
                        <li><a class='dropdown-button  dropdown-right' href='#' data-activates='dropdown'><img src="/BackEndBkap/images/avatar-03.png" alt="" width="40"></a></li>
                    </ul>
                    <!-- Dropdown Structure -->
                    <ul id='dropdown' class='dropdown-content profile-dropdown'>
                        <li><a href="#!">Profile</a></li>
                        <li><a href="#!">Settings</a></li>
                        <li class="divider"></li>
                        <li><a href="<%= request.getContextPath() %>/login/initLogin.htm">Logout</a></li>
                    </ul>
                    <ul id='dropdown1' class='dropdown-content notifications-dropdown'>
                        <li class="notification-header">                               
                            4 New Messages
                        </li>
                        <li>
                            <a href="#">
                                <img src="/BackEndBkap/images/avatar-01.png" alt="" width="40" class="left">
                                <div class="notify-content">
                                    <span class="notify-title">John Started Following You</span>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetuer adipiscing elit.   
                                    </p>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <img src="/BackEndBkap/images/avatar-04.png" alt="" width="40" class="left">
                                <div class="notify-content">
                                    <span class="notify-title">Adam sent you a request</span>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetuer adipiscing elit.   
                                    </p>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <img src="/BackEndBkap/images/avatar-05.png" alt="" width="40" class="left">
                                <div class="notify-content">
                                    <span class="notify-title">Deny Sent a private Message</span>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetuer adipiscing elit.   
                                    </p>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <img src="/BackEndBkap/images/avatar-08.png" alt="" width="40" class="left">
                                <div class="notify-content">
                                    <span class="notify-title">Kalia assign a task</span>
                                    <p>
                                        Lorem ipsum dolor sit amet, consectetuer adipiscing elit.   
                                    </p>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="center-align">View All</a>
                        </li>
                    </ul>
                    
                    <form class="right search col s6 hide-on-med-and-down">
                        <div class="input-field">
                            <input id="search" type="search" placeholder="Search" autocomplete="off">
                            <label for="search" class="active"><i class="material-icons search-icon">search</i></label>
                        </div>
                    </form>
                </div>
            </nav>

        </div>
    </header>
    <!--\\\\\\\\\\\\\\\\\\\\\\\\\\\\End top bar header\\\\\\\\\\\\\\\\\\\\\\\-->



    <!--\\\\\\\\\\\\\\\\\\\ Start left side nav\\\\\\\\\\\\\\\\\\\\\\\\\\\\-->
    <aside id="slide-out" class="side-nav white fixed">
        <div class="side-nav-wrapper">
            <ul class="sidebar-menu collapsible collapsible-accordion" data-collapsible="accordion">
                <li class="nav-title">Main Navigation</li>
                <li class="no-padding">
                    <a class="collapsible-header waves-effect waves-grey active"><i class="material-icons">dashboard</i>Dashboard</a>
                    <div class="collapsible-body">
                        <ul>
                            <li><a href="<%= request.getContextPath() %>/home/getHome.htm"">NEo admin</a></li>
                            

                        </ul>
                    </div>
                </li>
               
               
                <li class="no-padding">
                    <a class="collapsible-header waves-effect waves-grey"><i class="material-icons">mode_edit</i>New More</a>
                    <div class="collapsible-body">
                        <ul>
                             
                           
                              <li><a href="<%= request.getContextPath()%>/ship/initInsertShip.htm">New Ship</a></li>
                             <li><a href="<%= request.getContextPath()%>/payment/initInsertPayment.htm">New Payment</a></li> 
                              <li><a href="<%= request.getContextPath()%>/paymentType/initInsertPaymentType.htm">New PaymentType</a></li>
                              <li><a href="<%= request.getContextPath()%>/user/initInsertUser.htm">New User</a></li>
                              <li><a href="<%= request.getContextPath()%>/product/initInsertProduct.htm">New Product</a></li>
                              <li><a href="<%= request.getContextPath()%>/color/initInsertColor.htm">New Color</a></li>
                              <li><a href="<%= request.getContextPath()%>/category/initInsertCatalog.htm">New Category</a></li>
                              <li><a href="<%= request.getContextPath()%>/image/initInsertImageLink.htm">New ImageLink</a></li>
                              
                             
                        </ul>
                    </div>
                </li>     
                <li class="no-padding">
                    <a class="collapsible-header waves-effect waves-grey"><i class="material-icons">grid_on</i>Tables</a>
                    <div class="collapsible-body">
                        <ul>
                            <li><a href="<%= request.getContextPath() %>/user/getAllU.htm">User</a></li>
                            <li><a href="<%= request.getContextPath() %>/product/getAll.htm">Product</a></li>
                            <li><a href="<%= request.getContextPath() %>/category/getAllC.htm">Category</a></li>
                            <li><a href="<%= request.getContextPath() %>/order/getAllO.htm">Order</a></li>
                            <li><a href="<%= request.getContextPath() %>/orderDetail/getAllOD.htm">Order Detail</a></li>
                            <li><a href="<%= request.getContextPath() %>/payment/getAllP.htm">Payment</a></li>
                            <li><a href="<%= request.getContextPath() %>/paymentType/getAllPT.htm">Payment Type</a></li>
                            <li><a href="<%= request.getContextPath() %>/ship/getAllS.htm">Ship</a></li>
                            <li><a href="<%= request.getContextPath() %>/color/getAllCo.htm">Color</a></li>
                            <li><a href="<%= request.getContextPath() %>/image/getAllI.htm">Image</a></li>
                            <li><a href="<%= request.getContextPath() %>/backend/getAllComment.htm">Comment</a></li>
                            
                        </ul>
                    </div>
                </li>     
                
                <li class="no-padding"><a class="waves-effect waves-grey" href="<%= request.getContextPath() %>/home/calendar.htm"><i class="material-icons">perm_contact_calendar</i>Calendar</a></li>


                <li class="no-padding">
                    <a class="collapsible-header waves-effect waves-grey"><i class="material-icons">folder</i>Pages</a>
                    <div class="collapsible-body">
                        <ul>
                            <li><a href="<%= request.getContextPath() %>/home/page404.htm">404 Page</a></li>                   
                            <li><a href="<%= request.getContextPath() %>/user/initInsertUser.htm">Register</a></li>
                           
                            <li><a href="#">Forgot Password</a></li>
                      


                        </ul>
                    </div>
                </li>
                <li class="no-padding">
                    <a class="collapsible-header waves-effect waves-grey"><i class="material-icons">navigation</i>Maps</a>
                    <div class="collapsible-body">
                        <ul>
                            <li><a href="map-google.html">Google Maps</a></li>
                            <li><a href="map-vector.html">Vector Maps</a></li>
                        </ul>
                    </div>
                </li> 
                <li class="footer center">
                    <span class="grey-text">&copy; 2016-2017. NEO</span>
                </li>
            </ul>
        </div>
    </aside>
    <a href="#" data-activates="slide-out" class="button-collapse hide-on-large-only"><i class="material-icons">menu</i></a>