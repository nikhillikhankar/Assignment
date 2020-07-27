//2) How to check if two Strings are anagrams of each other?
//A simple coding problem based upon String, but could also be asked with numbers. You need to write a Java program to check if two given strings are anagrams of Each other. Two strings are anagrams if they are written using the same exact letters, ignoring space, punctuation, and capitalization. Each letter should have the same count in both strings. For example, the Army and Mary are an anagram of each other.

package Assignment3;
import java.util.Arrays;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = {{"mary", "army"},{"linkhi", "nikhill"}};
		
		for (String[] value : data) 
		 { 	
			String s1 = value[0]; 
		 	String s2 = value[1]; 
		 	System.out.printf("the %s and %s are Anagram of each other. %b %n", s1, s2, areAnagrams(s1, s2)); 
		 }
	}

	public static boolean areAnagrams(String str1, String str2) 
		{ 
			char[] c1 = str1.toCharArray(); 
			char[] c2 = str2.toCharArray();         
			
			// sort arrays 
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			 if(Arrays.equals(c1, c2)) 
			 	{ 
					return true; 
				} 
			return false; 
		
		}
}
