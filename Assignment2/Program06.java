//6. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

package Assignment2;

class Area {
	int length;
	int breadth;
	
    public void setDim(int l, int b)
	  {
	    length = l;
	    breadth = b;
	  }
	  public int getArea()
	  {
	    return length*breadth;
	  }
	  
}

 public class Program06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Area a = new Area();
				a.setDim(25,30);
				a.getArea();
				
				System.out.println("Area of Rectangle is: "+a.getArea());
                      		                                      
	}

}
