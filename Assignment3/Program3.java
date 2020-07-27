//3) How to program to print first non repeated character from String?
//One of the most common string interview questions: Find the first non-repeated (unique) character in a given string. for example, if given String is "Morning" then it should print "M". This question demonstrates the efficient use of the hash table data structure.


package Assignment3;
import java.util.Hashtable;
public class Program3 {
	
	public static Character findFirstNonRepeated(String str) {
		
		Hashtable hashchar= new Hashtable();
		
		int j, strLength;
		Character chr;
		Object oneTime = new Object();
		Object twoTimes = new Object();

		strLength = str.length();

		for (j = 0; j < strLength; j++) 
		 {
			chr = new Character(str.charAt(j));
			Object o = hashchar.get(chr);
				
		if (o == null) 
			{
				hashchar.put(chr, oneTime);
			}
		else if (o == oneTime) 
				{
			 		hashchar.put(chr, twoTimes);
				}
		 }
		
			int length = strLength;
			
			for (j = 0; j < length; j++) 
			 {
				chr = new Character(str.charAt(j));
				Object c = null;
				
				if (hashchar.get(chr) == oneTime)
				{
					return chr;
				}	
			 }
			return null;
			
   	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String str= "Morning";
	 Program3 p= new Program3(); 
		 
     p.findFirstNonRepeated(str);
     System.out.println("The given string name is Morning : \n Then output is: "+p.findFirstNonRepeated(str));
		
	}

}
