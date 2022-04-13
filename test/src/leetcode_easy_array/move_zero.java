package leetcode_easy_array;
//Move all the zero to the right, keep the order of non-zero element
public class move_zero {
	public void moveZeros(int[] nums) {
		int mid_num = 0;
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-1-i; j++) {
				if (nums[j] == 0) {
					mid_num = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = mid_num;
				}
			}
		}
	}
}
