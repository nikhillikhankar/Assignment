//2. Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, even number)
//i/p :{2 ,4 ,6 ,7, 8,9,90,78,41,56,79,45,65,85}
// out put :
// even :  7
// odd :  7


package Programs;
import java.util.*;

import java.util.Arrays;
import java.util.Collection;


//  public final class Algorithm {

	public  class OddEvenInterger {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			OddEvenInterger t= new OddEvenInterger();
			Collection<Integer> collect = Arrays.asList(2 ,4 ,6 ,7, 8,9,90,78,41,56,79,45,65,85);
			System.out.println("Input is: " +collect);
			int count = OddEvenInterger.countIf(collect, new OddPredicate()); 
			System.out.println("Number of odd integers = " + count );
			 int count2 =t.countIf(collect, new EvenPredicate()); 
				System.out.println("Number of even integers = " + count2 );

		
		}

	    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

	        int count = 0;
	        for (T elem : c)
	           if (p.test(elem))
	              ++count;
	        return count;
	    } 
	}
//where the generic UnaryPredicate interface is defined as follows:
	
	 interface UnaryPredicate<T> {
	    public boolean test(T obj);
		}
//	For example, the following program counts the number of odd integers in an integer list:
//	import java.util.*;

	class OddPredicate implements UnaryPredicate<Integer> 
	{
	    public boolean test(Integer i) 
	    { 
	    	return i % 2 != 0; 
	    }
	}

	class EvenPredicate implements UnaryPredicate<Integer> 
	{
	    public boolean test(Integer i) 
	    { 
	    	return i % 2 == 0; 
	    }
	}

   
	
		
	


