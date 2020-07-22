//How do you get the position of a particular element in an ArrayList? Using indexOf() method.
import java.util.ArrayList;
import java.util.List;


public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a = new ArrayList();
		
		a.add("NAgpur");
		a.add("Pune");
		a.add("Mumbai");
		a.add("Hyderabad");
		a.add("Banglore");
	
		System.out.println("The index of the element Mumbai arraylist: " + a.indexOf("Mumbai"));
		System.out.println("The index of the element Nagpur arraylist: " + a.indexOf("Nagpur"));
	
		System.out.println("The last index of element Pune arraylist: " + a.lastIndexOf("Pune"));
		
	}

}
