//How do you convert an ArrayList to Array? Using toArray() method of ArrayList class.

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList8 {

	public static void main(String[] args)
	{
/*		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
         
            
        Object[] objects = arraylist.toArray();
        
        
        for(Object obj : objects)
        {	
            System.out.print(obj + " "); 
            
        }    
                       
	}
  }
*/
		
		 ArrayList<String> list = new ArrayList<>(2);
         
	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add("D");
	        
	        Object[] array = list.toArray();
	         
	        System.out.println( Arrays.toString(array) );
	 
	        for(Object obj : array) {
	            String s = (String) obj;
	             
	            System.out.println(s);
	        }
	    }
	}

