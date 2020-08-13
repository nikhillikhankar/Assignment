//4. You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, n and p, as parameters and finds . If either p  or n is negative, then the method must throw an exception which says "n and p should not be negative". Also, if both  and  are zero, then the method must throw an exception which says "n and p should not be zero"
//For example, -4 and -5 would result in java.lang.Exception: n or p should not be negative.
//Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.

package BankingSystem;

import java.io.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;

class Calculator {
 
	public int power(int n , int p) throws Exception
	{
		if(n>=0 && p>=0)
		{
			return (int)Math.pow(n,p);
		}
		else
		{
			throw new Exception("n and p should not be negative");
			
		}
		
	}
	  
	

//public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t =in.nextInt();
		while(t-- > 0)
		{
			int n= in.nextInt();
			int p= in.nextInt();
			
			Calculator mycalculator=new Calculator();
			try {
                int ans = mycalculator.power(n,p);
                System.out.println(ans);
            }
            catch (Exception e)
			{
                System.out.println(e.getMessage());
            }
        }
       in.close();

	}
}