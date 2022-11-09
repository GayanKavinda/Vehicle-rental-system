

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
            <link rel="stylesheet" href="asset/yourpay.css">
            <title>Check Your Payments </title>
        </head>
        <body>

            <hr>

            <h2 class="text-center mt-3 col-sm-5 mb-3">Check Your Payments</h2>

            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="leftside">
                            <form class="form-horizontal" method="post" action="">
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-3 control-label">Customer Name</label>
                                    <div class="col-sm-5">
                                        <input type="text" class="form-control" id="inputFirstName" placeholder="Enter Customer Name" name="customer_name">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-5">
                                        <button type="submit" value="check" name="check" class="btn btn-block btn-success">Check Your Payments</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

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

            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="view">
                            <table id="table" class="t1" align="center" cellpadding="5" cellspacing="5" border="1">
                                <tr>

                                </tr>
                                <tr bgcolor="lightgreen">
                                    <th><b>ID</b></th>
                                    <th><b>Customer Name</b></th>
                                    <th><b>Amount</b></th>
                                    <th><b>Payment Type</b></th>
                                    <th><b>Discount(%)</b></th>
                                    <td><b>Discounted Price</b></td>


                                </tr>
                                <%
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payments?useSSL=false", "root", "sliitpc16$97");
                                        statement = connection.createStatement();

                                        if (request.getParameter("check") != null) {

                                            String name = request.getParameter("customer_name");
                                            String sql = ("SELECT * from payment_details WHERE customer_name='" + name + "'");

                                            resultSet = statement.executeQuery(sql);
                                            while (resultSet.next()) {
                                %>
                                <tr bgcolor="#DEB887">

                                    <td><%=resultSet.getString("pid")%></td>
                                    <td><%=resultSet.getString("customer_name")%></td>
                                    <td><%=resultSet.getString("amount")%></td>
                                    <td><%=resultSet.getString("payment_type")%></td>
                                    <td><%=resultSet.getString("discount")%></td>
                                    <td><%=Double.parseDouble(resultSet.getString("amount")) - Double.parseDouble(resultSet.getString("amount")) * Double.parseDouble(resultSet.getString("discount")) / 100%></td>


                                </tr>

                                <%
                                            }
                                        }

                                    } catch (Exception e) {
                                        out.println(e);
                                    }
                                %>
                            </table>
                        </div>
                    </div>
                </div>
            </div>










             <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        </body>
    </html>
