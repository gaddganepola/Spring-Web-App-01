<%@page language="java" %>
<html>
<head>
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
  <div class="container">
    <h1>Result is: <%= session.getAttribute("result") %> </h1>
    <h1>Result is: ${result} </h1>
    <h1>Result is: <%= request.getAttribute("result") %></h1>

    <p>Welcome to the ${course} course</p>
  </div>
</body>
</html>