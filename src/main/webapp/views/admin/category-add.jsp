<%--
  Created by IntelliJ IDEA.
  User: nhoclahola
  Date: 9/30/2024
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Add Category</title>
</head>
<body>
    <a href="<c:url value="/admin/categories"/>">Back to Category list</a>
    <form role="form" action="${pageContext.request.contextPath}/admin/category/insert" method="post" enctype="multipart/form-data">
        <div class="form-group">
            <label>Category name:</label>
            <input class="form-control"
                   placeholder="Please enter category name" name="categoryName" required/>
        </div>
        <div class="form-group">
            <label>Status: </label>
            <br/>
            <input type="radio" id="active" name="status" value="1" required>
            <label for="active">Active</label><br>
            <input type="radio" id="lock" name="status" value="0">
            <label for="lock">Locked</label>
        </div>
        <div>
            <label for="image-link">Import image using link: </label>
            <input type="text" name="imageLink" id="image-link">
        </div>
        <div class="form-group">
            <label>Import image using image file: </label>
            <input type="file" name="image" accept="image/*"/>
        </div>
        <button type="submit" class="btn btn-default">Add
        </button>
        <button type="reset" class="btn btn-primary">Reset
        </button>
    </form>
</body>
</html>
