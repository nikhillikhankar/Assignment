//You have to make a class file to execute all the method with respective HashSet.

package Programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Creating HashSet and adding elements
		HashSet<String> set=new HashSet();  			  
        set.add("Akash");    
        set.add("Bunty");    
        set.add("Chintu");   
        set.add("Dipak");
        set.add("Sagar");
        
        
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
		
     //Traversing elements
        Iterator<String> itr=set.iterator();			  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
        
      //Removing specific element from HashSet  
        set.remove("Sagar");  
        System.out.println("After invoking remove(object) method: "+set);  
		
      //Removing all the new elements from HashSet  
        set.removeAll(set);  
        System.out.println("After invoking removeAll() method: "+set);  
        
        //Removing elements on the basis of specified condition  
        set.removeIf(str->str.contains("Akash"));    
        System.out.println("After invoking removeIf() method: "+set);
        
     // Check for the empty set 
        System.out.println("Is the set empty: " + set.isEmpty()); 
        
        //Removing all the elements available in the set  
        set.clear();  

        set.add("Akash");    
        set.add("Bunty");    
        set.add("Chintu");   
        set.add("Dipak");
        set.add("Sagar");
        set.addAll(set);  

        System.out.println("First HashSet: " + set);
        System.out.println(set);
        
        // Displaying the HashSet 
        System.out.println("HashSet: " + set); 
  
        // Creating a new cloned set 
        HashSet cloned_set = new HashSet(); 
  
        // Cloning the set using clone() method 
        cloned_set = (HashSet)set.clone(); 
  
        // Displaying the new Set after Cloning; 
        System.out.println("The new set: " + cloned_set); 
        
     // Displaying the size of the HashSet 
        set.size();
        System.out.println("The size of the set is: " + set.size());
        
        System.out.println("The HashSet: " + set); 

       // Creating the array and using toArray() 
        Object[] arr = set.toArray(); 

        System.out.println("The array is:"); 
        	
        for (int j = 0; j < arr.length; j++) 
        {
        	System.out.println(arr[j]); 
        }	
        
     // Populating set1
        HashSet<String> set1 = new HashSet<String>(); 
        
        set1.add("Akash");    
        set1.add("Bunty");    
        set1.add("Chintu");   
        set1.add("Dipak");
        set1.add("Sagar");  
        System.out.println("Second HashSet: " + set1);
        
     // using equals() method 
        boolean value 
            = set.equals(set1); 
  
        // print the value 
        System.out.println("Are both set equal: "
                           + value); 
	
     // Using toString() method 
        System.out.println("The toString() method is: " +set.toString()); 
        
     // contains same elements 
        System.out.println("\nDoes set contains set 1: "
                           + set.containsAll(set1)); 
        
        
        
	}

}
