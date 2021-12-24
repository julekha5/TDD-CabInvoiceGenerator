package com.bridgelabz.tddpackage;

import java.util.Objects;

public class InvoiceSummary {

	final int numOfRides;
	final double totalFare;
	final double averageFare;
	final String userID;

	public InvoiceSummary(String userID, double totalFare) {
		this.numOfRides = 0;
		this.averageFare = 0;
		this.userID = userID;
		this.totalFare = totalFare;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0
				&& Objects.equals(averageFare, that.averageFare);
	}
}
