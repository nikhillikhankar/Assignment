//3. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

package Assignment2;

 class Triangle {
	 int a=3,b=4,c=5;
	 int h=5;
	  public double getArea()
	  {
	    double s = (b*h)/2;
	    return s;
	  }
	  public double getPerimeter()
	  {
	    return (a+b+c);
	  }
	}

public class Program3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t=new Triangle();
		
		t.a= 3;
		t.b= 4;
		t.c= 5;
		t.h=5;
		System.out.println("Area of Triangle is: " + t.getArea());
		System.out.println("Perimeter of Triaangle is: "+ t.getPerimeter());
		
		
	}

}
