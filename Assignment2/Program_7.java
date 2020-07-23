package Assignment2;

import java.util.Scanner;

    class Area {
		  int length;
		  int breadth;
		  public Area(int l, int b){
		    length = l;
		    breadth = b;
		  }
		  public int getArea(){
		    return length*breadth;
		  }
		}

 public class Program_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
	    int l,b;

	    System.out.println("Enter length");
	    l = s.nextInt();
	    System.out.println("Enter breadth");
	    b = s.nextInt();

	    Area a = new Area(l,b);
	    System.out.println("Area : "+a.getArea());
	
	}

}
