//10. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
//	Name        Year of joining        Address
//	Robert            1994            WallsStreat
//	Sam               2000            WallsStreat
//	John              1999            WallsStreat

package Assignment2;
import java.util.Scanner;
class Employee {
	        String name;
	       // float salary;
	        int joiningYear;
	        String address;
	        Employee(){
	        	
	        }
	        Employee(String n,int J,String a ){
	        	name=n;
	        	joiningYear=J;
	        	address= a;
	        }
        
	        public void getInput() {
	        	 System.out.println(" ");
	        	 
	        	  System.out.print(name +"\t");
	        	  
	        	  System.out.print(joiningYear+ "\t");
	        	  
	        	  System.out.print(address);
	        	  
	           }
}    	
	    public class Program10 {   
	    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee("Robert",1994,"WallStreat");
		Employee e1 = new Employee("Sam",2000,"WallStreat");
		Employee e2 = new Employee("John",1999,"WallStreat");
		
		System.out.println("Name \t JoiningYrear \t Address");
		e.getInput();
		e1.getInput();
		e2.getInput();
	  } 
}


