//8. Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

package Assignment2;

import java.util.Scanner;

class Average {
	double A,B,C;
	double average;
	
	 double method1()
	{
		average= (A+B+C)/3.0;
		return average;
	}
    Average(double a,double b,double c){
    	A=a;
    	B=b;
    	C=c;
    }
}
 public class Program8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter value of A: ");
		double A= s.nextDouble();
		System.out.println("enter value of B: ");
		double B= s.nextDouble();
		System.out.println("enter value of C: ");
		double C= s.nextDouble();
		
		Average a = new Average(A,B,C);
		double output= a.method1();
		
//		System.out.println("The value of A is: "+a.A);
//		System.out.println("The value of B is: "+a.B);
//		System.out.println("The value of C is: "+a.C);
		System.out.println("The total Average is: "+output);
		
	}

}
