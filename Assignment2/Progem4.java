package Assignment2;

 class Triangle1 {	
	int a=3,b=4,c=5;
	int h=5;

	  public double getArea(int b,int h)
	  {
	    double s = (b*h)/2;
	    return s;
	  }
	  public double getPerimeter(int a, int b, int c)
	  {
	    return (a+b+c);
	  }
 }
  	public class Progem4 {
	private static Triangle1 t1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle1 t1 = new Triangle1();
	
			System.out.println("Area of Triangle is: " + t1.getArea(4,5));
			System.out.println("Perimeter of Triangle is: "+ t1.getPerimeter(3,4,5));
			
	}

}

  