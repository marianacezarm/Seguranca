package model.processorFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreProcessor {

	public PreProcessor() {
	}
	
	public char[] processor(){
		PreProcessor processor = new PreProcessor();
		File folder = new File("src/Documents");
		File[] files = folder.listFiles();
		String newText = "";
		for (File file : files) {
			String text = Reader.returnText(file.getPath());
			text = text.replaceAll("\n", "");
			text = text.replaceAll(" ", "");
			newText = processor.normalize(text);
		}
		char[] list = newText.toCharArray();
		return  list;
	}

	private String normalize(String text) {
		text = text.replaceAll("[ÁÃ]", "A");
		text = text.replaceAll("[ÉẼ]", "E");
		text = text.replaceAll("[Í]", "I");
		text = text.replaceAll("[ÕÓ]", "O");
		text = text.replaceAll("[ÚŨ]", "U");
		text = text.replaceAll("[Ç]", "C");
		text = text.replaceAll("[ç]", "c");
		text = text.replaceAll("[áã]", "a");
		text = text.replaceAll("[éẽ]", "e");
		text = text.replaceAll("[í]", "i");
		text = text.replaceAll("õó]", "o");
		text = text.replaceAll("[úũ]", "u");
		text = text.replaceAll("[^0-9A-Za-z\\s]", "");
		
		return text;		
	}

	private List<String> toList(String text){
		String[] words = text.split("\n");
		List<String> wordsList = new ArrayList<String>(Arrays.asList(words));
		return wordsList;
	}
}



