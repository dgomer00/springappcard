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

@Controller
@RequestMapping(value="comissionincrease.htm")
public class ComissionIncreaseFormController {
	 /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ComissionManager comissionManager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid ComissionIncrease comissionIncrease, BindingResult result)
    {
        if (result.hasErrors()) {
            return "comissionincrease";
        }
		
        int increase = comissionIncrease.getPercentage();
        logger.info("Increasing comission by " + increase + "%.");

        comissionManager.increaseComission(increase);

        return "redirect:/hello.htm";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected ComissionIncrease formBackingObject(HttpServletRequest request) throws ServletException {
        ComissionIncrease comissionIncrease = new ComissionIncrease();
        comissionIncrease.setPercentage(2);
        return comissionIncrease;
    }

    public void setProductManager(ComissionManager comissionManager) {
        this.comissionManager = comissionManager;
    }

    public ComissionManager getComissionManager() {
        return comissionManager;
    }

}