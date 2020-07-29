//You have to make a class file to execute all the method with respective LinkedList.

package Programs;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	LinkedList l= new LinkedList();
		LinkedList<String> l = new LinkedList<String>();
			l.add("Hello");						 
			l.add("Word");
			l.add("10");
			l.add("Beautiful"); 							
		    l.add("Place");
		    		    
			System.out.println("The List is: "+l);	   			// use add() method to add elements in the list
		   
			l.add(2 ,"Nikhil");								//using boolean add(Object element)
			l.add(4, "Sagar");
		    System.out.println("The new List is:" + l);					// Adding new elements to the end
		        
		    System.out.println("The get method List is:" + l.get(2));				//using get() method
		    
		    System.out.println("The new get method List is:" + l.get(5));   
		    
		    System.out.println("The Object that is replaced is: " + l.set(2, "Best"));		//Set() method
		    
		    System.out.println("The Object that is replaced is: " + l.set(4, "50"));
		    
		    System.out.println("The List is: "+l);
		    
		    System.out.println("\nDoes the List contains 'Hello': " 		//using Contains() method.
                    + l.contains("Hello")); 

		    System.out.println("\nDoes the List contains 'Wonderful': " 
                    + l.contains("Wonderful")); 

		    System.out.println("The List is: "+l);

		    l.push("Word1");				//push() method
		    l.push("place1");
		    String s = l.pop();
		    System.out.println(s);
		    l.push("10");					//pop() method
		    System.out.println(l);
		    
		    l.clear(); 						//clear() method
		    System.out.println("List after clearing all elements: " + l);
		    
		    l.add("Hello");						 
			l.add("Word");
			l.add("10");
		    l.add("Place");
		    l.addFirst("First"); 					//addFirst() method
	        l.addFirst("At"); 
	        System.out.println("The List is: "+l);
	        
	        l.addLast("At"); 						//addLast() method
	        l.addLast("Last");
	        System.out.println("The List is: "+l);
	        
	        System.out.println("The first element is: " + l.getFirst());		//getFirst() method
	        System.out.println("The first element is: " + l.getLast());      	//getLast() method
	        System.out.println("The List is: "+l);
	        
	        System.out.println("The first occurrence of 10 is at index:" 		//indexOf() method
                    + l.indexOf("10")); 
	        System.out.println("The first occurrence of Word is at index: "  
                     + l.indexOf("Word")); 
		    
	        System.out.println("Last occurrence of Last is at index: "			//lastIndexOf() method 
                    + l.lastIndexOf("Last")); 
	        System.out.println("Last occurrence of Place is at index: " 
                   + l.lastIndexOf("Place"));
	        
	        System.out.println("First LinkedList:" + l);
	        LinkedList sec_l = new LinkedList(); 
	        sec_l = (LinkedList) l.clone();							//clone() method 
	          
	        System.out.println("Second LinkedList is:" + sec_l);		// Displaying the other linked list 
	        
	        l.size();														
	        System.out.println("The size of the linked list is: " 		//size() method
                    + l.size());
	        
	        System.out.println("LinkedList:" +l);
	        l.remove();										// remove() method
	        l.remove(4);
	        l.remove("Place");
	        System.out.println("Final LinkedList:" +l);
	        
	        
	        System.out.println("LinkedList:" + l); 
	        System.out.println("remove first element is: " + l.removeFirst()); 	// removeFirst() method
	        System.out.println("Final LinkedList:" + l); 						// Displaying the final list 
	        
	        System.out.println("LinkedList:" + l); 
	        System.out.println("remove Last element is: "+ l.removeLast()); 	// removeLast() method
	        System.out.println("Final LinkedList:" + l); 						// Displaying the final list 
	        	
	        java.util.Collection<String> collect= new ArrayList<String>();
	        collect.add("A"); 
	        collect.add("Computer"); 
	        collect.add("Portal"); 
	        collect.add("for"); 
	        collect.add("Geeks"); 
	        System.out.println("The LinkedList is: " + l); 
	        l.addAll(collect);									// Appending the collection to the list 
	        System.out.println("new linked list is: "+l);		// Clearing the list using clear() and displaying 
	    
	     } 

}


