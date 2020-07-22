import java.util.ArrayList;

public class Arraylist6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr =new ArrayList();
	
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("D");
		arr.add("E");
	
		
		if(arr.contains("B"))
		{
			System.out.println("B is available in this arrylist");
		}
		else
		{
			System.out.println("not available in arraylist");
		}
		
		if(arr.contains("F"))
		{
			System.out.println("F is available in this arrylist");
		}
		else
		{
			System.out.println("not available in arraylist");
		}
		
		if(arr.contains("C"))
		{
			System.out.println("C is available in this arrylist");
		}
		else
		{
			System.out.println("not available in arraylist");
		}
	}

}
