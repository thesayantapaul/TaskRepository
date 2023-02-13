
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--        <link href="css/header.css" rel="stylesheet">-->
        <link rel="stylesheet" href="css/all.min.css">
        <link rel="stylesheet" href="css/reset-min.css">
        <link rel="stylesheet" href="css/algolia-min.css">
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/docs.min.css">
        <link rel="stylesheet" href="css/index.css">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/menu_css.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="css/product.css" rel="stylesheet">
        <!--<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>-->
        <title>Employee Management</title>
    </head>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!<!-- I want to check my session before showing any content to the user -->




    <jsp:include page="menu.jsp"></jsp:include>

        <div id="example">
            <script>
                init({
                    title: 'Large data',
                    //desc: 'Use `virtualScroll` to enable the virtual scroll to play with large data sets (10000 rows).',
                    links: ['bootstrap-table.min.css'],
                    scripts: ['bootstrap-table.min.js']
                })
            </script>



            <div class="bootstrap-table bootstrap5">
                <div class="table-toolbar"><div class="bs-bars float-left">

                    </div><div class="columns columns-right btn-group float-right"><div class="keep-open btn-group" title="Columns">
                            <div class="dropdown-menu dropdown-menu-right" style=""><label class="dropdown-item dropdown-item-marker"><input type="checkbox" data-field="id" value="0" checked="checked"> <span>ID</span></label><label class="dropdown-item dropdown-item-marker"><input type="checkbox" data-field="name" value="1" checked="checked"> <span>Item Name</span></label><label class="dropdown-item dropdown-item-marker"><input type="checkbox" data-field="price" value="2" checked="checked"> <span>Item Price</span></label></div></div></div></div>

                <!--                <div class="table-responsive" style="height: 542px; padding-bottom: 50.5px;">-->

                <div class="table-responsive" data-spy="scroll">
                    <table id="table"  class="table table-bordered table-hover" style="margin-top: -9.5px;">
                        <thead>
                        <c:choose>
                            <c:when test = "${requestScope.noData != null}">
                                <tr>
                                    <td colspan="5">
                                        <h2 style="border:2px solid rgb(255, 99, 71); background-color:rgba(255, 99, 71, 0.5); font-size:15px;">
                                            <c:out value="${requestScope.noData}"> </c:out>
                                            </h2>
                                        </td>
                                    </tr>
                            </c:when>
                        </c:choose>
                        <tr>
                            <th>Employee Id</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Address</th>
                            <th>Phone</th>
                            <th>Gender</th>
                            <th>Age</th>
                            <th>Department</th>
                            <th>Role</th>
                            <th>Basic salary</th>
                            <th>Car Allowance</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var = "emp" items = "${EmpList}">
                            <tr>
                                <td>
                                    ${emp.getEmployeeId()}
                                </td>
                                <td>
                                    ${emp.getFirstName()}
                                </td>
                                <td>
                                    ${emp.getLastName()}
                                </td>
                                <td>
                                    ${emp.getAddress()}
                                </td>
                                <td>
                                    ${emp.getPhone()}
                                </td>
                                <td>
                                    ${emp.getGender()}
                                </td>
                                <td>
                                    ${emp.getAge()}
                                </td>
                                <td>
                                    ${emp.getDepartmentName()}
                                </td>
                                <td>
                                    ${emp.getRoleName()}
                                </td>
                                <td>
                                    ${emp.getBasicSalary()}
                                </td>
                                <td>
                                    ${emp.getCarAllaowance()}
                                </td>
                                <td> 

                                    <a href=EditEmployee?employeeId=${emp.getEmployeeId()}>
                                        Edit
                                    </a>

                                </td>
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
            </div>

            </html>
