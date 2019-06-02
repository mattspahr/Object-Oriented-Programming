package edu.albany.hw4.binaryword;

import edu.albany.hw4.Complementable;
import java.util.BitSet;

public class BinaryWord implements Complementable<BitSet>{

	private BitSet bitWord;
	
	public BinaryWord(String newWord) {
		
		int length = newWord.length();
		bitWord = new BitSet(length);
		
		for (int i = 0; i < length; i++) {
			if(newWord.charAt(i) == '1') {
				bitWord.set(i, true);
			} else if (newWord.charAt(i) == '0') {
				bitWord.set(i, false);
			} else 
				this.bitWord = null;
		}
	}
	
	public BitSet getBitWord() {
		return this.bitWord;
	}
	
	public void setBitWord(BitSet bitWord) {
		this.bitWord = bitWord;
	}
	
	public boolean equals(BinaryWord word) {
		
		if (this == word) return true;
		if (word == null) return false;
		
		if (this.bitWord.equals(word.getBitWord())) {
			return true;
		} else return false;
	}
	
	@Override
	public String toString() {

		int length = bitWord.length();
		StringBuilder word = new StringBuilder();
		
		for (int i = 0; i < length; i++) {	
			if (bitWord.get(i) == true) {
				word.append('1');
			} else if (bitWord.get(i) == false) {
				word.append('0');
			} else {
				return null;
			}	
		}
		
		return word.toString();
	}
	
	@Override
	public BinaryWord complement() {
		
		int length = bitWord.length();
		StringBuilder compWord = new StringBuilder();
		
		for (int i = 0; i <= length; i++) {
			
			if (bitWord.get(i) == true) {
				compWord.append('0');
			} else if (bitWord.get(i) == false) {
				compWord.append('1');
			} else {
				return null;
			}	
		}
		
		BinaryWord word = new BinaryWord(compWord.toString());
		return word;
	}
}
