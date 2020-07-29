//You have to make a class file to execute all the method with respective HashMap.

package Programs;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.HashMap<Integer,String> map = new java.util.HashMap<Integer, String>();
		
		map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   

		  // size() method prints the size of HashMap. 
		   map.size();
		   System.out.println("Size Of HashMap : " + map.size());
		   
		   System.out.println("Put one another element in 5th position: "+map);
		   map.put(5,"Apple");  
		   map.putAll(map);  
		      
		   System.out.println("After invoking putAll() method "); 
		   
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet())
		   {    
		    System.out.println(m.getKey()+" "+m.getValue());
		   }
		
		   System.out.println("Initial list of elements: "+map); 
		   
		   //key-based removal  
		    map.remove(1);  
		    System.out.println("Updated list key-based removal of elements: "+map);  

		    //value-based removal  
		    map.remove(2);  
		    System.out.println("Updated list of elements: "+map);  
		   
		    //key-value pair based removal  
		    map.remove(3, "Apple");  
		    System.out.println("Updated list of elements: "+map);  
	
		 // Checking for the emptiness of Map 
	        System.out.println("Is the map empty? " + map.isEmpty());
		
	
	}

}
