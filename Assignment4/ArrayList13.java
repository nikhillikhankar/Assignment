//How do you remove an element from a particular position of an ArrayList?

import java.util.ArrayList;

public class ArrayList13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<String> arr = new ArrayList();
			
			arr.add("Java");
			arr.add("DotNet");
			arr.add("Android");
			arr.add("CPP");
			arr.add("Hello");  
		        
			System.out.println(arr);
		        
			arr.remove(1); 
		          
		        arr.remove(3); 
		  
		         
		        System.out.println("after removing ArrayList : " + arr); 
	}

}
