<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.vehicle"%>
<%@page import="model.vehicle_availability"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!doctype html>
    <html lang="en">
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <link rel="stylesheet" href="asset/index-css.css">
            <style>
                footer {
                    background-color: #f2f2f2;
                    padding: 25px;
                }
            </style>
        </head>
        <body>
            <%
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;

                String vid = request.getParameter("vid");

                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");
                statement = connection.createStatement();
                String sql = "SELECT * FROM vehicle_details WHERE vid=" + vid;

                resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
            %>
            <hr>
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <h2>Update Vehicle Details</h2>
                        <form class="form-horizontal" method="post" name="vehicle_edit_form" action="vehicle_update">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-4 control-label">Vehicle ID</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control"  placeholder="Enter Vehicle Id" value="<%= resultSet.getInt("vid")%>" name="vid" id="vid">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-3 control-label">Registration no</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" placeholder="Enter Registration no" value="<%= resultSet.getString("register_no")%>" name="reg_no" id="reg_no">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-5 control-label" >Category</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" placeholder="Enter Category" value="<%= resultSet.getString("category")%>" name="category" id="category">
                                </div>
                            </div> 
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-5 control-label">Make</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control" placeholder="Enter Make" value="<%= resultSet.getString("make")%>" name="make" id="make">
                                </div>
                            </div> 
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-3 control-label">Model</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control"  placeholder="Enter Model" value="<%= resultSet.getString("model")%>" id="model" name="model">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-3 control-label">Year</label> 
                                <div class="col-sm-6">
                                    <input type="text" class="form-control"  placeholder="Enter Year" value="<%= resultSet.getString("year")%>" id="year" name="year">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-3 control-label">Color</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control"  placeholder="Enter Color" value="<%= resultSet.getString("color")%>" id="color" name="color">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-3 control-label">Mileage</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control"  placeholder="Enter Mileage" value="<%= resultSet.getString("mileage")%>" id="mileage" name="mileage">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-3 control-label">Monthly</label>
                                <div class="col-sm-6">
                                    <input type="text" class="form-control"  placeholder="Enter Monthly" value="<%= resultSet.getString("monthly")%>" id="monthly" name="monthly">
                                </div>
                            </div>    
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-6">
                                    <button type="submit" value="update" name="update" class="btn btn-block btn-secondary">Update Vehicle</button>
                                </div>
                            </div>
                        </form>    
                    </div>  
                    <div class="col-sm-6">
                        <h2>Update Availability Details</h2>
                        <form class="form-horizontal" method="post" name="vehicle_update_form" action="vehicle_update_availability">    
                            <div class="form-group" style ="width:45%; display:inline-block;">
                                <label>Vehicle ID</label>
                                <div style ="width:100%; display:inline-block;">
                                    <input type="text" class="form-control"  placeholder="" value="<%= resultSet.getInt("vid")%>" name="vid" id="vid">
                                </div>
                            </div>
                            </br>
                            <% }%>           
                            <%
                                Class.forName("com.mysql.jdbc.Driver");
                                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?useSSL=false", "root", "sliitpc16$97");
                                statement = connection.createStatement();
                                String sql2 = "SELECT * FROM vehicle_availability WHERE vid=" + vid;

                                resultSet = statement.executeQuery(sql2);
                                if (resultSet.next()) {
                            %>
                            <!--Pick Up update details -->
                            <div class="form-group" style ="width:45%; display:inline-block;">
                                <label>Pick Up day</label>
                                <div style ="width:100%; display:inline-block;">
                                    <input type="text" class="form-control"  placeholder="" value="<%= resultSet.getString("day")%>" name="update-pu-day" id="update-pu-day">
                                </div>
                            </div>
                            </br>
                            <div class="form-group" style ="width:45%; display:inline-block;">
                                <label>Pick Up Month</label>
                                <div style ="width:100%; display:inline-block;">
                                    <input type="text" class="form-control"  placeholder="" value="<%= resultSet.getString("month")%>" name="update-pu-month" id="update-pu-month">
                                </div>
                            </div>
                            </br>
                            <div class="form-group" style ="width:45%; display:inline-block;">
                                <label>Pick Up Year</label>
                                <div style ="width:100%; display:inline-block;">
                                    <input type="text" class="form-control"  placeholder="" value="<%= resultSet.getString("year")%>" name="update-pu-year" id="update-pu-year">
                                </div>
                            </div>
                            </br>
                            <!--Drop off update details -->
                            <div class="form-group" style ="width:45%; display:inline-block;">
                                <label>Drop Off day</label>
                                <div style ="width:100%; display:inline-block;">
                                    <input type="text" class="form-control"  placeholder="" value="<%= resultSet.getString("drop_day")%>" name="update-do-day" id="update-do-day">
                                </div>
                            </div>
                            </br>
                            <div class="form-group" style ="width:45%; display:inline-block;">
                                <label>Drop Off Month</label>
                                <div style ="width:100%; display:inline-block;">
                                    <input type="text" class="form-control"  placeholder="" value="<%= resultSet.getString("drop_month")%>" name="update-do-month" id="update-do-month">
                                </div>
                            </div>
                            </br>
                            <div class="form-group" style ="width:45%; display:inline-block;">
                                <label>Drop Off Year</label>
                                <div style ="width:100%; display:inline-block;">
                                    <input type="text" class="form-control"  placeholder="" value="<%= resultSet.getString("drop_year")%>" name="update-do-year" id="update-do-year">
                                </div>
                            </div>
                            </br>
                            </br>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-6">
                                    <button type="submit" value="update" name="update" class="btn btn-block btn-secondary">Update Availability</button>
                                </div>
                            </div>
                        </form> 
                        <% }%>
                    </div> 
                </div>       
            </div>     
            <br>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            <footer class="container-fluid text-center">
                <p> <span class="glyphicon glyphicon-copyright-mark"> Copyright
                    </br>Samarajeewa D -IT18189704</p>
            </footer>
        </body>
    </html>
</html>
