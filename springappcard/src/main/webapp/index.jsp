<%@ include file="/WEB-INF/views/include.jsp"%>

<%--página de bienvenida 'index.jsp', la cual debería redireccionarnos
    a 'hello.htm' que es manejada por el DispatcherServlet, quien a su vez
    delega nuestra solicitud al controlador HelloController, que inserta
    la fecha y hora en el modelo y las pone a disposición de la vista 'hello.jsp'. --%>
<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<c:redirect url="/hello.htm" />