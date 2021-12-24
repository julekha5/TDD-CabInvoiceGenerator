package com.bridgelabz.tddpackage;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.tddpackage.CabServiceInvoice.RideType;

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

	/**Step 1:
	*This test case check the Cab service fare is calculate correct
	*/
	@Test
	public void givenDistanceAndTime_CalculateFareOfCab_ShouldPassTest() {
		double distance = 2.0;
		int time = 5;
		RideType type = null;
		double fare = cabs.CalculateFare(distance, time, type);
		Assert.assertEquals(25, fare, 0.0);
	}

	// should return minimum fare
	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		RideType type = null;
		double fare = cabs.CalculateFare(distance, time, type);
		Assert.assertEquals(5, fare, 0.0);
	}

	/**
     *Premium rides and normal 
	 */
	@Test
	public void givenUserIdWhenAdded_ShouldReturnInvoice() {
		Ride[] rides = { 
				new Ride(2.0,5,"1",cabs.RideType.NORMAL), 
				new Ride(0.1,1,"1",cabs.RideType.PREMIUM), 
				new Ride(2.0,5,"2",cabs.RideType.NORMAL)};
		InvoiceSummary summary = cabs.UserInvoice(rides,"1");
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(45);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}
	
	 
}
