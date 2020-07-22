//How do you retrieve a portion of an ArrayList? using sbiList() meythod.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList(); 
        arr.add(10); 
        arr.add(30); 
        arr.add(50); 
        arr.add(70); 
        arr.add(30); 
        
        List<Integer> sub = new ArrayList();
        System.out.println(arr); 
        sub = arr.subList(1, 3); 
        System.out.println(sub); 
	}

}
