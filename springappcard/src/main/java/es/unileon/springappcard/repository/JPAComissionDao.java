package es.unileon.springappcard.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.springappcard.domain.Comission;

/**
 * 
 * @author David Gómez Riesgo
 *
 */

/**
 * Spring permite creación automática de beans de acceso a datos mediante la
 * anotación @Repository. Asimismo, Spring reconoce las anotaciones del API
 * estándar JPA. Por ejemplo, la anotación @Persistence es utilizada en la clase
 * JPAComisionDao para inyectar automáticamente el EntityManager.
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

	// Ambos métodos ejecutan una consulta usando el entityManager
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
