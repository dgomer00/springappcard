<%@ include file="/WEB-INF/views/include.jsp"%>

<%-- Esta es la página de bienvenida que se muestra al arrancar la aplicación--%>

<%--Es el modelAnd view devuelto por el controlador (La vista)  --%>
<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<h1>
		<fmt:message key="heading" />
	</h1>
	<p>
		<fmt:message key="greeting" />
		<c:out value="${model.now}" />
	</p>
	<h3>Comissions</h3>
	<c:forEach items="${model.comissions}" var="commi">
		<c:out value="${commi.description}" />
		<i>$<c:out value="${commi.comission}" /></i>
		<br>
		<br>
	</c:forEach>
	<br>
	<a href="<c:url value="comissionincrease.htm"/>">Increase
		Comissions</a>
	<br>
</body>
</html>
