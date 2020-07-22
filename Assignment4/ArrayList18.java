import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
	    list.add("A");
	    list.add("D");
	    list.add("F");

	Set<String> list1 = new TreeSet();
	    list1.add("B");
	    list1.add("C");
	    list1.add("E");
	    list1.addAll(list);

	 List mainList = new ArrayList();   
	 mainList.addAll(Arrays.asList(list1));
	 Iterator<String> mainList1 = mainList.iterator();				//by using Iterator 
	 while(mainList1.hasNext()){
	 System.out.printf("total : %s %n", mainList1.next());
	 }
		
		
	/*	List<double[]> values = new ArrayList();

        double[] element1 = new double[] { 100, 100, 100, 100, 100 };
        double[] element2 = new double[] { 50, 35, 25, 45, 65 };
        
        values.add(element1);
        values.add(element2);

        // Add the result to arraylist.
        List<Double> temp = new ArrayList<Double>();
        
        for(int j=0;j<values.size();j++) {
            
        	for (int i = 0; i < values.get(0).length; i++) {
                temp.add(values.get(0)[i]);
                temp.add(values.get(1)[i]);
            }
        }

        // Convert arraylist to int[].
        Double[] result = temp.toArray(new Double[temp.size()]);
        double[] finalResult = new double[result.length]; 				// This hold final result.
        for (int i = 0; i < result.length; i++) {
            finalResult[i] = result[i].doubleValue();
        }

        for (int i = 0; i < finalResult.length; i++) {
            System.out.println(finalResult[i]);
        }
	*/
		
		
		
	}

}
