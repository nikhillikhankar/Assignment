// How do you join two ArrayLists?

import java.util.ArrayList;

public class ArrayList17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arraylist1=new ArrayList();
        arraylist1.add("AL1: E1");
        arraylist1.add("AL1: E2");
        arraylist1.add("AL1: E3");

        
        ArrayList<String> arraylist2=new ArrayList();			//Second ArrayList
        arraylist2.add("AL2: E1");
        arraylist2.add("AL2: E2");
        arraylist2.add("AL2: E3");

        
        ArrayList<String> al= new ArrayList();				//New ArrayList
        al.addAll(arraylist1);
        al.addAll(arraylist2);

        
        for(String temp: al){							
            System.out.println(temp);				//Displaying elements of the joined ArrayList
        }
	}

}
