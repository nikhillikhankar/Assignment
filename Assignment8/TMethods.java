//3. Write a program of thread to used all the method of thread like (wait, sleep, notify, notifyall,join,getname, currentthreade islive?, priority ).
// you have to write on sigle program to used this all.

package BankingSystem;
class Th extends Thread {

	public void run()
	{
		Thread t = currentThread();
		System.out.println("Thread status: "+t.isAlive());

		for(int i=0;i<=5;i++)
			{
				try
				{
					t.sleep(500);
				}
				catch(Exception e)
				{
					
				}
				System.out.println(i);
			}
			
		}
}	

public class TMethods{
public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Th t1=new Th();
		Th t2=new Th();
		
		System.out.println("Name of Thread is: "+t1.getName());
		t1.setName("Nikhil");
		System.out.println("Name of Thread after changing its name is: "+t1.getName());
		System.out.println("Priority of Thread is: "+t1.getPriority());
		t1.setPriority(10);
		System.out.println("Priority of Thread after changing its Priority is: "+t1.getPriority());
		
		
		t1.start();
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
		}
		System.out.println("Thread1 status: "+t1.isAlive());
		t2.start();
		
		
	}

}
