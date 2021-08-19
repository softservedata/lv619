import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Write the radius of the flower bed");
		double r = Double.parseDouble(br.readLine());
		double p = 3.14;
		double S = p * r * r;
		double R = 2 * p * r;
		System.out.println("Perimeter of the flower bed is " + R + " and square is " + S);
	
	}

}
