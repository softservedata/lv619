package _05_arraysLoops.hw3;
import static __myLib.ConsoleInputReader.getCorrectIntValue;
import static __myLib.Rand.randInt;

class Appl {
	////////////////////////////////////////////////////////////////////////////
	//	Enter 5 integer numbers. Find 
	//	position of second positive number;
	//	minimum and its position in the array.
	//	Organize entering integers until the first negative number.
	//	Count the product of all entered even numbers.
	////////////////////////////////////////////////////////////////////////////
	private static int[] readWhilePositiveNum() throws StackOverflowError{
		String[] buffer = readWhilePositiveNum(getCorrectIntValue()).split(" ");
		int[] out = null;
			out = new int[buffer.length];
			for(int i = 0; i < out.length; ++i)
			out[i] = Integer.parseInt(buffer[i]);
		return out;
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static String readWhilePositiveNum(int num) {
		return num +
				(num < 0 ? "" : " " + readWhilePositiveNum(getCorrectIntValue()));
	}
	////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		IntArr intArr = new IntArr();
		int nums[] = new int[5];
		for(int i = 0; i < nums.length; ++i) {
			nums[i] = randInt(-100, 100);
			System.out.print(nums[i] + " ");
		}
		System.out.println('\n' + (intArr.getSecondPositiveNumIndx(nums) != -1 ?
				"index of second positive number is " +
				intArr.getSecondPositiveNumIndx(nums) : 
					"There's less than one positive number"));
		System.out.println("min num is " + intArr.minNum(nums));
		System.out.println("min num indx is " + intArr.minNumIndx(nums));
		System.out.println("\nenter numbers:");
		try { 
		System.out.println(intArr.prodOfEven(nums = readWhilePositiveNum()) == 1 ? 
				"even numbers were not entered" : intArr.prodOfEven(nums) + 
					" is the product of all entered even numbes");
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
	}
	////////////////////////////////////////////////////////////////////////////
}