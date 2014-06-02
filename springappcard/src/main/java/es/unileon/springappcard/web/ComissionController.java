package es.unileon.springappcard.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.springappcard.service.ComissionManager;

/**
 * 
 * @author David Gómez Riesgo
 *
 */
/**
 *En Spring Web MVC, los componentes @Controller manejan las solicitudes y 
 *devuelven normalmente un objeto ModelAndView. En este caso, uno llamado 'hello.jsp',
 * el cual hace referencia al nombre del archivo JSP que vamos a crear a continuación.
 *  El modelo que esta clase devuelve es resuelto a través del ViewResolver. 
 *  Puesto que no hemos definido explicítamente un ViewResolver, vamos a obtener uno por defecto de Spring
 *
 */
/**
 * El controlador ahora hace referencia a la vista por su nombre lógico mediante
 *  el uso del 'InternalResourceViewResolver' definido en 'app-config.xml'.
 *
 */
@Controller
public class ComissionController {

	protected final Log logger = LogFactory.getLog(getClass());

	//@Autowired Referencia a ComissionManager para que Spring la pueda inyectar automáticamente cuando detecte el componente.
	@Autowired
	private ComissionManager comissionManager;

	@RequestMapping(value = "/hello.htm")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String now = (new Date()).toString();
		logger.info("Returning hello view with " + now);
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("comissions", this.comissionManager.getComissions());
		return new ModelAndView("hello", "model", myModel);
	}

	public void setComissionManager(ComissionManager comissionManager) {
		this.comissionManager = comissionManager;
	}
}