// 4) How to reverse String in Java using Iteration and Recursion?
//Your task is to write a program to reverse String in Java without using the StringBuffer class. You also need to provide both iterative and recursive algorithms for String reversal. You can use other String utility methods e.g. charAt(), toCharArray() or substring() from java.lang.String class.


package Assignment3;

class Program4 {
    public String reverseIterative(String s) {
        if (s==null)
         return null;
        
        int len = s.length();
        
        char[] reversed = new char[len];
        
        for (int i=0;i<=s.length()/2;i++)
        	{
            	reversed[i] = s.charAt(len-i-1);
            	reversed[len -i -1] = s.charAt(i);
        	}
        	return new String(reversed);
    }

    public String reverseRecursive(String s1){
        if (s1==null) 
          return null;
        	if (s1.length() == 1)
        	return s1;
        	return s1.charAt(s1.length() -1) + reverseRecursive(s1.substring(0, s1.length() -1));
     }
}

class ReverseString {     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="nikhil";
			String s1="sagar";
			
		Program4 p = new Program4();
		//Program4 p1 = new Program4();
		
		System.out.println("Reverse Iterative of String name nikhil is : " + p.reverseIterative("lihkin"));
		System.out.println("Reverse Recursion of String name sagar is : " + p.reverseRecursive("ragas"));
	}

}
