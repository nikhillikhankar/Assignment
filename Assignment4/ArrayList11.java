//How do you append an element at the end of an ArrayList? 
//add() method appends an element at the end of an ArrayList.

import java.util.ArrayList;
import java.util.List;

public class ArrayList11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList();
        a.add(20);
        a.add(10);
        a.add(30);
        a.add(70);
        int i=0;
        while(a.size()<10)
        {
            if(i==(a.get(a.size()-1))){

        }
             i=a.get(a.size()-1);
             a.add(30);
             i++;
             break;
        }
        	System.out.println(a);
    }

}
