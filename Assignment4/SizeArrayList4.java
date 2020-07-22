//How do you find the number of elements present in an ArrayList? 
//Using size() method. size() method returns number of elements present in an ArrayList.

import java.util.ArrayList;

public class SizeArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Integer> arraylist = new ArrayList();
		
		arraylist.add (10);
		arraylist.add (40);
		arraylist.add (70);
		arraylist.add (20);
		arraylist.add (80);
		arraylist.add (30);

		int size = arraylist.size();
		
		System.out.println("Array[]= " + arraylist); 
		
		System.out.println(size = arraylist.size());
		
		

	}

}
