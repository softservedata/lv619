package _05_arraysLoops.hw2;
import static __myLib.Rand.randInt;

class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Enter 10 integer numbers.
	//	Calculate the sum of first 5 elements
	//	if they are positive or product of last 5 element in the other case.
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; ++i) {
			nums[i] = randInt(-100, 100);
			System.out.print(nums[i] + " ");
		}
		Mth mth = new Mth();
		System.out.println("\n" + 
				(mth.isFirstFivePositive(nums) ? 
						mth.sumOfFirstFive(nums) : mth.prodOfLastFive(nums)));
	}
	////////////////////////////////////////////////////////////////////////////
}