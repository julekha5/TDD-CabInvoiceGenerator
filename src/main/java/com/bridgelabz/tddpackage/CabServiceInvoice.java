package com.bridgelabz.tddpackage;

/*
 * CabService Class provide Cab service feature/functionality
 */
public class CabServiceInvoice {
	private static final double MINIMUM_COST_PER_KM = 10;// normal
	private static final int COST_PER_TIME = 1;// normal
	private static final double MINIMUM_FARE = 5;// normal

	private static final double MINIMUM_COST_PER_KM_PREMIUM = 15;
	private static final int COST_PER_TIME_PREMIUM = 2;
	private static final double MINIMUM_FARE_PREMIUM = 20;
	private static final RideType type = null;

	enum RideType {
		NORMAL, PREMIUM
	}

	public RideType RideType;

	/**
	 * This function calculate the fare and minimum fare
	 */
	public double CalculateFare(double distance, int time, RideType type) {
		if (type == RideType.NORMAL) {
			double totalFare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;

			return Math.max(totalFare, MINIMUM_FARE);
		} else {
			double totalFare = distance * MINIMUM_COST_PER_KM_PREMIUM + time * COST_PER_TIME_PREMIUM;

			return Math.max(totalFare, MINIMUM_FARE_PREMIUM);
		}
	}

	public InvoiceSummary CalculateFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.CalculateFare(rides.length, ride.time, ride.type);
		}
		return new InvoiceSummary(rides.length, totalFare);

	}

	public InvoiceSummary UserInvoice(Ride[] rides, String userID) {
		double totalFare = 0.0;
		for (Ride ride : rides) {
			if (ride.userID.equals(userID)) {
				totalFare += this.CalculateFare(ride.distance, ride.time, ride.type);
			}
		}
		return new InvoiceSummary(totalFare);
	}

}
