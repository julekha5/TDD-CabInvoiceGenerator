package com.bridgelabz.tddpackage;

import com.bridgelabz.tddpackage.CabServiceInvoice.RideType;

/**
 * Ride class  
 */
public class Ride {
	protected double distance;
	protected int time;
	protected String userID;
	protected CabServiceInvoice.RideType type;

	public Ride(double distance, int time, String userID, CabServiceInvoice.RideType type) {
		this.distance = distance;
		this.time = time;
		this.userID = userID;
		this.type = type;
	}

}
