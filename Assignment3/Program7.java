// 7) How to count the occurrence of a given character in String?
//Your method must return a count of a given character, for example, if input String is "Java" and given character is 'a' then it should return 2.


package Assignment3;

class Program7 {

	public static int count(String s, char ch) 
    { 
        int res = 0; 
  
        for (int i=0; i<s.length(); i++) 
        { 
            // checking character in string 
            if (s.charAt(i) == ch) 
            res++; 
        }  
        return res; 
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Java"; 
        char ch = 'a'; 
        System.out.println("String name is: "+str);
        System.out.println("Character: "+ch);
        System.out.println(+count(str, ch )+" times in a string. "); 
	}

}
