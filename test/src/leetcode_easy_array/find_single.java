package leetcode_easy_array;

import java.util.Arrays;
//Given a non-empty array of integers nums, 
//every element appears twice except for one. Find that single one.
public class find_single {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
	    for (int i = 0; i < nums.length; i = i+2) {
	    	if (i == nums.length-1) 
				return nums[i];
	    	else 
	    		if (nums[i] != nums[i+1]) 
	    			return nums[i];
	    }
		return nums[nums.length];
    }
}
