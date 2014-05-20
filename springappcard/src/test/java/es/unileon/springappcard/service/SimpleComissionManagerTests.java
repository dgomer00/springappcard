package es.unileon.springappcard.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import es.unileon.springappcard.domain.Comission;

import org.junit.Before;
import org.junit.Test;

public class SimpleComissionManagerTests {

	private SimpleComissionManager comissionManager;

	private List<Comission> comissions;

	private static int COMISSION_COUNT = 2;

	private static Double CREDITEMISSION_COMISSION = new Double(3.50);
	private static String CREDITEMISSION_DESCRIPTION = "Credit Emission";

	private static String DEBITEMISSION_DESCRIPTION = "Debit Emission";
	private static Double DEBITEMISSION_COMISSION = new Double(2.10);

	private static int POSITIVE_COMISSION_INCREASE = 5;

	@Before
	public void setUp() throws Exception {
		comissionManager = new SimpleComissionManager();
		comissions = new ArrayList<Comission>();

		// stub up a list of products
		Comission product = new Comission();
		product.setDescription("Credit Emission");
		product.setComission(CREDITEMISSION_COMISSION);
		comissions.add(product);

		product = new Comission();
		product.setDescription("Debit Emission");
		product.setComission(DEBITEMISSION_COMISSION);
		comissions.add(product);

		comissionManager.setComissions(comissions);

	}

	@Test
	public void testGetProductsWithNoComission() {
		comissionManager = new SimpleComissionManager();
		assertNull(comissionManager.getComissions());
	}

	@Test
	public void testGetComissions() {
		List<Comission> comissions = comissionManager.getComissions();
		assertNotNull(comissions);
		assertEquals(COMISSION_COUNT, comissionManager.getComissions().size());

		Comission comission = comissions.get(0);
		assertEquals(CREDITEMISSION_DESCRIPTION, comission.getDescription());
		assertEquals(CREDITEMISSION_COMISSION, comission.getComission());

		comission = comissions.get(1);
		assertEquals(DEBITEMISSION_DESCRIPTION, comission.getDescription());
		assertEquals(DEBITEMISSION_COMISSION, comission.getComission());
	}

	@Test
	public void testIncreaseComissionWithNullListOfComissions() {
		try {
			comissionManager = new SimpleComissionManager();
			comissionManager.increaseComission(POSITIVE_COMISSION_INCREASE);
		} catch (NullPointerException ex) {
			fail("Comissions list is null.");
		}
	}

	@Test
	public void testIncreasePriceWithEmptyListOfComissions() {
		try {
			comissionManager = new SimpleComissionManager();
			comissionManager.setComissions(new ArrayList<Comission>());
			comissionManager.increaseComission(POSITIVE_COMISSION_INCREASE);
		} catch (Exception ex) {
			fail("Comissions list is empty.");
		}
	}

	@Test
	public void testIncreasePriceWithPositivePercentage() {
		comissionManager.increaseComissionCreditEmission(POSITIVE_COMISSION_INCREASE);
		comissionManager.increaseComissionCreditMaintenance(POSITIVE_COMISSION_INCREASE);
		
		double expectedCreditComissionWithIncrease = 3.675;
		double expectedDebitComissionWithIncrease = 2.205;

		List<Comission> products = comissionManager.getComissions();
		Comission comission = comissions.get(0);
		assertEquals(expectedCreditComissionWithIncrease,
				comission.getComission(), 0);

		comission = comissions.get(1);
		assertEquals(expectedDebitComissionWithIncrease,
				comission.getComission(), 0);
	}
}