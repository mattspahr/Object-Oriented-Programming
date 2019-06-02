package edu.albany.hw2.morse;

public class MorseCode {
	
	/*
	 * Point 6:
	 * I chose to use an enumeration to store the Morse Code table not only because I
	 * would like to get better at using enums, but also because it is very easy to 'index'
	 * something like this with the specific character opposed to a list or other type of data
	 * structure. Before learning about enums, I probably would've used something like a hashmap
	 * or hashtable to store a key and value, but I enjoy the ease of use and readability when
	 * it comes to enums. I also think it will be much simpler to decode an entire String 
	 * using an enum opposed to something I mentioned earlier.
	 */
	
	public enum Morse {
		SPACE(' ', " "),
		COMMA(',', "--..--"),
		PERIOD('.', ".-.-.-"),
		QUESTIONMARK('?', "..--.."),
		ZERO('0', "-----"),
		ONE('1', ".----"),
		TWO('2', "..---"),
		THREE('3', "...--"),
		FOUR('4', "....-"),
		FIVE('5', "....."),
		SIX('6', "-...."),
		SEVEN('7', "--..."),
		EIGHT('8', "---.."),
		NINE('9', "----."),
		A(".-"),
		B("-..."),
		C("-.-."),
		D("-.."),
		E("."),
		F("..-."),
		G("--."),
		H("...."),
		I(".."),
		J(".---"),
		K("-.-"),
		L(".-.."),
		M("--"),
		N("-."),
		O("---"),
		P(".--."),
		Q("--.-"),
		R(".-."),
		S("..."),
		T("-"),
		U("..-"),
		V("...-"),
		W(".--"),
		X("-..-"),
		Y("-.--"),
		Z("--..");		
		
		private char ch;
		private String morseCode;
		
		private Morse(char ch, String morseCode) {
			this.ch = ch;
			this.morseCode = morseCode;
		}
		
		private Morse(String morseCode) {
			this.ch = this.toString().charAt(0);
			this.morseCode = morseCode;
		}
		
		public char getChar() {
			return ch;
		}
		
		public String getMorseCode() {
			return morseCode;
		}
	}
	
	public StringBuffer stringtoMorseCode(String input) {
		StringBuffer sb = new StringBuffer();
		
		for (char c : input.toCharArray()) {
			if (c == '\n') {
				sb.append("\n");
				break;
			} else if(charToMorseCode(c) == null) {
				return null;
			} else {
				sb.append(charToMorseCode(c));
			}
		}
		return sb;
	}
	
	public String charToMorseCode(char letter) {
		// Iterate over the enumeration Morse 
		// looking for a match between input char and a char in Morse
		for (Morse val : Morse.values()) {
			if (val.getChar() == Character.toUpperCase(letter)) {
				return val.getMorseCode();
			}
		}
		return null;
	}	
}