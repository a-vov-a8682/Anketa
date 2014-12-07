
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Anketa</title>
  </head>
  <body>
<form action="/anketa" method="POST">

  First name: <input type="text" name="firstname"><br>
  Last name:  <input type="text" name="lastname"><br>
  Age:        <input type="text" name="age"><br>
  Phone:      <input type="text" name="phone"><br>
  <br>
  <p>Do you like animals?</p>
  <input type="radio" name="animal" value="yes">Yes <input type="radio" name="animal" value="no">No<br>
  <p>What is the capital of Great Britain?</p>
  <input type="radio" name="capital" value="berlin">Berlin <input type="radio" name="capital" value="london">London<br>
  <p>Who is putin?</p>
  <input type="radio" name="putin" value="Huylo">Хуйло <input type="radio" name="putin" value="veryhuylo">Очень Хуйло<br>
  <br>
  <button>Send</button>


</form>
  </body>
</html>
