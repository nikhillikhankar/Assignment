//10.Java Program to Check CurrentThread in Multi Threading Concept.

package BankingSystem;

class ChildThread extends Thread {
	
	public void run() 
		{
		 
			for (int i = 0; i < 3; i++)
			{
				System.out.println("Child thread"); 
			} 
		} 

}

public class CurrentThread {

	private static final int MIN_PRIORITY = 0;
	private static final int MAX_PRIORITY = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = Thread.currentThread(); 
	    System.out.println("thread: " + t.getName());
	 
		 t.setName("Hello");
		 System.out.println("After name change: " + t.getName());
		 System.out.println("Main thread priority: " + t.getPriority());

//		t.setPriority(MAX_PRIORITY);
		 System.out.println("Main thread new priority: " + t.getPriority());
		 
		 for (int i = 0; i < 3; i++)
		 {
		 System.out.println("Main thread");
	   	 }
		 
		 ChildThread ct = new ChildThread();
		 System.out.println("Child thread priority: "+ ct.getPriority());
		 
		 ct.setPriority(MIN_PRIORITY);
		 System.out.println("Child thread new priority: "+ ct.getPriority());
		 ct.start(); 
		}
	} 
		


