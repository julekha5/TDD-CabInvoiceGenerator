package com.bridgelabz.tddpackage;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test for CabServiceInvoice.
 */
public class CabServiceInvoiceTest {

	CabServiceInvoice cabs = new CabServiceInvoice();

	@Before
	public void setUp() throws Exception {
		cabs = new CabServiceInvoice();
	}

	@Test
	public void Initialise() {
		assertTrue(true);
	}

	// Step 1:
	// This test case check the Cab service fare is calculate correct
	@Test
	public void givenDistanceAndTime_CalculateFareOfCab_ShouldPassTest() {
		double distance = 2.0;
		int time = 5;
		double fare = cabs.CalculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

	// should return minimum fare
	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = cabs.CalculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

}
