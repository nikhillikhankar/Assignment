// 11) How to remove duplicate characters from String?
//For example, if the input is ‘bananas’ the output will be ‘bans’.

package Assignment3;
import java.util.Arrays;

public class Program11 {
	
	static String removeDuplicate(char str[], int n) 
    {  
        int index = 0; 
  
        for (int i = 0; i < n; i++) 
         { 
          	int j; 
  
          	for (j = 0; j < i; j++)  
             { 
                if (str[i] == str[j]) 
                 { 
                    break; 
                 } 
             } 
  
          		if (j == i)  
          		 { 
          			str[index++] = str[i]; 
          		 } 
           	} 
        return String.valueOf(Arrays.copyOf(str,index)); 
    } 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		char str[] = "bananas".toCharArray(); 
        int n = str.length;
        System.out.println("remove duplicate characters from String : "+ removeDuplicate(str, n));

	}


}