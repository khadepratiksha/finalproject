package chat.bot;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public  class StopWordExample{

	  public static void main(String args[])
	  {
	   String sentence="what is polymorphism";
	   String stopWords[]={"what","is","and","or","a","with"};

	 ArrayList<String> list= removeStopWords(sentence,stopWords);

	}

	 



	public static ArrayList<String> removeStopWords(String text,String[] stopWords){
	  
	  System.out.println("Core Java Example");
	
	  text= text.toLowerCase().trim();

	  ArrayList<String> wordList= new ArrayList();
	  wordList.addAll(Arrays.asList(text.split(" ")));
	  
	  List<String> stopWordList = new ArrayList<>();
	  stopWordList.addAll(Arrays.asList(stopWords));

	  wordList.removeAll(stopWordList);
	 System.out.println("Text without stop words:" +wordList.toString());
	 
	 for (String string : wordList) {
		System.out.println(string);
	}
	 
	return wordList;

	   
	}
	}  

