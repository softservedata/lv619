package _05_arraysLoops.pt1;
import static __myLib.Rand.randInt;

class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Create an array of ten integers. Display 
	//	the biggest of these numbers;
	//	the sum of positive numbers in the array;
	//	the amount of negative numbers in the array.
	//  What values there are more: negative or positive?
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; ++i) {
		nums[i] = randInt(-100, 100);
		System.out.print(nums[i] + " ");
		}
		int max = nums[0];
		int sumOfPositive = 0;
		int amountOfNegative = 0;
		for(int i = 0; i < nums.length; ++i) {
			if(max < nums[i]) max = nums[i];
			if(nums[i] >= 0) sumOfPositive += nums[i];
			else ++amountOfNegative;
		}
		System.out.println(
				"\nmax = " + max +"\tsum of positive = " + sumOfPositive +
				"\tamount of negative = " + amountOfNegative + "\n" + 
				(amountOfNegative == nums.length - amountOfNegative ? "+=-" : 
					amountOfNegative > nums.length - amountOfNegative ? "+<-" : "+>-"));
	}
	////////////////////////////////////////////////////////////////////////////
}