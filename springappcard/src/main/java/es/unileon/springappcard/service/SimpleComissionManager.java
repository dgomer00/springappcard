package es.unileon.springappcard.service;

import java.util.Iterator;
import java.util.List;

import es.unileon.springappcard.domain.Comission;

public class SimpleComissionManager implements ComissionManager {

	private static final long serialVersionUID = 1L;

	private List<Comission> comissions;

	public List<Comission> getComissions() {
		return comissions;
	}

	public void increaseComission(int percentage) {

	}

	public void setComissions(List<Comission> comissions) {
		this.comissions = comissions;
	}

	public void increaseComissionCreditEmission(int percentage) {
		if (comissions != null) {
			/**
			 * for (Comission comission : comissions) { double newComission =
			 * comission.getComission().doubleValue() * (100 + percentage)/100;
			 * comission.setComission(newComission); } }
			 **/
			// Solo cambio el porcentaje de la primera comision.
			Iterator iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(0))) {
					double newComission = comissions.get(0).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(0).setComission(newComission);
				}
			}
		}

	}

	public void increaseComissionCreditMaintenance(int percentage) {
		if (comissions != null) {
			/**
			 * for (Comission comission : comissions) { double newComission =
			 * comission.getComission().doubleValue() * (100 + percentage)/100;
			 * comission.setComission(newComission); } }
			 **/
			// Solo cambio el porcentaje de la segunda comision.
			Iterator iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(1))) {
					double newComission = comissions.get(1).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(1).setComission(newComission);
				}
			}
		}

	}

	public void increaseComissionCreditRenovate(int percentage) {
		if (comissions != null) {
			/**
			 * for (Comission comission : comissions) { double newComission =
			 * comission.getComission().doubleValue() * (100 + percentage)/100;
			 * comission.setComission(newComission); } }
			 **/
			Iterator iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(2))) {
					double newComission = comissions.get(2).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(2).setComission(newComission);
				}
			}

		}
	}

	public void increaseComissionDebitEmission(int percentage) {
		if (comissions != null) {
			/**
			 * for (Comission comission : comissions) { double newComission =
			 * comission.getComission().doubleValue() * (100 + percentage)/100;
			 * comission.setComission(newComission); } }
			 **/
			Iterator iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(3))) {
					double newComission = comissions.get(3).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(3).setComission(newComission);
				}
			}

		}

	}

	public void increaseComissionDebitMaintenance(int percentage) {
		if (comissions != null) {
			/**
			 * for (Comission comission : comissions) { double newComission =
			 * comission.getComission().doubleValue() * (100 + percentage)/100;
			 * comission.setComission(newComission); } }
			 **/
			Iterator iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(4))) {
					double newComission = comissions.get(4).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(4).setComission(newComission);
				}
			}

		}

	}

	public void increaseComissionDebitRenovate(int percentage) {
		if (comissions != null) {
			/**
			 * for (Comission comission : comissions) { double newComission =
			 * comission.getComission().doubleValue() * (100 + percentage)/100;
			 * comission.setComission(newComission); } }
			 **/
			Iterator iter = comissions.iterator();
			while (iter.hasNext()) {
				if (iter.next().equals(comissions.get(5))) {
					double newComission = comissions.get(5).getComission()
							.doubleValue()
							* (100 + percentage) / 100;
					comissions.get(5).setComission(newComission);
				}
			}

		}

	}
}