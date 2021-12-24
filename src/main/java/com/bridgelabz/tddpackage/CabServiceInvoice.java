package com.bridgelabz.tddpackage;

/*
 * CabService Class provide Cab service feature/functionality
 */
public class CabServiceInvoice {
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KM = 10;
	private static final double MINIMUM_FARE = 5;

	/**
	 * This function calculate the fare and minimum fare
	 */
	public double CalculateFare(double distance, int time) {

		double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;

		return Math.max(totalFare, MINIMUM_FARE);
	}

	//Enhanced invoice - Return  total number of rides, total fare, average fare
	public InvoiceSummary CalculateFare(Ride[] rides) {
		double totalFare = 0.0;
		for (Ride ride : rides) {
			totalFare += this.CalculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}

}
