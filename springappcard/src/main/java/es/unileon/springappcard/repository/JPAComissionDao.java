package es.unileon.springappcard.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.unileon.springappcard.domain.Comission;

@Repository(value = "comissionDao")
public class JPAComissionDao implements ComissionDao {

	private EntityManager em = null;
	/**
	 * Sets the entity manager
	 */
	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.em = em;
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Comission> getComissionList() {
		return em.createQuery("select c from Comission c order by c.id").getResultList();
	}

	@Transactional(readOnly = false)
	public void saveComission(Comission comi) {
		em.merge(comi);
		
	}

}
