package main;

import model.processorFile.PreProcessor;
import model.vigenere.Vigenere;

public class main {
	
	 public static void main(String[] args) {
		PreProcessor processor = new PreProcessor();
		Vigenere vigenere = new Vigenere();
		
		char[] text = processor.processor();
		char[] encryptedText;
		char[] desyncriptedText;
		
		encryptedText = vigenere.encrypt(text);
		desyncriptedText = vigenere.desincrypt(encryptedText);
		
		System.out.println("Mensagem que será criptografada: "+ String.valueOf(text));
		System.out.println("Mensagem criptografada com a cifra de Vigenere: " + String.valueOf(encryptedText));
		System.out.println("Mensagem desincriptografada com a cifra de Vigenere: " + String.valueOf(desyncriptedText));
	}

}
