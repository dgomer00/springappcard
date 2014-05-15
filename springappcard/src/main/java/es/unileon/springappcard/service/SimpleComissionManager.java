package es.unileon.springappcard.service;

import java.util.List;

import es.unileon.springappcard.domain.Comission;

public class SimpleComissionManager implements ComissionManager {

	 private static final long serialVersionUID = 1L;
	 
	 private List<Comission> comissions;

	    public List<Comission> getComissions() {
	        return comissions;      
	    }

	    public void increaseComission(int percentage) {
	    	 if (comissions != null) {
	             for (Comission comission : comissions) {
	                 double newComission = comission.getComission().doubleValue() * 
	                                     (100 + percentage)/100;
	                 comission.setComission(newComission);
	             }
	         }         
		}
		
	    public void setComissions(List<Comission> comissions) {
	        this.comissions=comissions;        
	    }
	}