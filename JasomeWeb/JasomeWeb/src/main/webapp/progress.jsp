<%-- 
    Document   : progress
    Created on : 11/03/2020, 10:34:59
    Author     : anton
--%>

<!DOCTYPE html>
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <title>Jasome Web | Panel</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/meanmenu.min.css">
        <link rel="stylesheet" href="css/jasome-custon-icon.css">
        <link rel="stylesheet" href="css/metisMenu/metisMenu.min.css">
        <link rel="stylesheet" href="css/metisMenu/metisMenu-vertical.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/responsive.css">
        <script src="js/vendor/modernizr-2.8.3.min.js"></script>
        <script src="https://d3js.org/d3.v4.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    </head>
    <body>
        <!-- Start Left menu area -->
        <div class="left-sidebar-pro">
            <nav id="sidebar">
                <div class="sidebar-header">
                    <a href="panel.jsp"><img class="main-logo" src="img/logo/logojasome.png" alt="" /></a>
                    <strong><a href="panel.jsp"><img src="img/logo/logosnjasome.png" alt="" /></a></strong>
                </div>
                <div class="left-custom-menu-adp-wrap comment-scrollbar">
                    <nav class="sidebar-nav left-sidebar-menu-pro">
                        <ul class="metismenu" id="menu1">
                            <li class="active">
                                <a class="has-arrow" href="panel.jsp">
                                    <span class="educate-icon educate-home icon-wrap"></span>
                                    <span class="mini-click-non">Projetos</span>
                                </a>
                                <ul class="submenu-angle" aria-expanded="true">
                                    <li><a href="newproject.jsp"><span class="mini-sub-pro">Cadastrar</span></a></li>
                                    <li><a href="progress.jsp"><span class="mini-sub-pro">Progresso</span></a></li>
                                    <li><a href="#"><span class="mini-sub-pro">Resultados</span></a></li>
                                </ul>
                            </li>
                            <li>
                                <a title="Landing Page" href="events.html" aria-expanded="false"><span class="educate-icon educate-event icon-wrap sub-icon-mg" aria-hidden="true"></span> <span class="mini-click-non">Analysis</span></a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </nav>
        </div>
        <!-- End Left menu area -->

        <!-- Start Welcome area -->
        <div class="all-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="logo-pro">
                            <a href="panel.jsp"><img class="main-logo" src="img/logo/logojasome.png" alt="" /></a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header-advance-area">
                <div class="header-top-area">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="header-top-wraper">
                                    <div class="row">
                                        <div class="col-lg-1 col-md-0 col-sm-1 col-xs-12">
                                            <div class="menu-switcher-pro">
                                                <button type="button" id="sidebarCollapse" class="btn bar-button-pro header-drl-controller-btn btn-info navbar-btn">
                                                    <i class="educate-icon educate-nav"></i>
                                                </button>
                                            </div>
                                        </div>
                                        <div class="col-lg-6 col-md-7 col-sm-6 col-xs-12">
                                            <div class="header-top-menu tabl-d-n">
                                                <ul class="nav navbar-nav mai-top-nav">
                                                    <li class="nav-item"><a href="panel.jsp" class="nav-link">Home</a>
                                                    </li>
                                                    <li class="nav-item"><a href="about.jsp" class="nav-link">About</a>
                                                    </li>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="col-lg-5 col-md-5 col-sm-12 col-xs-12">
                                            <div class="header-right-info">
                                                <ul class="nav navbar-nav mai-top-nav header-right-menu">
                                                    <li class="nav-item">
                                                        <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
                                                            <img src="img/product/user.png" alt="" />
                                                            <span class="admin-name">Antônio</span>
                                                            <i class="fa fa-angle-down edu-icon edu-down-arrow"></i>
                                                        </a>
                                                        <ul role="menu" class="dropdown-header-top author-log dropdown-menu animated zoomIn">
                                                            <li><a href="#"><span class="edu-icon edu-home-admin author-log-ic"></span>My Account</a>
                                                            </li>
                                                            <li><a href="#"><span class="edu-icon edu-user-rounded author-log-ic"></span>My Profile</a>
                                                            </li>
                                                            <li><a href="#"><span class="edu-icon edu-money author-log-ic"></span>User Billing</a>
                                                            </li>
                                                            <li><a href="#"><span class="edu-icon edu-settings author-log-ic"></span>Settings</a>
                                                            </li>
                                                            <li><a href="#"><span class="edu-icon edu-locked author-log-ic"></span>Log Out</a>
                                                            </li>
                                                        </ul>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Mobile Menu start -->
                <!--            <div class="mobile-menu-area">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="mobile-menu">
                                                <nav id="dropdown">
                                                    <ul class="mobile-menu-nav">
                                                        <li><a data-toggle="collapse" data-target="#Charts" href="#">Home <span class="admin-project-icon edu-icon edu-down-arrow"></span></a>
                                                            <ul class="collapse dropdown-header-top">
                                                                <li><a href="index.html">Home</a></li>
                                                                <li><a href="analytics.html">Analytics</a></li>
                                                            </ul>
                                                        </li>
                                                        <li><a href="events.html">Event</a></li>
                                                    </ul>
                                                </nav>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>-->
                <!-- Mobile Menu end -->
                <div class="breadcome-area">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                <div class="breadcome-list">
                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                            <div class="breadcome-heading">
                                                <form role="search" class="sr-input-func">
                                                    <input type="text" placeholder="Search..." class="search-int form-control">
                                                    <a href="#"><i class="fa fa-search"></i></a>
                                                </form>
                                            </div>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                            <ul class="breadcome-menu">
                                                <li><a href="#">Projetos</a> <span class="bread-slash">/</span>
                                                </li>
                                                <li><span class="bread-blod">Home</span>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Panel -->
            <div>
                <h1>Progress/Version Metrics</h1>
                <br>
                <br>
                <div id="chart"></div>
                <script src="visualization/visualization.js" />
            </div>
            <!-- End Panel -->
            <script src="js/vendor/jquery-1.12.4.min.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/jquery.meanmenu.js"></script>
            <script src="js/jquery.sticky.js"></script>
            <script src="js/metisMenu/metisMenu.min.js"></script>
            <script src="js/metisMenu/metisMenu-active.js"></script>
            <script src="js/main.js"></script>
    </body>
</html>
