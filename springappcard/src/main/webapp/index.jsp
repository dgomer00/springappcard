<%@ include file="/WEB-INF/views/include.jsp"%>

<%--p�gina de bienvenida 'index.jsp', la cual deber�a redireccionarnos
    a 'hello.htm' que es manejada por el DispatcherServlet, quien a su vez
    delega nuestra solicitud al controlador HelloController, que inserta
    la fecha y hora en el modelo y las pone a disposici�n de la vista 'hello.jsp'. --%>
<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<c:redirect url="/hello.htm" />