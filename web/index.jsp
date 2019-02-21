<%--
  Created by IntelliJ IDEA.
  User: KienTMDT
  Date: 2/21/2019
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Price discount calculator</h1>
  <form method="post" action="/calculate">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>Product description </td>
          <td><input name="description" type="text"/></td>
        </tr>
        <tr>
          <td>List Price: </td>
          <td><input name="price" type="text"/></td>
        </tr>
        <tr>
          <td>Discount percent: </td>
          <td><input name="discount" type="text"/></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Calculate"/></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
  </body>
</html>
