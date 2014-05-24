package es.unileon.springappcard.repository;

import java.util.List;

import es.unileon.springappcard.domain.Comission;

public interface ComissionDao {
	
	 public List<Comission> getComissionList();

	    public void saveComission(Comission comi);

	}