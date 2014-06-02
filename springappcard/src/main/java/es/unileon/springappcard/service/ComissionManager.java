package es.unileon.springappcard.service;

import es.unileon.springappcard.domain.Comission;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author David Gómez Riesgo
 *
 */
/**
 * creamos el servicio ComissionManager. Éste es el servicio responsable de
 * gestionar las comisiones
 *
 */
public interface ComissionManager extends Serializable {

	public void increaseComissionCreditEmission(int percentage);

	public void increaseComissionCreditMaintenance(int percentage);

	public void increaseComissionCreditRenovate(int percentage);

	public void increaseComissionDebitEmission(int percentage);

	public void increaseComissionDebitMaintenance(int percentage);

	public void increaseComissionDebitRenovate(int percentage);

	public List<Comission> getComissions();

}
