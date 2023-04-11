<!DOCTYPE html>
<html>
<head>

</head>
<body>
    <h1>spring boot</h1>
    <hr>
    <h4>products</h4>

    <form action="/" method="get">
        Search by the titile of ad: <input type="text" name="title">
        <input type="submit" value="search">
    </form>
<#--    это как цикл, примерно так же как и в тимлифе делаем и передаем аргументы-->
    <#list products as product>
        <div>
            <p>${product.author}</p>
            <p>${product.city}</p>
            <p>${product.description}</p>
            <p>${product.title}</p>
            <p>${product.price}</p>
            <a href="/product/${product.id}">details</a>
        </div>
    </#list>

    <hr>
<#--    добавляет продукт как в тифлиме. Создаем форму и передаем значения.-->
<h3>new product</h3>
    <form action="/product/create" method="post">
        product name: <input type="text" name="title">
        product description: <input type="text" name="description">
        product author: <input type="text" name="author">
        product price: <input type="number" name="price">
        product city: <input type="text" name="city">
        <input type="submit" value="add product"/>
    </form>




</body>
</html>
