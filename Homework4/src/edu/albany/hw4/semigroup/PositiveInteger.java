package edu.albany.hw4.semigroup;

public class PositiveInteger extends Semigroup<PositiveInteger> {

	private int value; 
	
	public PositiveInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public PositiveInteger operate(PositiveInteger s) {
		return new PositiveInteger(this.value + s.getValue());
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.value);
	}
	
	public boolean equals(PositiveInteger s) {
		if (this == s) return true;
		if (s == null) return false;
		
		if (this.value != s.getValue()) {
			return false;
		} else return true;
	}
}