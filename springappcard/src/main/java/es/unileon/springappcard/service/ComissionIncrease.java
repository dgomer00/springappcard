package es.unileon.springappcard.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ComissionIncrease {
   
	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Min(0)
    @Max(15)
    private int percentageCreditEmission;
    @Min(0)
    @Max(15)
    private int percentageCreditMaintenance;
    @Min(0)
    @Max(15)
    private int percentageCreditRenovate;
    @Min(0)
    @Max(15)
    private int percentageDebitEmission;
    @Min(0)
    @Max(15)
    private int percentageDebitMaintenance;
    @Min(0)
    @Max(15)
    private int percentageDebitRenovate;



    public int getPercentageCreditEmission() {
		return percentageCreditEmission;
	}

	public void setPercentageCreditEmission(int percentageCreditEmission) {
		this.percentageCreditEmission = percentageCreditEmission;
        logger.info("Percentage set to " + percentageCreditEmission);
	}

	public int getPercentageCreditMaintenance() {
		return percentageCreditMaintenance;
	}

	public void setPercentageCreditMaintenance(int percentageCreditMaintenance) {
		this.percentageCreditMaintenance = percentageCreditMaintenance;
		logger.info("Percentage set to " + percentageCreditMaintenance);
	}

	public int getPercentageCreditRenovate() {
		return percentageCreditRenovate;
	}

	public void setPercentageCreditRenovate(int percentageCreditRenovate) {
		this.percentageCreditRenovate = percentageCreditRenovate;
		logger.info("Percentage set to " + percentageCreditRenovate);
	}

	public int getPercentageDebitEmission() {
		return percentageDebitEmission;
	}

	public void setPercentageDebitEmission(int percentageDebitEmission) {
		this.percentageDebitEmission = percentageDebitEmission;
		logger.info("Percentage set to " + percentageDebitEmission);
	}

	public int getPercentageDebitMaintenance() {
		return percentageDebitMaintenance;
	}

	public void setPercentageDebitMaintenance(int percentageDebitMaintenance) {
		this.percentageDebitMaintenance = percentageDebitMaintenance;
		logger.info("Percentage set to " + percentageDebitMaintenance);
	}

	public int getPercentageDebitRenovate() {
		return percentageDebitRenovate;
	}

	public void setPercentageDebitRenovate(int percentageDebitRenovate) {
		this.percentageDebitRenovate = percentageDebitRenovate;
		logger.info("Percentage set to " + percentageDebitRenovate);
	}


}