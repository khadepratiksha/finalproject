package chat.bot;


import com.aliasi.tokenizer.IndoEuropeanTokenizerFactory;
import com.aliasi.tokenizer.Tokenizer;
import com.aliasi.tokenizer.TokenizerFactory;
import com.aliasi.tokenizer.EnglishStopTokenizerFactory;
public class RS {
	public static void main(String[] args) {
		String sentence = 
			    "what is static.";
			TokenizerFactory tokenizerFactory = 
			    IndoEuropeanTokenizerFactory.INSTANCE;
			tokenizerFactory = 
			    new EnglishStopTokenizerFactory(tokenizerFactory);
			Tokenizer tokenizer =tokenizerFactory.tokenizer(
			    sentence.toCharArray(), 0, sentence.length());
			for (String token : tokenizer) {
			    System.out.println(token);
			}
	}
}
