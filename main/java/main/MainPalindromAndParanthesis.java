package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPalindromAndParanthesis {

	private static Logger logger = LoggerFactory.getLogger(MainPalindromAndParanthesis.class);

	public static void main(String[] args) {
		testPalindrome();
		testParantheses();
	}
	
	public static void testParantheses() {
		String text = new String("()()()()()");
		String text2 = new String("((())(()))");
		String text3 = new String("())(");
		logger.info("Input text: '" + text + "'. HasGoodParantheses? - " + hasGoodParantheses(text));
		logger.info("Input text: '" + text2 + "'. HasGoodParantheses? - " + hasGoodParantheses(text2));
		logger.info("Input text: '" + text3 + "'. HasGoodParantheses? - " + hasGoodParantheses(text3));
	}

	public static void testPalindrome() {
		String text = new String("qwertyytrewq");
		String text2 = new String("asd");
		logger.info("Input text: '" + text + "'. IsPalindrome? - " + isPalindrome(text));
		logger.info("Input text: '" + text2 + "'. IsPalindrome? - " + isPalindrome(text2));
	}
	
	public static boolean isPalindrome(String text) {
		String reversedText = new StringBuilder(text).reverse().toString();
		return text.equals(reversedText);
	}
	
	public static boolean hasGoodParantheses(String text) {
		int start = 0, end = 0;												// counter for starting and ending parantheses
		if (text.charAt(text.length() - 1) == '(')							// can't end with opening parantheses
			return false;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(')
				start++;
			else
				end++;
			if (end > start)												// at every moment there can't be more closing brackets
				return false;
		}
		return start == end;												// there should be equal number of closing and starting brackets
	}

}
