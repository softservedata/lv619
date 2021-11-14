package _12_IO_Thread.hw1;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	 //	Run three threads and output there different messages for 5 times.
	//	The third thread supposed to start after finishing working of the two previous threads.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Thread _1 = new Thread_();
		Thread _2 = new Thread_();
		Thread _3 = new Thread_();
		_1.start();
		_2.start();
		try {
			_1.join();
			_2.join();
		} catch (InterruptedException e) {}
		_3.start();
	}
	////////////////////////////////////////////////////////////////////////////
	private static  class Thread_ extends Thread {
		@Override
		public void run(){
			for(int i = 0; i < 5; ++i)
			System.out.println(Thread.currentThread().getName() + " message");
		}
	}
	////////////////////////////////////////////////////////////////////////////
}