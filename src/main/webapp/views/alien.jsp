<%@page language="java" %>
<html>
<head>
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
  <div class="container">
    <h1>Add Alien</h1>

    <form action="/addAlien">
      <input type="text" name="aid" id="aid" placeholder="Alien ID" required />
      <input type="text" name="aname" id="aname" placeholder="Alien Name" required />
      <button type="submit">Add Alien</button>
    </form>

    <p>Welcome to the ${course} course</p>

  </div>
</body>
</html>