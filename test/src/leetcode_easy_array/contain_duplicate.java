package leetcode_easy_array;

import java.util.Arrays;
//Given an integer array nums, return true if any value appears at least twice in the array, 
//		and return false if every element is distinct.
public class contain_duplicate {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
        	if (Arrays.binarySearch(nums, i+1, nums.length, nums[i]) > 0) {
				return true;
			}
		}
		return false;
    }
}
