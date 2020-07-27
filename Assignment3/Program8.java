//8) How to convert numeric String to an int?
//For example, if you pass "67263" to the program then it should return 67263.

package Assignment3;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "67263";
				
 		int i = Integer.parseInt(s);				   //using Integer.parseInt() method
		
 // OR     	Integer i=Integer.valueOf(s);				   //using Integer.valueOf() method
		
		System.out.println(i);
		 
	}

}
