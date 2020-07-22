//How do you decrease the current capacity of an ArrayList to the current size? using trimToSize() method.

import java.util.ArrayList;

public class ArrayListDecrese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList(5);
		
		arraylist.add (10);
		arraylist.add (40);
		arraylist.add (70);
		arraylist.add (20);
		arraylist.add (50);
		
		 
		
		arraylist.trimToSize();

		for(Integer number : arraylist)
		{
			System.out.println("Number = " + number);
		}
		System.out.println(arraylist.size());
	}

}
