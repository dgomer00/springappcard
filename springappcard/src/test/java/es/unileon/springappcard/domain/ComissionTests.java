package es.unileon.springappcard.domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ComissionTests {
	
	 private Comission comission;

	    @Before
	    public void setUp() throws Exception {
	    	comission = new Comission();
	    }

	    @Test
	    public void testSetAndGetDescription() {
	        String testDescription = "aDescription";
	        assertNull(comission.getDescription());
	        comission.setDescription(testDescription);
	        assertEquals(testDescription, comission.getDescription());
	    }

	    @Test
	    public void testSetAndGetPrice() {
	        double testPrice = 100.00;
	        assertEquals(0, 0, 0);    
	        comission.setComission(testPrice);
	        assertEquals(testPrice, comission.getComission(), 0);
	    }

	}