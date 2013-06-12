package com.naironics.wordlist;

import java.util.TreeSet;

/* Java program to demonstrate the use of TreeSet in storing unique 
 * words from a given text 
 */

public class WordList {

	public static void main(String[] args) {

		String text;
		text = "Either the well was very deep or she fell very slowly "
				+ "for she had plenty of time as she went down to look about "
				+ "her, and to wonder what was going to happen next First "
				+ "she tried to look down and make out what she was coming to "
				+ "but it was too dark to see anything then she looked at the "
				+ "sides of the well and noticed that they were filled with "
				+ "cupboards and book-shelves: here and there she saw maps and "
				+ "pictures hung upon pegs she took down a jar from one of the "
				+ "shelves as she passed it was labeled ORANGE MARMALADE but "
				+ "to her great disappointment it was empty she did not like to "
				+ "drop the jar for fear of killing somebody underneath so "
				+ "managed to put it into one of the cupboards as she fell past";

		String[] words = text.split(" ");

		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("====================================");
		System.out.println("Total no: of words: " + words.length);

		TreeSet<String> wordList = new TreeSet<String>();

		for (String word : words) {
			wordList.add(word);
		}
		
		System.out.println("Number of unique words:" + wordList.size());
		System.out.println("====================================");
		System.out.println("The unique words are:");
		for (String word: wordList){
			System.out.println(word);
		}	

	}

}
