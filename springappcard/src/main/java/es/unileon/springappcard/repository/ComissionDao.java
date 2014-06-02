package es.unileon.springappcard.repository;

import java.util.List;

import es.unileon.springappcard.domain.Comission;

/**
 * 
 * @author David G�mez Riesgo
 *
 */
/**
 * �ste ser� el interface que definir� la funcionalidad de la implementaci�n
 * DAO(Objeto de acceso a datos) que vamos a crear
 */
public interface ComissionDao {

	public List<Comission> getComissionList();

	public void saveComission(Comission comi);

}