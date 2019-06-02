package edu.albany.hw4.semigroup;

import java.util.Collection;

public abstract class Semigroup<T> {

	public abstract T operate(T s);
	
	public static <T extends Semigroup<T>> T combine(Collection<T> list) {
		T sum = list.iterator().next();
		
		for(T s : list) {
			sum = sum.operate(s);
		}
		
		return sum;
	}
	
}
