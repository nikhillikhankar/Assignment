//How do you insert an element at a particular position of an ArrayList? add() method

import java.util.ArrayList;

public class ArrayList12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> names = new ArrayList();
        
        names.add("Java");
        names.add("Kotlin");
        names.add("Android");
        
        names.add(2,"Python");          //Python name is at 3rd position.
        
       for(String name : names){ 
            System.out.println(name);
        
        }
		
	//OR
        
   /*     ArrayList<Integer> arrlist = new ArrayList(5);  
     // use add() method to add elements in the list
        arrlist.add(15, 15);
        arrlist.add(22, 22);
        arrlist.add(30, 30);
        arrlist.add(40, 40);

        // adding element 25 at third position
        arrlist.add(2, 25);

        // let us print all the elements available in list
        for (Integer number : arrlist) {
           System.out.println("Number = " + number);
        }  
	*/	
     

  }
}