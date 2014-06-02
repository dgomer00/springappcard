package es.unileon.springappcard.repository;

import java.util.List;

import es.unileon.springappcard.domain.Comission;

/**
 * 
 * @author David Gómez Riesgo
 *
 */
/**
 * Éste será el interface que definirá la funcionalidad de la implementación
 * DAO(Objeto de acceso a datos) que vamos a crear
 */
public interface ComissionDao {

	public List<Comission> getComissionList();

	public void saveComission(Comission comi);

}