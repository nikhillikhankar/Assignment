//How to check if String is Palindrome?
//For example, if the input is "radar", the output should be true, if the input is "madam" output will be true, and if the input is "Java" output should be false.

package Assignment3;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str, rev = "";
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string : \n ");
		str = s.nextLine();
		int n = str.length();
		 
		
		for(int i = n - 1; i >= 0; i--)
		 {
			rev = rev + str.charAt(i);
	   	 }
			if(str.equalsIgnoreCase(rev))
			{
				System.out.println(str+" is a palindrome");
			}
			else
			{
				System.out.println(str+" is not a palindrome");
			}
			
		}
	}


