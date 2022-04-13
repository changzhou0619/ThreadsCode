package leetcode_easy_array;
//Given an array, rotate the array to the right by k steps, where k is non-negative.
public class rotate_array {
	public void rotate(int[] nums, int k) {
		int[] mid_num = new int[nums.length];
		if (nums.length == 1 || k == 0) {
			
		}
		else if (nums.length<k) {
			k = k % nums.length;
			for (int i = 0; i < mid_num.length; i++) {
				if (i<k) {
					mid_num[i] = nums[nums.length-k+i];
				}
				else {
					mid_num[i] = nums[i-k];
				}
			}
			for (int i = 0; i < mid_num.length; i++) {
				nums[i] = mid_num[i];
			}
		}
		else {
			for (int i = 0; i < mid_num.length; i++) {
				if (i<k) {
					mid_num[i] = nums[nums.length-k+i];
				}
				else {
					mid_num[i] = nums[i-k];
				}
			}
			for (int i = 0; i < mid_num.length; i++) {
				nums[i] = mid_num[i];
			}
		}
		
	}
}
