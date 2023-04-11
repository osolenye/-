<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h1>spring boot</h1>
<hr>
<h4>product details</h4>
<b>product name: </b>${product.title}<br>
<b>product desc: </b>${product.description}<br>
<b>product author: </b>${product.author}<br>
<b>product price: </b>${product.price}<br>
<b>product city: </b>${product.city}<br>
<h3>new product</h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="delete product"/>
</form>




</body>
</html>
