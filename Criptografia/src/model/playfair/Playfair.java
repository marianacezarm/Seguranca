package model.playfair;

public class Playfair {
	private char[][] matrix;
	private char[] palavraChave;
	
	public Playfair(char[] palavraChave) {
		matrix = new char[5][5];	
		this.palavraChave = palavraChave;
	}
	
	public char[] encrypt(char[] text) {
		char[] encripted = new char[text.length];
		
		int count = 0;
		for (int i=0; i < 24; i++) {
			for (int j = 0; j < palavraChave.length; j++)  {
				matrix [i][j] = palavraChave
			}
		}
		
		
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
