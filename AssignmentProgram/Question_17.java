package AssignmentProgram;
//Q.17 WAP to create one thread by implementing Runnable interface in Class.

/*class samplethread implements Runnable{
	public void run() {
		System.out.println("Thread is under running");
		for(int i=1; i<=10; i++) {
			System.out.println("i = "+i);
		}
	}
}
*/
class mythread implements Runnable
{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class Question_17 {
	public static void main(String[] args) {
		/*samplethread threadobject = new samplethread();
		Thread thread= new Thread(threadobject);
		System.out.println("Thread about to start");
		thread.start();
		*/
		
		mythread myt = new mythread();
		Thread t = new Thread(myt);
		t.run();
		for (int i=0; i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
