//12)How to return the highest occurred character in a String?

package Assignment3;
public class Program12 {

	 static final int N = 256;
	 static char MaxOccuringChar(String str) 
	 {
	  int ctr[] = new int[N];
	  int l = str.length();
	  
	  for (int i = 0; i < l; i++)
		  
	    ctr[str.charAt(i)]++;
	  int max = -1;
	  char result = ' ';

	  for (int i = 0; i < l; i++) 
	  {
	   if (max < ctr[str.charAt(i)]) 
	   {
	    max = ctr[str.charAt(i)];
	    result = str.charAt(i);
	   }
	  }
	  return result;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaaaaaaaaabbbbbccccdddd";
		  System.out.println("The given string is: " + str);
		  System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str));
		 
	}

}
