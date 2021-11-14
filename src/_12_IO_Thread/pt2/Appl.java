package _12_IO_Thread.pt2;
import java.util.concurrent.TimeUnit;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Output two messages «Hello, world» and «Peace in the peace» 5 times
	//	each with the intervals of 2 seconds,
	//	and the second - 3 seconds. After printing messages, print the text «My name is …»
	////////////////////////////////////////////////////////////////////////////
	private static final long mainStartTime  = System.currentTimeMillis();
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static short getSeconds() {
		return (short)TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - mainStartTime);
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		MessageThread1 ms1 = new MessageThread1();
		MessageThread2 ms2 = new MessageThread2();
		ms1.start();
		ms2.start();
		try { ms1.join(); } catch (InterruptedException e) { }
		try { ms2.join(); } catch (InterruptedException e) { }
		System.out.println("My name is Paul");
	}
	////////////////////////////////////////////////////////////////////////////
	static class MessageThread1 extends Thread{
		@Override
		public synchronized  void run() {
			System.out.println("Hello, world (" + getSeconds() + " seconds passed)");
			for(int i = 0; i < 4; ++i) {
				try { this.wait(2000); } catch (InterruptedException e) { }
				System.out.println("Hello, world (" + getSeconds() + " seconds passed)");
			}
		}
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	static class MessageThread2 extends Thread{
		@Override
		public synchronized void run() {
			System.out.println("Peace in the peace (" + getSeconds() + " seconds passed)");
			for(int i = 0; i < 4; ++i) {
				try { this.wait(3000); } catch (InterruptedException e) { }
				System.out.println("Peace in the peace (" + getSeconds() + " seconds passed)");
			}
		}
	}
	////////////////////////////////////////////////////////////////////////////
}