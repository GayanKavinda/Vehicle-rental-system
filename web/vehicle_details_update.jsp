<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.vehicle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!doctype html>
    <html lang="en">
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
            <link rel="stylesheet" href="asset/payment-css.css">
            <link rel="stylesheet" href="asset/index-css.css">
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
            <div>    
                <br>
                <%
                    Connection connection = null;
                    Statement statement = null;
                    ResultSet resultSet = null;
                %>
                <br>
                <div class="container">
                    <h2>Update Vehicle Details</h2>
                    <p style ="font-size: 20px;color: #999999">Select Your Vehicle and update vehicle details</p>                                                          
                    <div class="table-responsive">          
                        <table class="table">
                            <thead>
                                <tr>
                                    <th><b>Vid</b></th>
                                    <th><b>Register No.</b></th>
                                    <th><b>Category</b></th>
                                    <th><b>Make</b></th>
                                    <th><b>Model</b></th>
                                    <th><b>Year</b></th>
                                    <th><b>Color</b></th>
                                    <th><b>Mileage</b></th>
                                    <th><b>Monthly</b></th>
                                    <th><b>Action</b></th>
                                </tr>
                            </thead>
                            <%
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");
                                    statement = connection.createStatement();
                                    String sql = "SELECT * FROM vehicle_details";

                                    resultSet = statement.executeQuery(sql);
                                    while (resultSet.next()) {
                            %>
                            <tbody>
                            <td><%=resultSet.getString("vid")%></td>
                            <td><%=resultSet.getString("register_no")%></td>
                            <td><%=resultSet.getString("category")%></td>
                            <td><%=resultSet.getString("make")%></td>
                            <td><%=resultSet.getString("model")%></td>
                            <td><%=resultSet.getString("year")%></td>
                            <td><%=resultSet.getString("color")%></td>
                            <td><%=resultSet.getString("mileage")%></td>
                            <td><%=resultSet.getString("monthly")%></td>
                            <td><a class="edit" href="vehicle_edit_form.jsp?vid=<%=resultSet.getString("vid")%>"><span class="glyphicon glyphicon-pencil"></span> Edit</a></td>
                            </tr>
                            </tbody>
                            <%
                                    }
                                } catch (Exception e) {
                                    out.println(e);
                                }
                            %>
                        </table>
                        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
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
