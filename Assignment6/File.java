//File IO problem
//Create new file 'test.txt'.
//Write a data in it of about 300 words.
//read a file 'test.txt'.
//calculate the letter in it.(a,b,c,d....)
//constant in that file (b,c,d,f....)
//vowel in that file (a, e, i ,o ,u)
//words in a complete file.("JAVA")
//calcualte  how many time one charater is repeated.(a=10,b=50,z=34....)

package Programs;

//import java.nio.charset.StandardCharsets;
import java.nio.file.*;
//import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class File {

//	public File(String str) {
		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  java.io.File file = new java.io.File("D:\\nikk testing\\sagar java\\test.txt"); 
		
		
	  System.out.println("..............Create new file 'test.txt'................ ");
		boolean result;  
		try   
		{  
		result = file.createNewFile();  			//creates a new file  
		if(result)     								 // test if successfully created a new file  
		{  
		System.out.println("file created "+file.getCanonicalPath()); 		//returns the path string  
		}  
		else  
		{  
		System.out.println("File already exist at location: "+file.getCanonicalPath());  
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();   				 //prints exception if any  
		}         
		
			
		System.out.println("....................Write a data in it of about 300 words................... ");
						
				try{    
			           
				FileWriter fw=new FileWriter("D:\\nikk testing\\sagar java\\test.txt");    
					fw.write("Welcome to Shayri...........\n Dil Ki Dhadkan Aur Meri Sadaa Hai Tu, \n Meri Pehli Aur Aakhiri Wafa Hai Tu, \n Chaha Hai Tujhe Chahat Se Bhi Barh Kar, \n Meri Chahat Aur Chahat Ki Inteha Hai Tu.....  \n .................................\n Kaash Yeh Khwahish Poori Ho Ibadat Ke Bagair, \n Woh Aake Gale Laga Le Meri Ijaajat Ke Bagair..... ");    
					fw.close();    
				}
				catch(Exception e)
				{
					System.out.println(e);
				}    
			          System.out.println(" Write in test file Successfully...");    	
		
			    			          
			      System.out.println("................read a file 'test.txt'.................");
			      
			    try {
			          
			    	 Scanner scan = new Scanner(file);
			    	 StringBuffer s = new StringBuffer();
			       
			         while (scan.hasNextLine()) 
			          {
			            String data = scan.nextLine();
			            System.out.println(data);
			            s.append(data);
			            
			          }
			          scan.close();
			          countCharacterType(s.toString());
			        } 
			     catch (FileNotFoundException e) 
			      	{
			          System.out.println("An error occurred.");
			          e.printStackTrace();
			        }  
	}
			     	  
	 		
	//		System.out.println("..........vowel in that file a, e, i ,o ,u.........");
	//		System.out.println("..............................................");
		
		   
			  static void countCharacterType(String str) 
			    {    
			   
			 int vowels = 0, consonant = 0, specialChar = 0,a=0,b=0,c=0,d=0;
			 int e=0,f=0,g=0,h=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
			   
			   for (int i = 0; i < str.length(); i++) 
			   { 
				   char ch = str.charAt(i); 
				   
				   if( ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) 
				    {
					   ch = Character.toLowerCase(ch);
							   
				    	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				    	
				   			vowels++;
				    	  
				    	if(ch == 'a'){
				    		   a++;
				    	  }
				   		else
				   			consonant++; 
				    	  if(ch == 'b'){
				    		   b++;
				    	  }
				    }	
				   	 else
				   		specialChar++;
			   }
			   
			    System.out.println("Vowels: " + vowels); 
		        System.out.println("Consonant: " + consonant); 
		        System.out.println("Special Character: " + specialChar); 
		        System.out.println("totatl characjter in java file  : "+(vowels+consonant+specialChar));
			    System.out.println("number of a" +a+ " number of b" +b); 
		    //    countCharacterType(str);
			  
		        
	} 
			  
}  
			   	
			   
			   
			   
			   
			   
	
	

 
