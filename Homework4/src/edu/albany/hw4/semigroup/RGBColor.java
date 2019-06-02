package edu.albany.hw4.semigroup;

import edu.albany.hw4.Complementable;

public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor> {

	private int rValue;
	private int gValue;
	private int bValue;
	
	public RGBColor(int r, int g, int b) {
		this.rValue = r;
		this.gValue = g;
		this.bValue = b;
	}
	
	public int getRValue() {
		return this.rValue;
	}
	
	public void setRValue(int r) {
		this.rValue = r;
	}
	
	public int getGValue() {
		return this.gValue;
	}
	
	public void setGValue(int g) {
		this.gValue = g;
	}
	
	public int getBValue() {
		return this.bValue;
	}
	
	public void setBValue(int b) {
		this.bValue = b;
	}
	
	@Override
	public RGBColor complement() {
		return new RGBColor(255 - this.rValue, 255 - this.gValue, 255 - this.bValue);
	}
	
	@Override
	public RGBColor operate(RGBColor c) {
		int avgR = (this.rValue + c.getRValue()) / 2;
		int avgG = (this.gValue + c.getGValue()) / 2;
		int avgB = (this.bValue + c.getBValue()) / 2;
		return new RGBColor(avgR, avgG, avgB);
	}	
	
	public String toString() {
		return "[" + this.rValue + "/" + this.gValue + "/" + this.bValue + "]";
	}
	
	public boolean equals(RGBColor c) {
		if (this == c) return true;
		if (c == null) return false;
		
		if (this.rValue == c.getRValue() &&  
			this.gValue == c.getGValue() && 
			this.bValue == c.getBValue()) {
			return true;
		} else return false;
	}
}