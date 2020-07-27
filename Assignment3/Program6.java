// 6) How to count a number of vowels and consonants in a String?
//One of the easiest String questions you will ever see. You have to write a Java program that will take a String input and print out a number of vowels and consonants on that String. For example, if the input is "Java" then your program should print "2 vowels and 2 consonants".


package Assignment3;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0;
		int ccount=0;
		
		String str = "Java";
		
		str= str.toLowerCase();
		
		for(int i=0; i<str.length();i++)						//Checks whether a character is a vovels ( below if condition)  
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				{
					vcount++;
				}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 	//Checks whether a character is a consonant  
			{    
                ccount++;											//Increments the consonant counter  
            }  
			
        }  
		System.out.println("The string name is : " + str );
        System.out.println("vowels are: " + vcount +"\n"+ " and consonants are: " + ccount);  
        
			
		}
		
}


