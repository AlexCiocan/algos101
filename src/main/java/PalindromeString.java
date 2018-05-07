package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Checking for a Palindrome string
 * 1 - if the string has one or more characters, we check if the first and last characters are identical.
 * If they are not identical, then the String is not a palindrome.
 * 2 - if the first and the last characters are identical, then we need to check if the substring comprised of all 
 * the characters between the first and last charac. is a palindrome. each recursive call will reduce the size of the string.
 */

//we take a word and put it in a arrayList and reverse the arrayList and then we compare the two letter by letter
public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String palindrome;
		palindrome = input.nextLine();
		ArrayList<String> p = new ArrayList<String>();
		createArrayList(p, palindrome);
		if(isPalindrome(p))
			System.out.println(palindrome + " is a palindrome.");
		else 
			System.out.println(palindrome + " is not a palindrome.");
	}
	
	public static void display(ArrayList arr)
	{
		for(int i= 0; i < arr.size(); i++)
			System.out.print(arr.get(i));
			System.out.println();
			
	}
//take a string and put it in a arrayList
	//take an ArrayList as an argument as well as a String
	public static void createArrayList(ArrayList<String> pword, String word)
	{
		//build the arrayList from the String
		int n = word.length();
		for(int i = 0; i < n; i++)
			pword.add(word.charAt(i) + "");
	}
	public static boolean isPalindrome(ArrayList<String> word)
	{
		//build a second arraylist that will store the reverese word
		ArrayList<String> revword = new ArrayList<String>();
		
		//addAll - takes arrayList as an argument and takes the content of the arrayList into the original arrayList
		revword.addAll(word);
		Collections.reverse(revword);
		
		//compare 'revword' with 'word'
		for(int i = 0; i< word.size(); i++)
			//compare each letter to see if they are the same and using method equals because working with string object
			if(!revword.get(i).equals(word.get(i)))
				//if any letter doesn't equal the coresponding letter in the other arrayList
				return false;
		return true;
			
	}
}
