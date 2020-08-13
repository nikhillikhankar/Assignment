//6. Java Program Showing Two Threads Working Simultaneously Upon Two Objects

package BankingSystem;

//class SingleThread extends Thread {

class TaskOneThread extends Thread {
	
	TaskOneThread(String threadName)
	{  
		super(threadName);
	}
		public void run()
		{
			System.out.println("Task1 run by= "+this.getName());
		}
}

class TaskTwoThread extends Thread {
	
	TaskTwoThread(String threadName)
	{  
		super(threadName);
	}
		public void run()
		{
			System.out.println("Task2 run by= "+this.getName());
		}
}


public class MultitaskingThread{	
	public static void main(String[] args) {  //throws InterruptedException {
		// TODO Auto-generated method stub
	
	TaskOneThread t1=new TaskOneThread("Task One Thread");
	TaskTwoThread t2=new TaskTwoThread("Task Two Thread");

	t1.start();
	t2.start();
  }

}
