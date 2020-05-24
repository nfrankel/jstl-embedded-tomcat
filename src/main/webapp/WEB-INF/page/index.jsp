<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Show Foo</title>
</head>
<body>
<h1>Show Foo</h1>
<p>Foo: ${requestScope.foo}</p>
<p>Id: ${requestScope.foo.id}</p>
<p>Name: ${requestScope.foo.name}</p>
<h1>Another way to show Foo</h1>
<c:set var="foo" value="${requestScope.foo}" />
<p>Foo: ${foo}</p>
<p>Id: ${foo.id}</p>
<p>Name: ${foo.name}</p>
</body>
</html>
