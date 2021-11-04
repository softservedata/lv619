package hw12Threads_IO.hw01;

public class Appl {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		Thread03 t3 = new Thread03();
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();	
		
		t3.start();
		
		
	}
	

}
