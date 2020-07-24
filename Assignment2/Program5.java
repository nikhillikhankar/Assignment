//5. Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.

package Assignment2;

 class Rectangle {
	int length;
	int breadth;
		
	public Rectangle(int l, int b)
	{
		length=l;
		breadth=b;
	}
	public void Rectangle(int l1, int b1)
	{
		length=l1;
		breadth=b1;
	}
	
	 public int getArea()
	{
		return length*breadth;
	}
	 
}	
  public class Program5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Rectangle r1 = new Rectangle(4,5);
	Rectangle r2 = new Rectangle(5,8);
	
		System.out.println("Area of Rectangle for(4,5) is:"+r1.getArea());
		System.out.println("Area of Rectangle for(5,8) is:"+r2.getArea());
		
	}
		
}


