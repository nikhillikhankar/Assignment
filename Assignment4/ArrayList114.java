//How do you remove the given element from an ArrayList?


import java.util.ArrayList;

public class ArrayList114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<String> al = new ArrayList<String>();
	       al.add("AA");
	       al.add("BB");
	       al.add("CC");
	       al.add("DD");
	       al.add("EE");
	       al.add("FF");
	       
	       System.out.println("ArrayList before remove:");
	       
	       	for(String var: al){
	           System.out.println(var);
	       }
	       
	       al.remove("AA");			//Removing element AA from the arraylist
	       
	       al.remove("FF");			//Removing element FF from the arraylist
	       
	       al.remove("CC");			//Removing element CC from the arraylist
	       
	       
	       boolean b=al.remove("GG");
	       System.out.println("Element GG removed: "+b);
	       System.out.println("ArrayList After remove:");
	       for(String var2: al){
	           System.out.println(var2);
	       } 
	}

}
