import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		
 		String[] text = {};
 		int count = 0;
 		int wordCount = 0;
 		String word = "";
		
 		HashSet<String> mySet = new HashSet<String>();
 		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
 		
		File happy = new File("/Eclipse/happy.txt");
		Scanner scan = new Scanner(happy);
		
		while(scan.hasNextLine()) {
			text = scan.nextLine().split("\s+");
				
			for(int i = 0; i < text.length; i++) {
				
				//Insert the word in this if statement to get the count of the word.
				if(text[i].equals("happy")) {
					wordCount++;
				}
				
				mySet.add(text[i]);
				count = myMap.getOrDefault(word, count+1);
				myMap.put(text[i], count);
			}
			
		}
		
		//For all unique words
		System.out.println(mySet.size());
		
		System.out.println("Amount of word: " + wordCount);
		
	}

}
