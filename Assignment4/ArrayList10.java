//How do you replace a particular element in an ArrayList with the given element? set() method.

import java.util.ArrayList;

public class ArrayList10 {
	
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<>();
        
        list.add("nikhil");
        list.add("akash");
        list.add("sagar");
        list.add("pintu");
         
        System.out.println(list);
 
        //Replace akash with sagar
         
        int index = list.indexOf("akash");
         
        list.set(index, "sagar");
         
        System.out.println(list);
 
 
        // replace nakhil with pintu
 
        list.set( list.indexOf("nikhil") , "pintu");
 
        System.out.println(list);
    }
}
		
