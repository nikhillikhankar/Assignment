// 5) How to find duplicate characters in a String?
//You need to write a program to print all duplicate character and their count in Java. For example, if given String is "Programming" then your program should print
// g : 2
// r : 2
// m : 2

package Assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Programming";  
        int count;  
        
        char string[] = string1.toCharArray(); 
        Map<Character, Integer> charMap = new HashMap<Character, Integer>(); 
        for (Character ch : string) 
        	{ 
        		if (charMap.containsKey(ch)) 
        			{ 
        			charMap.put(ch, charMap.get(ch) + 1); 
        			} 
        		else { 
        			charMap.put(ch, 1); 
        			} 
        	}
        
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet(); 
        System.out.printf("List of duplicate characters in String '%s' %n", string1); 
         for (Map.Entry<Character, Integer> entry : entrySet) 
          { 
        	if (entry.getValue() > 1) 
        	 { 
        		System.out.printf("%s : %d %n", entry.getKey(), entry.getValue()); 
        	 } 
          }

   /*     System.out.println("Duplicate characters in a given string: ");
        
        for(int i = 0; i <string.length; i++) 
         {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) 
             {  
                if(string[i] == string[j] && string[i] != ' ') 
                 {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                 }  
             }  
           
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
         } 
        */  
	}

}
