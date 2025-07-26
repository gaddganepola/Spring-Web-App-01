<%@page language="java" %>
<html>
<head>
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
  <div class="container">
    <h1>Enter Two Numbers</h1>

    <form action="/add"">
      <input type="number" name="num1" id="num1" placeholder="First number" required />
      <input type="number" name="num2" id="num2" placeholder="Second number" required />
      <button type="submit">Submit</button>
    </form>

    <form action="/alien">
        <button type="submit">Add Alien</button>
    </form>
  </div>
</body>
</html>