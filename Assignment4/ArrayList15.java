//How do you remove all elements of an ArrayList at a time?

import java.util.ArrayList;

public class ArrayList15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		     
        System.out.println(list);
         
        list.clear();  					 //clear the list
         
        System.out.println(list);
	}

}
