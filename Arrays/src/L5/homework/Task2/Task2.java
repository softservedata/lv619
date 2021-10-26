package L5.homework.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //int[] arr = {2, 5, 6, 23, -8, 45, 2, 3, -7, 2};
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            System.out.println("Enter value" + (i+1) + ":");
            arr[i]= sc.nextInt();
        }

        if (arr[0]>0 && arr[1]>0 && arr[2]>0 && arr[3]>0 && arr[4]>0)
        {
            int res = 0;
            for(int i = 0; i < 5; i++)
            {
                res+=arr[i];
            }
            System.out.println("Result:" + res);
        }
        else
        {
            int res = 1;
            for(int i = 9; i > 4; i--)
            {
                res*=arr[i];
            }
            System.out.println("Result:" + res);
        }


    }
}
