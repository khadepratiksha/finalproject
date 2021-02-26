package chat.bot;

import java.util.ArrayList;

public class RemoveStop {

		public static String[] stopWordsofwordnet = {
		"what","is","example"};



		  public static ArrayList<String> wordsList = new ArrayList<String>();

		    public static void main(String[] args){

		  String s="what is static";
		s=s.trim().replaceAll("\\s+", "");
		String[] words = s.split(" ");

		for (String word : words) {
		wordsList.add(word);
		}

		//remove stop words here from the temp list
		for (int i = 0; i < wordsList.size(); i++) {
		// get the item as string
		for (int j = 0; j < stopWordsofwordnet.length; j++) {
		if (stopWordsofwordnet[j].contains(wordsList.get(i))) {wordsList.remove(i);
		}
		}
		}
		for (String str : wordsList) {
		System.out.print(str+"");
		}
		}

		}


