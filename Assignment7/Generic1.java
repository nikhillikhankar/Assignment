//1. Write a generic method to find the maximal element in the range [begin, end] of a list.
//i/p :  {2,62, 4,78, 6, 10,49,20,59,43,29,30,56,89,}  
//out: 89.

package Programs;

import java.util.Arrays;
import java.util.List;

public class Generic1 {
	
	public static <T extends Comparable> T maximalElement (List<T> list, int from, int to) 
	{
        T max = list.get(from);
        
        for (int i = from + 1; i < to; i++) 
        {
            T element1 = list.get(i);
           
            if (element1.compareTo(max) > 0) 
            {
                max = element1;
            }
        }
        return max;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generic1 g = new Generic1();
		List<Integer> c = Arrays.asList(2,62,4,78,6,10,49,20,59,43,29,30,56,89);
		//System.out.println(Test.maximalElement(c, 3, 9));
        System.out.println(c);
		
	//	System.out.println(g.maximalElement(c, 1, 10));
		System.out.println("max value of this element is: "+g.maximalElement(c, 1, 14) );
	
	}

}
