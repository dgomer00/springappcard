package es.unileon.springappcard.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.unileon.springappcard.domain.Comission;

public class JPAComissionDaoTests {
	 private ApplicationContext context;
	    private ComissionDao comissionDao;

	    @Before
	    public void setUp() throws Exception {
	        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
	        comissionDao = (ComissionDao) context.getBean("comissionDao");
	    }

	    @Test
	    public void testGetProductList() {
	        List<Comission> comissions = comissionDao.getComissionList();
	        assertEquals(comissions.size(), 6, 0);	   
	    }

	    @Test
	    public void testSaveComission() {
	        List<Comission> comissions = comissionDao.getComissionList();

	        Comission c = comissions.get(0);
	        Double comission = c.getComission();
	        c.setComission(200.12);
	        comissionDao.saveComission(c);

	        List<Comission> updatedProducts = comissionDao.getComissionList();
	        Comission c2 = updatedProducts.get(0);
	        assertEquals(c2.getComission(), 200.12, 0);

	        c2.setComission(comission);
	        comissionDao.saveComission(c2);
	    }
	}