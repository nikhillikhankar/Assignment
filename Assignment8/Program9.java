//9. Java Program to Start One Thread More than Once

package BankingSystem;

public class Program9 extends Thread {
	
		public void run()
		{
			System.out.println("running...");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program9 t1=new Program9();
		t1.start();
		t1.start();
	}

}
