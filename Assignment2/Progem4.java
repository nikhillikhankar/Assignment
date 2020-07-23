package Assignment2;

 class Triangle1 {	
	int a,b,c;

	  public double getArea()
	  {
	    double s = (a+b+c)/2;
	    return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
	  }
	  public double getPerimeter(){
	    return (a+b+c)/2;
	  }
 }
  	public class Progem4 {
	private static Triangle1 t1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle1 t1 = new Triangle1();
				
			t1.a=3;
			t1.b=4;
			t1.c=5;
			
			t1.getArea();
			t1.getPerimeter();
			
			System.out.println(t1.getArea());
			System.out.println(t1.getPerimeter());
			
	}

}

  