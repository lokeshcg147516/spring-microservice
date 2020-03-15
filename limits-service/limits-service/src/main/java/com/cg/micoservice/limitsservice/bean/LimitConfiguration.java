package com.cg.micoservice.limitsservice.bean;

public class LimitConfiguration {
	private int min;
	private int max;

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	protected LimitConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	public LimitConfiguration(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

}
