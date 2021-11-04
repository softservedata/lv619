package hw12Threads_IO.hw03;

public class Thread02 extends Thread{
	
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		
		Thread03 t = new Thread03();
		t.start();
		
	}

}
