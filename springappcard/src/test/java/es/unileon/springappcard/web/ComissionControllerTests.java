package es.unileon.springappcard.web;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.springappcard.domain.Comission;
import es.unileon.springappcard.repository.InMemoryComissionDao;
import es.unileon.springappcard.service.SimpleComissionManager;

public class ComissionControllerTests {

	@Test
	public void testHandleRequestView() throws Exception {
		ComissionController controller = new ComissionController();
		SimpleComissionManager scm = new SimpleComissionManager();
		scm.setComissionDao(new InMemoryComissionDao(new ArrayList<Comission>()));
		controller.setComissionManager(scm);
		//controller.setComissionManager(new SimpleComissionManager());
		ModelAndView modelAndView = controller.handleRequest(null, null);
		assertEquals("hello", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		@SuppressWarnings("unchecked")
		Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
		String nowValue = (String) modelMap.get("now");
		assertNotNull(nowValue);
	}

}