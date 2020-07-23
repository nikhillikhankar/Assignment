package Assignment2;

 class Average {
	double A=10,B=20,C=30;
	double average;
	
	 double method1()
	{
		average= (A+B+C)/3.0;
		return average;
	}

}
 public class Program8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Average a=new Average();
		
		a.method1();
		
		System.out.println("The value of A is: "+a.A);
		System.out.println("The value of B is: "+a.B);
		System.out.println("The value of C is: "+a.C);
		System.out.println("The total Average is: "+a.average);
		
	}

}
