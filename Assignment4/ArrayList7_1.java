//How do you get the position of a particular element in an ArrayList? Using LastIndexOf() method.

import java.util.ArrayList;

public class ArrayList7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Integer> al = new ArrayList();
	      al.add(1);
	      al.add(20);
	      al.add(9);
	      al.add(17);
	      al.add(9);
	      al.add(17);
	      al.add(91);
	      al.add(27);
	      al.add(1);
	   

	      
	      System.out.println("index of element 1: "+al.indexOf(1));
	      System.out.println("index of element 9: "+al.indexOf(9));
	      System.out.println("index of element 17: "+al.indexOf(17));
	      System.out.println("index of element 91: "+al.indexOf(91));
	      System.out.println("index of element 20: "+al.indexOf(20));
	      
	      System.out.println("Last index of element 1: "+al.lastIndexOf(1));
	      System.out.println("Last index of element 9: "+al.lastIndexOf(9));
	      System.out.println("Last index of element 17: "+al.lastIndexOf(17));
	      System.out.println("Last index of element 91: "+al.lastIndexOf(91));
	      System.out.println("Last index of element 20: "+al.lastIndexOf(20)); 
	   }
	
	}


