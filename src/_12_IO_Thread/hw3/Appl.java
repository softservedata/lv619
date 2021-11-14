package _12_IO_Thread.hw3;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create a thread «one», which would start the thread «two»,
	//	which has to output its number («Thread number two») 3 times and
	//	create thread «three», which would to output message «Thread number three» 5 times.////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		new Thread("one"){@Override public void run() {new Thread_("two", 3).start();}}.start();
		new Thread_("three",5).start();
		
	}
	////////////////////////////////////////////////////////////////////////////
	private static class Thread_ extends Thread{
		private int n;
		Thread_(String name , int n){
			super(name);
			this.n = n;
		}
		@Override
		public void run() {
			for(int i = 0; i < n; ++i)
				System.out.println("Thread number " + getName());
		}
	}
	////////////////////////////////////////////////////////////////////////////
}