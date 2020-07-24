//1.Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.


package Assignment2;

public class Program1 {
	String name;
	int roll_no;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program1 s= new Program1();
		s.name = "John";
		s.roll_no = 2;
		
		System.out.println("The name is: " + s.name + "\n and roll number is : " + s.roll_no);
	}

}
