package hw12Threads_IO.hw02;

public class Appl1 {
	
	public static Object obj1 = new Object();
	public static Object obj2 = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		
		t1.start();
		t2.start();
		
	
	}

}
