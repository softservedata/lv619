package L5.homework.Task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of month:");
    int n = sc.nextInt();

    System.out.println("The number of days in this month:"+ arr[n-1]);
  }
}
