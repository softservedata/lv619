package _05_arraysLoops.hw3;

public class IntArr {
	////////////////////////////////////////////////////////////////////////////
	public int getSecondPositiveNumIndx(int[] nums) {
		if(nums == null) return -1;
		for(int i = 0, n = nums.length; i < n; ++i)
			if(nums[i] > 0)
				while(++i < n)
					if(nums[i] > 0)
						return i;
		return -1;
	}
	////////////////////////////////////////////////////////////////////////////
	public int minNum(int[] nums) {
		int out = nums[0];
		for(int i = 1; i < nums.length; ++i)
			if(nums[i] < out)
				out = nums[i];
		return out;
	}
	////////////////////////////////////////////////////////////////////////////
	public int minNumIndx(int[] nums) {
		for(int i = 0, minNum = minNum(nums); i < nums.length; ++i)
			if(nums[i] == minNum) return i;
		return 0;
	}
	////////////////////////////////////////////////////////////////////////////
	public int prodOfEven(int... nums) {
		int out = 1;
		for(int i = 0; i < nums.length; ++i)
			if(nums[i] % 2 == 0) out *= nums[i];
		return out == 1 ? 0 : out;
	}
	////////////////////////////////////////////////////////////////////////////
}
