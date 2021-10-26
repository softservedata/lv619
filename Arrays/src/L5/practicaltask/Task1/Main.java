package L5.practicaltask.Task1;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	    int k = 0;
	    for(int i = 0; i<10; i++)
        {
            if (arr[i] > k)
            {
                k = arr[i];
            }
        }
	     System.out.println("The biggest number:" + k);

	    int sum = 0;
	    int b = 0;
        for(int i = 0; i<10; i++)
        {
            if (arr[i] > 0)
            {
                sum += arr[i];
                b++;
            }
        }
        System.out.println("The sum of positive elements:" + sum);

        int a = 0;
        for(int i = 0; i<10; i++)
        {
            if (arr[i] < 0)
            {
                a++;
            }
        }
        System.out.println("The amount of negative elements:" + a);

        if (a>b)
        {
            System.out.println("There are more negative values)))");
        }
        else System.out.println("There are more positive values)))");
    }
}
