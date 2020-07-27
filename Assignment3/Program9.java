//9) How to find all permutations of String?
//Write a program to print all permutations of a String in Java, for example, if the input is "xyz" then it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".


package Assignment3;

public class Program9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "xyz";
        int n = str.length();
        Program9 p= new Program9();
         
        p.permute(str, 0, n-1);         
	}
	
	private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 

	public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 