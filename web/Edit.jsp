
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
            <!-- Required meta tags -->
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

            <!-- Bootstrap CSS -->
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
            <link rel="stylesheet" href="asset/index-css.css">
            <title>Payments Portal </title>
        </head>
        <body>
            <nav class="navbar navbar-expand-sm navbar-light" id="nav">
                <ul>
                    <li><a href="AddPayment.jsp"><button type="button" class="btn btn-success">Add Payment Details</button></a></li>
                    <li><a href="ViewPayments.jsp"><button type="button" class="btn btn-info">View All Payments</button></a></li>
                    <li ><a href="UpdatePayment.jsp"><button type="button" class="btn btn-secondary">Update Payments</button></a></li>
                    <li><a href="#"><button type="button" class="btn btn-danger">Delete Payments</button></a></li>

                </ul>
            </nav>


            <%

                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;

                String pid = request.getParameter("pid");

                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments?useSSL=false", "root", "sliitpc16$97");
                statement = connection.createStatement();
                String sql = "SELECT * FROM payment_details WHERE pid=" + pid;

                resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
            %>
            <hr>

            <h2 class="text-center mt-3 col-sm-5 mb-3">Update Payment</h2>

            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <form class="form-horizontal" method="post" name="edit-form" action="UpdateServlet">
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-3 control-label">Payment ID</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Customer Name" value="<%= resultSet.getInt("pid")%>" name="pid" id="pid">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-3 control-label">Customer Name</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Customer Name" value="<%= resultSet.getString("customer_name")%>" name="customer_name" id="customer_name">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-5 control-label">Amount</label>
                                <div class="col-sm-5">
                                    <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Amount" value="<%= resultSet.getString("amount")%>" name="amount" id="amount">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="inputEmail3"  class="col-sm-5 control-label">Payment Type</label>
                                <div class="col-sm-5">

                                    <!--<select class="form-control" id="payment_type" value="<%= resultSet.getString("payment_type")%>" name="payment_type">
                                        <option>Credit Card </option>
                                        <option>Cash</option>
                                    </select>-->
                                    <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Payment Type"  value="<%= resultSet.getString("payment_type")%>" name="payment_type" id="payment_type">
                                </div>
                            </div>   




                            <div class="form-group">
                                <label for="inputEmail3" class="col-sm-5 control-label">Discount(%)</label>
                                <div class="col-sm-5">
                                    <!--<select class="form-control" id="discount" value="<%= resultSet.getInt("discount")%>" name="discount">
                                        <option>10 </option>
                                        <option>15</option>
                                    </select>-->
                                    <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Discount"  value="<%= resultSet.getString("discount")%>" name="discount" id="discount"> 
                                </div>
                            </div>    


                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-5">
                                    <button type="submit" value="update" name="update" class="btn btn-block btn-secondary">Update Payment</button>
                                </div>
                            </div>
                        </form> 
                        <% }%>
                        <br>















                        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
                        </body>
                        </html>
