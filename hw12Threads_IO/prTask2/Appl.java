package hw12Threads_IO.prTask2;

public class Appl {
	
	public static Object obj = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = new Message1();
		Runnable r2 = new Message2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("My name is Yurii");
		

	}

}
