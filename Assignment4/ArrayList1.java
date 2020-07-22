//How do you increase the current capacity of an ArrayList? ensureCapacity() method

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<Integer> arraylist = new ArrayList(5);
			
			arraylist.add (10);
			arraylist.add (40);
			arraylist.add (20);
			arraylist.add (20);
			arraylist.add (20);
			arraylist.add (20);
			arraylist.add (20); 
			
			arraylist.ensureCapacity(15);
			
			for(Integer number : arraylist)
			{
				System.out.println("Number = " + number);
			}
			System.out.println(arraylist.size());
	}
}
