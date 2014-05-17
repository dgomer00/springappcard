<%@ include file="/WEB-INF/views/include.jsp" %>


<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Comissions</h3>
    <c:forEach items="${model.comissions}" var="commi">
      <c:out value="${commi.description}"/> <i>$<c:out value="${commi.comission}"/></i><br><br>
    </c:forEach>
    <br>
    <br>
    <a href="<c:url value="comissionincrease.htm"/>">Increase Comissions</a>
  </body>
</html>
