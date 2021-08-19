import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Hello. What is your name?");
	String name = br.readLine();
	System.out.println("Where do you live?");
	String place= br.readLine();

	System.out.println("Hello " + name);  
	System.out.println("You live in " + place);
	System.out.println("It's grate!");
	  }
}
