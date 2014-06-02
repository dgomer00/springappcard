package es.unileon.springappcard.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.unileon.springappcard.service.ComissionIncrease;
import es.unileon.springappcard.service.ComissionManager;

/**
 * 
 * @author David G�mez Riesgo
 *
 */

/**
 * Controlador de formulario actuar� como controlador de las peticiones de
 * incremento de comisi�n realizadas desde el formulario. Spring inyectar�
 * autom�ticamente al controlador del formulario la referencia al servicio
 * ComisionManager gracias a la anotaci�n @Autowired. El m�todo
 * formBackingObject(..) ser� invocado antes de que el formulario se muestre al
 * usuario (petici�n GET) y rellenar� el campo con un incremento por defecto de
 * un 2%. El m�todo onSubmit(..) ser� invocado cuando el usuario env�e del
 * formulario a trav�s del m�todo POST. El uso de la anotaci�n @Valid permitir�
 * validar el incremento introducido y volver� a mostrar el formulario en caso
 * de que �ste no sea v�lido.
 */
@Controller
@RequestMapping(value = "comissionincrease.htm")
public class ComissionIncreaseFormController {
	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private ComissionManager comissionManager;

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@Valid ComissionIncrease comissionIncrease,
			BindingResult result) {

		if (result.hasErrors()) {
			return "comissionincrease";
		}

		int increaseCreditEmission = comissionIncrease
				.getPercentageCreditEmission();
		logger.info("Increasing comission by " + increaseCreditEmission + "%.");
		comissionManager
				.increaseComissionCreditEmission(increaseCreditEmission);

		int increaseCreditMaintenance = comissionIncrease
				.getPercentageCreditMaintenance();
		logger.info("Increasing comission by " + increaseCreditMaintenance
				+ "%.");
		comissionManager
				.increaseComissionCreditMaintenance(increaseCreditMaintenance);

		int increaseCreditRenovate = comissionIncrease
				.getPercentageCreditRenovate();
		logger.info("Increasing comission by " + increaseCreditRenovate + "%.");
		comissionManager
				.increaseComissionCreditRenovate(increaseCreditRenovate);

		int increaseDebitEmission = comissionIncrease
				.getPercentageDebitEmission();
		logger.info("Increasing comission by " + increaseDebitEmission + "%.");
		comissionManager.increaseComissionDebitEmission(increaseDebitEmission);

		int increaseDebitMaintenance = comissionIncrease
				.getPercentageDebitMaintenance();
		logger.info("Increasing comission by " + increaseDebitMaintenance
				+ "%.");
		comissionManager
				.increaseComissionDebitMaintenance(increaseDebitMaintenance);

		int increaseDebitRenovate = comissionIncrease
				.getPercentageDebitRenovate();
		logger.info("Increasing comission by " + increaseDebitRenovate + "%.");
		comissionManager.increaseComissionDebitRenovate(increaseDebitRenovate);

		return "redirect:/hello.htm";
	}

	@RequestMapping(method = RequestMethod.GET)
	protected ComissionIncrease formBackingObject(HttpServletRequest request)
			throws ServletException {
		ComissionIncrease comissionIncrease = new ComissionIncrease();
		comissionIncrease.setPercentageCreditEmission(2);
		comissionIncrease.setPercentageCreditMaintenance(2);
		comissionIncrease.setPercentageCreditRenovate(2);
		comissionIncrease.setPercentageDebitEmission(2);
		comissionIncrease.setPercentageDebitMaintenance(2);
		comissionIncrease.setPercentageDebitRenovate(2);
		return comissionIncrease;
	}

	public void setProductManager(ComissionManager comissionManager) {
		this.comissionManager = comissionManager;
	}

	public ComissionManager getComissionManager() {
		return comissionManager;
	}

}