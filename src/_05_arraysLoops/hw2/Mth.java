package _05_arraysLoops.hw2;
import java.util.Arrays;

public class Mth {
	////////////////////////////////////////////////////////////////////////////
	public int sumOfFirstFive(int[] nums) {
		if(nums == null || Arrays.equals(nums, null) || nums.length < 5)
			return 0;
		int out = 0;
		for(int i = 0; i < 5; ++i)
			out += nums[i];
		return out;
	}
	////////////////////////////////////////////////////////////////////////////
	public int prodOfLastFive(int[] nums) {
		if(nums == null || Arrays.equals(nums, null) || nums.length < 5)
			return 0;
		int out = 1;
		for(int i = nums.length - 5; i < nums.length; ++i)
			out *= nums[i];
		return out;
	}
	////////////////////////////////////////////////////////////////////////////
	public boolean isFirstFivePositive(int[] nums) {
		if(nums == null || Arrays.equals(nums, null) || nums.length < 5)
			return false;
		for(int i = 0; i < 5; ++i)
			if(nums[i] < 0) return false;
		return true;
	}
	////////////////////////////////////////////////////////////////////////////
}
