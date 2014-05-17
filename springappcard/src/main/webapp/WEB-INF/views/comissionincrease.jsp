<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
    .error { color: red; }
  </style>  
</head>
<body>
<h1><fmt:message key="comissionincrease.heading"/></h1>
<form:form method="post" commandName="comissionIncrease">  
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="25%">Comission Credit Emission (%):</td>
        <td width="20%">
          <form:input path="percentageCreditEmission"/>
        </td>
        <td width="60%">
          <form:errors path="percentageCreditEmission" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
    <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="25%">Comission Credit Maintenance (%):</td>
        <td width="20%">
          <form:input path="percentageCreditMaintenance"/>
        </td>
        <td width="60%">
          <form:errors path="percentageCreditMaintenance" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
      <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="25%">Comission Credit Renovate (%):</td>
        <td width="20%">
          <form:input path="percentageCreditRenovate"/>
        </td>
        <td width="60%">
          <form:errors path="percentageCreditRenovate" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
      <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="25%">Comission Debit Emission (%):</td>
        <td width="20%">
          <form:input path="percentageDebitEmission"/>
        </td>
        <td width="60%">
          <form:errors path="percentageDebitEmission" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
      <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="25%">Comission Debit Maintenance (%):</td>
        <td width="20%">
          <form:input path="percentageDebitMaintenance"/>
        </td>
        <td width="60%">
          <form:errors path="percentageDebitMaintenance" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
      <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="25%">Comission Debit Renovate (%):</td>
        <td width="20%">
          <form:input path="percentageDebitRenovate"/>
        </td>
        <td width="60%">
          <form:errors path="percentageDebitRenovate" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
<input type="submit" value="Execute">
</form:form>
<a href="<c:url value="hello.htm"/>">Home</a>
</body>
</html>