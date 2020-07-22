//How do you retrieve an element from a particular position of an ArrayList? get() method

import java.util.ArrayList;

public class ArrayList9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> arr = new ArrayList(4); 
		  
	        arr.add(10); 
	        arr.add(20); 
	        arr.add(30); 
	        arr.add(40); 
	  
	        System.out.println("List: " + arr); 
	         
	        int element = arr.get(2); 			       //element of index 2 
	  
	        System.out.println("the element at index 2 is " + element); 
	    } 
	
	}


