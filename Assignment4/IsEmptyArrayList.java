//How do you find out whether the given ArrayList is empty or not?
//Note : You can also use size() method to check whether the given ArrayList is empty or not.

import java.util.ArrayList;

public class IsEmptyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Integer> arraylist = new ArrayList();
		
		arraylist.add (10);
		arraylist.add (40);
		arraylist.add (70);
		arraylist.add (20);

		int size = arraylist.size();
		
		System.out.println("Array[]= " + arraylist); 
		
		System.out.println(size = arraylist.size());
		
		if(arraylist.isEmpty())
		{
			System.out.println("The ArrayList is Empty");
		}
		else
		{
			System.out.println("The ArrayList is Not empty");
		}
	}

}
