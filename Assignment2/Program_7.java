//7. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

package Assignment2;

class Areaa{
	int length;
	int breadth;
	  
	public Areaa(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public int Returnarea()
	  {
		 return length*breadth;
	  }
	  
	
}

 public class Program_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Areaa a= new Areaa(10,5);
	System.out.println("Length is = " + a.length);
    System.out.println("Breadth is = " + a.breadth);
    System.out.println("Area of Rectangle is = " + a.Returnarea());
	}

}
