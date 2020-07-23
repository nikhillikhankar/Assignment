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
