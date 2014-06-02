package es.unileon.springappcard.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.unileon.springappcard.domain.Comission;
import es.unileon.springappcard.repository.ComissionDao;

/**
 * 
 * @author David Gómez Riesgo
 *
 */
@Component
public class SimpleComissionManager implements ComissionManager {

	private static final long serialVersionUID = 1L;

	@Autowired
	private ComissionDao comissionDao;

	/**
	 * Se modifica la capa de servicio para que haga uso de la persistencia en
	 * base de datos. El método getComissions usará ahora este DAO para
	 * recuperar la lista de comisiones. Finalmente, el método
	 * increaseComissions recuperará la lista de comisiones y, después de haber
	 * incrementado las comisiones, almacenará las comisiones de nuevo en la
	 * base de datos usando el método saveComission definido en el DAO.
	 * 
	 * @param comissionDao
	 */
	public void setComissionDao(ComissionDao comissionDao) {
		this.comissionDao = comissionDao;
	}

	public List<Comission> getComissions() {
		return comissionDao.getComissionList();
	}

	public void increaseComission(int percentage) {

	}

	public void increaseComissionCreditEmission(int percentage) {
		List<Comission> comissions = comissionDao.getComissionList();
		if (comissions != null) {
			/**
			 * Este es el for para aumentar en todas las comisiones el mismo
			 * valor for (Comission comission : comissions) { double
			 * newComission = comission.getComission().doubleValue() * (100 +
			 * percentage)/100; comission.setComission(newComission); } }
			 **/
			// Solo cambio el porcentaje de la primera comision.
			Iterator<Comission> iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(0))) {
					double newComission = comissions.get(0).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(0).setComission(newComission);
					comissionDao.saveComission(comissions.get(0));
				}
			}
		}
	}

	public void increaseComissionCreditMaintenance(int percentage) {
		List<Comission> comissions = comissionDao.getComissionList();
		if (comissions != null) {
			// Solo cambio el porcentaje de la segunda comision.
			Iterator<Comission> iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(1))) {
					double newComission = comissions.get(1).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(1).setComission(newComission);
					comissionDao.saveComission(comissions.get(1));
				}
			}
		}
	}

	public void increaseComissionCreditRenovate(int percentage) {
		List<Comission> comissions = comissionDao.getComissionList();
		if (comissions != null) {
			Iterator<Comission> iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(2))) {
					double newComission = comissions.get(2).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(2).setComission(newComission);
					comissionDao.saveComission(comissions.get(2));
				}
			}
		}
	}

	public void increaseComissionDebitEmission(int percentage) {
		List<Comission> comissions = comissionDao.getComissionList();
		if (comissions != null) {
			Iterator<Comission> iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(3))) {
					double newComission = comissions.get(3).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(3).setComission(newComission);
					comissionDao.saveComission(comissions.get(3));
				}
			}
		}
	}

	public void increaseComissionDebitMaintenance(int percentage) {
		List<Comission> comissions = comissionDao.getComissionList();
		if (comissions != null) {
			Iterator<Comission> iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(4))) {
					double newComission = comissions.get(4).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(4).setComission(newComission);
					comissionDao.saveComission(comissions.get(4));
				}
			}
		}
	}

	public void increaseComissionDebitRenovate(int percentage) {
		List<Comission> comissions = comissionDao.getComissionList();
		if (comissions != null) {
			Iterator<Comission> iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(5))) {
					double newComission = comissions.get(5).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(5).setComission(newComission);
					comissionDao.saveComission(comissions.get(5));
				}
			}
		}
	}
}