<%@page import="java.lang.Exception"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title></title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
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
        <%@page import="java.sql.DriverManager"%>
        <%@page import="java.sql.ResultSet"%>
        <%@page import="java.sql.Statement"%>
        <%@page import="java.sql.Connection"%>
        <%
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
        %>
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");
                statement = connection.createStatement();

                String vid = request.getParameter("vid");

                String sql = "SELECT * FROM vehicle_details WHERE vid='" + vid + "'";

                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
        %>
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
                                <img src="asset\Images\vehicle_images\0_<%=resultSet.getString("vid")%>_1.jpg" alt="Image">
                                <div class="carousel-caption">
                                    <h3>Image 1</h3>
                                </div>      
                            </div>
                            <div class="item">
                                <img src="asset\Images\vehicle_images\0_<%=resultSet.getString("vid")%>_2.jpg" alt="Image">
                                <div class="carousel-caption">
                                    <h3>Image 2</h3>
                                </div>      
                            </div>
                            <div class="item">
                                <img src="asset\Images\vehicle_images\0_<%=resultSet.getString("vid")%>_3.jpg" alt="Image">
                                <div class="carousel-caption">
                                    <h3>Image 3</h3>
                                </div>      
                            </div>
                            <div class="item">
                                <img src="asset\Images\vehicle_images\0_<%=resultSet.getString("vid")%>_4.jpg" alt="Image">
                                <div class="carousel-caption">
                                    <h3>Image 4</h3>
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
                    <h2>Vehicle Details</h2></br>
                    <table class="table table-hover" style="margin:20px 20px 20px 20px">
                        <thead>
                            <tr>
                                <th>Specification</th>
                                <th>Description</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr> 
                            <tr><td>Register No:</td> <td> <%= resultSet.getString("register_no")%></td></tr>
                            <tr><td>Category</td> <td><%=resultSet.getString("category")%></td></tr>
                            <tr><td>Make</td><td><%=resultSet.getString("make")%></td></tr>
                            <tr><td>Model</td><td><%=resultSet.getString("model")%></td></tr>
                            <tr><td>Year</td> <td><%=resultSet.getString("year")%></td></tr>
                            <tr><td>Color</td> <td><%=resultSet.getString("color")%></td></tr>
                            <tr><td>Mileage</td> <td><%=resultSet.getString("mileage")%></td></tr>
                            <tr><td style=" margin-left: 20px" colspan="2"><button class="btn btn-info">Rent for Rs.<%=resultSet.getString("monthly")%> Monthly</button></td></tr>   
                        </tbody>
                        <%
                                }

                            } catch (Exception e) {
                                out.println(e);
                            }
                        %>
                    </table>  
                </div>   
            </div>
        </div>
        <br>
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
