package hw12Threads_IO.hw03;

public class Thread01  extends Thread{
	
public void run() {
		
		
		Thread02 t = new Thread02();
		t.start();
	}

}
