package _12_IO_Thread.pt1;
import java.util.concurrent.TimeUnit;

public class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Output text «I study Java» 10 times
	//	with the intervals of one second (Thread.sleep(1000);).
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
			System.out.println("I study Java");
			try { Thread.sleep(TimeUnit.SECONDS.toMillis(1));
			} catch (InterruptedException e) { }
		}
	}
	////////////////////////////////////////////////////////////////////////////
}