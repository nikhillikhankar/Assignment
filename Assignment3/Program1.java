//How to Print duplicate characters from String?
//For example, if String is "Java" then the program should print "a".

package Assignment3;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java";
				  
		int cnt = 0;
		char[] input = str.toCharArray();
		  
			System.out.println("Duplicate Characters are:");
				
			for (int i = 0; i < str.length(); i++) 
			 {
				for (int j = i + 1; j < str.length(); j++) 
				 {
					if (input[i] == input[j]) 
					 {
						System.out.println(input[j]);
						cnt++;
						break;
					 }
				 }
			 }
		}
	}
