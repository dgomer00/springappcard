package es.unileon.springappcard.service;

import es.unileon.springappcard.domain.Comission;

import java.io.Serializable;
import java.util.List;

public interface ComissionManager extends Serializable {

	  public void increaseComission(int percentage);
	    
	    public List<Comission> getComissions();

	
}
