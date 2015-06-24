package model.vigenere;

public class Vigenere {

	public Vigenere() {
		// TODO Auto-generated constructor stub
	}

	public char[] encrypt(char[] text) {
		char[] encripted = new char[text.length];
		char c;

		for (int i = 0; i< text.length; i++) {
			c = text[i];			

			if (Character.codePointAt(text, i) > 119) {
				c = (char) (Character.codePointAt(text, i) - 23);
				encripted [i] = c;
			} 
			else {
			c = (char) (Character.valueOf(c) + 3);
			encripted [i] = c;
			}
		}
		return encripted;
	}

	public char[] desincrypt(char[] text) {
		char[] decripted = new char[text.length];
		char c;

		for (int i = 0; i< text.length; i++) {
			c = text[i];			

			if (Character.codePointAt(text, i) < 100) {
				c = (char) (Character.codePointAt(text, i) + 23);
				decripted [i] = c;
			} 
			else {
			c = (char) (Character.valueOf(c) - 3);
			decripted [i] = c;
			}
		}
		return decripted;
	}

}
