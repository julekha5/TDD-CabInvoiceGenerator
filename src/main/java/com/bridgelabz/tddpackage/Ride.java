package com.bridgelabz.tddpackage;
/**
 * Ride class  
 */
public class Ride {
	protected double distance;
	protected int time;
	protected String userID;

	public Ride(double distance, int time, String userID) {
		this.distance = distance;
		this.time = time;
		this.userID = userID;
	}
}
