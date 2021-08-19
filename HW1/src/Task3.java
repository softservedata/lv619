import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Input price for 1 min call from coutry '1'");
	    double c1 = Double.parseDouble(br.readLine());
	    System.out.println("Input price for 1 min call from coutry '2'");
	    double c2 = Double.parseDouble(br.readLine());
	    System.out.println("Input price for 1 min call from coutry '3'");
	    double c3 = Double.parseDouble(br.readLine());
	    System.out.println("Input time of call from coutry '1'");
	    double t1 = Double.parseDouble(br.readLine());
	    System.out.println("Input time of call from coutry '2'");
	    double t2 = Double.parseDouble(br.readLine());
	    System.out.println("Input time of call from coutry '3'");
	    double t3 = Double.parseDouble(br.readLine());
	    double price1 = c1 * t1;
	    double price2 = c2 * t2;
	    double price3 = c3 * t3;
	    double sum = price1 + price2 + price3;
	    System.out.println("Price for 1st call is " + price1);
	    System.out.println("Price for 2nd call is " + price2);
	    System.out.println("Price for 3rd call is " + price3);
	    System.out.println("Total price is " + sum);
	}
}
