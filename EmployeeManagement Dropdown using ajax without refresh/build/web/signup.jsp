<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.104.2">
        <title>Sign Up - Employee Management</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta name="theme-color" content="#712cf9">
        <link href="css/signin.css" rel="stylesheet">

    </head>
    <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" 
            crossorigin="anonymous">
    </script>

    <!--    <script>
            function submitForm(event) {
                if (event.target.id === "countryCode") {
                    stateCode.value = 0;
                }
                signupForm.setAttribute("action", "PreSignUp");
                signupForm.submit();
            }
        </script>-->
    <script>
        function fetchContent(selectedId, targetId) {
            $.ajax({
                url: 'PreSignUp',
                data: {
                    [selectedId]: $("#" + selectedId).val()
                },
                success: function (responseText) {
                    $("#" + targetId).html(responseText);
                }
            });
        }
    </script>

    <body class="text-center">
        <main class="form-signin w-100 m-auto">
            <form action="SignUp"  id="signupForm" method="post">
                <img class="mb-4" src="images/flower-logo.jpg" alt="" width="200" height="200">
                <h1 class="h3 mb-3 fw-normal">Please provide below information</h1>

                <div class="form-floating">
                    <input name="firstName" type="text" class="form-control" id="firstName" placeholder="first name" value="${User.firstName}">
                    <label for="firstName">First Name</label>
                </div>
                <div class="form-floating">
                    <input name="lastName" type="text" class="form-control" id="lastName" placeholder="last name"value="${User.lastName}">
                    <label for="floatingInput">Last Name</label>
                </div>
                <div class="form-floating">
                    <input name = "emailAddress" type="email" class="form-control" id="floatingInput" placeholder="name@example.com" value="${User.emailAddress}">
                    <label for="floatingInput">Email address</label>
                </div>
                <div class="form-floating">
                    <input name="password" type="password" class="form-control" id="floatingPassword" placeholder="Password" value="${User.password}">
                    <label for="floatingPassword">Password</label>
                </div>
                <div class="form-floating">
                    <input name="phone" type="text" class="form-control" id="phoneNumber" placeholder="phone number" value="${User.phone}">
                    <label for="floatingInput">Phone Number</label>
                </div>
                <div class="form-floating">
                    <select name="countryCode" class="form-select" id="countryCode" onchange="fetchContent('countryCode', 'stateCode')">
                        <option value="">Select a Country</option>
                        <c:forEach items="${CountryList}" var="country">
                            <option value='${country.getCountryCode()}' <c:if test="${country.getCountryCode() == User.getCountryCode()}" > selected </c:if>> 
                                ${country.getCountryName()}
                            </option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-floating">
                    <select name="stateCode" class="form-select" id="stateCode" onchange="fetchContent('stateCode', 'distCode')">
                        <option value="" hidden>Select a Province</option>
                    </select>
                </div>
                <div class="form-floating">
                    <select name="distCode" class="form-select" id="distCode" required>
                        <option value="" hidden>Select a District</option>
                    </select>
                </div>
                <button class="w-100 btn btn-lg btn-primary" type="submit">Sign Up</button>
                <a href="landingPage.jsp">
                    <button type="button" class="w-100 btn btn-lg btn-warning">Cancel</button>
                </a>
            </form>
        </main>
    </body>
</html>
