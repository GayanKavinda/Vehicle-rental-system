<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Home</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style>
            footer {
                background-color: #f2f2f2;
                padding: 25px;
            }
            .carousel-inner img {
                width: 100%; 
                min-height: 200px;
            }
            @media (max-width: 600px) {
                .carousel-caption {
                    display: none; 
                }
            }
        </style>
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="#"></a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li><img  style="height:40px;margin: 5px" src="asset\Images\Home\logo.jpg"></li>
                        <li class="active"><a href="vehicle_interface.jsp">Home</a></li>
                        <li><a href="#">My Account</a></li>
                        <li><a href="payment.html">Payments</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="col-sm-8">
                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <!-- Indicators -->
                        <ol class="carousel-indicators">
                            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                            <li data-target="#myCarousel" data-slide-to="1"></li>
                            <li data-target="#myCarousel" data-slide-to="2"></li>
                            <li data-target="#myCarousel" data-slide-to="3"></li>

                        </ol>

                        <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                            <div class="item active">
                                <img src="asset\Images\Home\4.jpeg" alt="Image">
                                <div class="carousel-caption">
                                    <h3>Rent the key</h3>
                                    <p>Money money.</p>
                                </div>      
                            </div>
                            <div class="item">
                                <img src="asset\Images\Home\1.jpg" alt="Image">
                                <div class="carousel-caption">
                                    <h3>Organize Payments</h3>
                                    <p></p>
                                </div>      
                            </div>
                            <div class="item">
                                <img src="asset\Images\Home\2.jpg" alt="Image">
                                <div class="carousel-caption">
                                    <h3>we love making our customers happy </h3>
                                    <p></p>
                                </div>      
                            </div>
                            <div class="item">
                                <img src="asset\Images\Home\3.jpg" alt="Image">
                                <div class="carousel-caption">
                                    <h3>Easy Documentation</h3>
                                    <p></p>
                                </div>      
                            </div>
                        </div>

                        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>


                <div class="col-sm-4">
                    <div class="well" style="height:410px; margin: 10px 10px 10px 10px;background-color:   #626567  ;opacity: 0.8;">
                        <p><b><font style="font-family:sans-serif"  size="5" color="#6699FF">CHOOSE COMFORT </br><font color=" #9e9e9e ">WITH OUR COMPANY </font> </font></b></p>

                        <div style="">
                            <form action="vehicle_view_available.jsp" method="post">
                                <div class="form-group">
                                    <label for="1">PICK UP DATE</label>
                                    <div>
                                        <div style ="width:25%; display:inline-block;">

                                            <select class="form-control" name="home-pu-day">
                                                <option>1 </option><option>2 </option><option>3 </option><option>4 </option><option>5 </option><option>6 </option><option>7 </option><option>8 </option><option>9 </option><option>10 </option><option>11 </option>
                                                <option>12 </option><option>13 </option><option>14 </option><option>15 </option><option>16 </option><option>17 </option><option>18 </option><option>19 </option><option>20 </option><option>21 </option>
                                                <option>22 </option><option>23 </option><option>24 </option><option>25 </option><option>26 </option><option>27 </option><option>28 </option><option>29 </option><option>30 </option><option>31 </option>
                                            </select>
                                        </div>

                                        <div style ="width:35%; display:inline-block;">

                                            <select class="form-control" name="home-pu-month">
                                                <option>January </option><option>February </option><option>March </option> <option>April </option><option>May </option><option>June </option><option>July </option>
                                                <option>August </option><option>September </option><option>October </option><option>November </option><option>December </option>
                                            </select>
                                        </div>
                                        <div style ="width:30%; display:inline-block;">

                                            <select class="form-control" name="home-pu-year">
                                                <option>2019</option>
                                                <option>2020 </option>
                                                <option>2021</option>
                                                <option>2022 </option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="11">DROP OFF DATE</label>
                                    <div>
                                        <div style ="width:25%; display:inline-block;">

                                            <select class="form-control" name="home-do-day">
                                                <option>1 </option><option>2 </option><option>3 </option><option>4 </option><option>5 </option><option>6 </option><option>7 </option><option>8 </option><option>9 </option><option>10 </option><option>11 </option>
                                                <option>12 </option><option>13 </option><option>14 </option><option>15 </option><option>16 </option><option>17 </option><option>18 </option><option>19 </option><option>20 </option><option>21 </option>
                                                <option>22 </option><option>23 </option><option>24 </option><option>25 </option><option>26 </option><option>27 </option><option>28 </option><option>29 </option><option>30 </option><option>31 </option>
                                            </select>
                                        </div>
                                        <div style ="width:35%; display:inline-block;">

                                            <select class="form-control" name="home-do-month">
                                                <option>January </option><option>February </option><option>March </option> <option>April </option><option>May </option><option>June </option><option>July </option>
                                                <option>August </option><option>September </option><option>October </option><option>November </option><option>December </option>
                                            </select>
                                        </div>
                                        <div style ="width:30%; display:inline-block;">
                                            <select class="form-control" name=home-do-year">
                                                <option>2019</option>
                                                <option>2020 </option>
                                                <option>2021</option>
                                                <option>2022 </option>
                                            </select>
                                        </div> 
                                    </div>
                                    <div style="width:93%;">
                                        <label for="111">CATEGORY</label>
                                        <select class="form-control" name="home-category">
                                            <option>Economy</option>
                                            <option>Compact</option>
                                            <option>Standard Sedan</option>
                                            <option>Mini Van</option>
                                        </select>
                                    </div>
                                    <div style="margin:10px 0px 0px 0px;">
                                        <button type="submit" class="btn btn-primary">Search</button>
                                    </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <hr>
        </div>

        <div class="container">    
            <div class="row row-no-gutters">  
                <div  class="col-sm-6"> 
                    <img style="width:90%"src="asset\Images\Home\cover3.jpg" class="img-responsive" alt="Image">
                </div>  
                <div class="col-sm-6"> 
                    <div class="well well-lg" style="width:92% ;margin:5px 5px 5px 5px">
                        <p style=" font-size: 23px ;font-family: fantasy">  Arranging car hire in countries,Rent Smart is the world's biggest online car rental service. 
                            Working with leading suppliers, we offer great prices on all car groups, including Economy,Compact, Standard sedan and Mini Van.
                            With a multilingual call center open 7 days a week, we can find you the best rental prices whenever you want ? wherever you go.</p>
                    </div>
                </div>
            </div>
            <br>
            <hr>
        </div>
        <footer class="container">
            <div class="row">  
                <div  class="col-sm-6"> 
                    <div class="well well-sm">
                        <p>Address:</br> &nbsp;&nbsp;&nbsp;&nbsp;No.24,</br>&nbsp;&nbsp;&nbsp;&nbsp;New Kandy Road,</br>&nbsp;&nbsp;&nbsp;&nbsp;Malabe,</br>&nbsp;&nbsp;&nbsp;&nbsp;Sri Lanka</p>
                    </div>
                </div>
                <div  class="col-sm-3"> 
                    <p>Contact:</br>+94 78 1 565 042</br>+94 71 2 303 299</p>
                    <img style="height:60px" src="asset\Images\Home\icons.jpg">
                </div>
                <div  class="col-sm-3">
                    <img style="height:130px" src="asset\Images\Home\logo.jpg">
                </div>
            </div>
            <div class="row">  
                <center><p> <span class="glyphicon glyphicon-copyright-mark"> Copyright
                        </br>Samarajeewa D -IT18189704</p>
                </center>
            </div>
        </footer>
    </body>
</html>
