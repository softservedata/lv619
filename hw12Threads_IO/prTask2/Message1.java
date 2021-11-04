package hw12Threads_IO.prTask2;

public class Message1 implements Runnable{
	
	public void run() {
		synchronized (Appl.obj) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello World");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
	                e.printStackTrace();
	            }
			}
		}
	}

}
