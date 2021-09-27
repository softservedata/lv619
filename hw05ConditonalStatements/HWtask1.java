package hw05ConditonalStatements;
import java.util.Scanner;

public class HWtask1 {
	
	
	
	public static boolean checkInRange(float x) {
		if (x <= 5 && x > -5) {
			System.out.println("inrange");
			return true;
		}
		else {
			return false;}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print number to check:");
		float x;
		x = sc.nextFloat();
		checkInRange(x);
	}


}
