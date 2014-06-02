package es.unileon.springappcard.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.springappcard.domain.Comission;

/**
 * 
 * @author David G�mez Riesgo
 *
 */

/**
 * Spring permite creaci�n autom�tica de beans de acceso a datos mediante la
 * anotaci�n @Repository. Asimismo, Spring reconoce las anotaciones del API
 * est�ndar JPA. Por ejemplo, la anotaci�n @Persistence es utilizada en la clase
 * JPAComisionDao para inyectar autom�ticamente el EntityManager.
 */
@Repository(value = "comissionDao")
public class JPAComissionDao implements ComissionDao {

	private EntityManager em = null;

	/**
	 * Sets the entity manager
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	// Ambos m�todos ejecutan una consulta usando el entityManager
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Comission> getComissionList() {
		return em.createQuery("select c from Comission c order by c.id")
				.getResultList();
	}

	@Transactional(readOnly = false)
	public void saveComission(Comission comi) {
		em.merge(comi);
	}

}
