package com.in28minutes.rest.webservices.limitsservice.bean;

public class LimitsConfiguration {
	private int maximum;
	private int minimum;
	protected LimitsConfiguration() {

	}
	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}

}
