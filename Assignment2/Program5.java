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


