
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.payment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!doctype html>
    <html lang="en">
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <link rel="stylesheet" href="asset/vehicle-add-css.css">
            <title>Add Vehicle </title>
            <style>
                footer {
                    background-color: #f2f2f2;
                    padding: 25px;
                }
            </style>
        </head>
        <body>
            <h2 class="text-center mt-3 col-sm-5 mb-3">Vehicle Details</h2>
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="leftside">
                            <form class="form-horizontal" method="post" action="vehicle_InsertData">
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-3 control-label">Registration no</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Registration no" name="reg_no">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-5 control-label">Category</label>
                                    <div class="col-sm-5">

                                        <select class="form-control" name="category">
                                            <option>Economy</option>
                                            <option>Compact</option>
                                            <option>Standard Sedan</option>
                                            <option>Mini Van</option>
                                        </select>
                                    </div>
                                </div> 
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-5 control-label">Make</label>
                                    <div class="col-sm-5">

                                        <select class="form-control" name="make">
                                            <option>Toyota </option>
                                            <option>Nissan </option>
                                            <option>Suzuki </option>
                                            <option>Mazda </option>
                                        </select>
                                    </div>
                                </div> 
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-3 control-label">Model</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Model" name="model">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-3 control-label">Year</label>
                                    <div class="col-sm-5">
                                        <input type="number" class="form-control" id="inputFirstName" placeholder="Enter Year" name="year">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-3 control-label">Color</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Color" name="color">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-3 control-label">Mileage</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Mileage" name="mileage">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-3 control-label">Monthly Rent</label>
                                    <div class="col-sm-5">
                                        <input type="number" class="form-control" id="inputFirstName" placeholder="Enter Monthly Rent" name="monthly">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-5">
                                        <button type="submit" class="btn btn-block btn-success">Add Details</button>
                                    </div>
                                </div>
                        </div>
                    </div>
                </div>
            </form>
            <br>
            <%@page import="java.sql.DriverManager"%>
            <%@page import="java.sql.ResultSet"%>
            <%@page import="java.sql.Statement"%>
            <%@page import="java.sql.Connection"%>
            <%
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;
            %><br>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            <footer class="container-fluid text-center">
                <p> <span class="glyphicon glyphicon-copyright-mark"> Copyright
                    </br>Samarajeewa D -IT18189704</p>
            </footer>
    </body>
</html>
