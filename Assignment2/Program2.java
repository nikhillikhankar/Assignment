//2.Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

package Assignment2;

 class Students {
	String name;
	String roll_no; 
	int ph_no;
}
public class Program2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s1= new Students();
		Students s2= new Students();
		
		s1.name= "Sam";
		s1.roll_no = "001";
	    s1.ph_no = 883248964;
		System.out.println("The name is: " + s1.name + ",\n and roll number is: " + s1.roll_no+ ",\n and Phone number number is: " + s1.ph_no);
		
		s2.name="John";
		s2.roll_no= "002";
		s2.ph_no = 668907425;
		System.out.println("The name is: " + s2.name + ", \n and roll number is: " + s2.roll_no+ ",\n and Phone number number is: " + s2.ph_no);

	}

}
