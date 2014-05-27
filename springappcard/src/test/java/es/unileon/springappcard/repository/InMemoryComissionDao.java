package es.unileon.springappcard.repository;

import java.util.List;

import es.unileon.springappcard.domain.Comission;

/**
 * 
 * @author David Gómez Riesgo
 *
 */
public class InMemoryComissionDao implements ComissionDao {

	private List<Comission> comissionList;

	public InMemoryComissionDao(List<Comission> comissionList) {
		this.comissionList = comissionList;
	}

	public List<Comission> getComissionList() {
		return comissionList;
	}

	public void saveComission(Comission comi) {
	}

}