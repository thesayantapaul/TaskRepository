
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">        
        <title>Employee Management</title>      
        <link href="css/bootstrap.min.css" rel="stylesheet" >
        <link href="css/signin.css" rel="stylesheet">  
        <!-- Custom styles for this template -->
    </head>
    <body>

        <main class="form-signin w-25 m-auto">

            <c:set var = "emp"  value="${Emp}"/>
             

            <form action="SaveEmployee" method="Post">

<!--                <img class="mb-4" src="images/logo.PNG" alt="" width="300" height="100">-->
                <h1 class="h3 mb-3 fw-normal">Please edit employee data</h1>
                
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="first name" name="employeeId" value='${emp.getEmployeeId()}' readonly>
                    <label for="floatingInput">Employee Id</label>
                </div>
                    
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="first name" name="firstName" value=${emp.getFirstName()}>
                    <label for="floatingInput">First Name</label>
                </div>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="last name" name="lastName" value=${emp.getLastName()}>
                    <label for="floatingInput">Last Name</label>
                </div>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="address" name="address" value=${emp.getAddress()}>
                    <label for="floatingInput">Address</label>
                </div>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="phone" name="phone" value=${emp.getPhone()}>
                    <label for="floatingInput">Phone</label>
                </div>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="gender" name="gender" value=${emp.getGender()}>
                    <label for="floatingInput">Gender</label>
                </div>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="age" name="age" value=${emp.getAge()}>
                    <label for="floatingInput">Age</label>
                </div>
                  <div class="form-floating">
                    <select name="departmentId" class="form-select" id="departmentId">
                        <option value="" selected="selected">Select Department </option>
                        <option value="1">Accounts</option>
                        <option value="2">DevOps</option>
                        <option value="3">IT</option>
                        <option value="4">Fullstack</option>
                        <option value="5">Mulesoft</option>
                        <option value="6">Guideware</option>
                    </select>                         
                </div>

                <div class="form-floating">
                    <select name="roleId" class="form-select" id="roleId">
                        <option value="" selected="selected">Select Role </option>
                        <option value="1">Manager</option>
                        <option value="2">HR Manager</option>
                        <option value="3">Employee</option>
                    </select>
                </div>

               <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="basicSalary" name="basicSalary" value=${emp.getBasicSalary()}>
                    <label for="floatingInput">Basic Salary</label>
                </div>
                <div class="form-floating">
                    <input type="text" class="form-control" id="floatingInput" placeholder="carAllaowance" name="carAllaowance" value=${emp.getCarAllaowance()}>
                    <label for="floatingInput">Car Allowance</label>
                </div>

                <button class="w-100 btn btn-lg btn-primary" type="submit">Save</button>

            </form>
        </main>
    </body>
</html>
