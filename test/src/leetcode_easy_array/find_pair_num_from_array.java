package leetcode_easy_array;

public class find_pair_num_from_array {
	public static void find_pair_sum(int[] nums, int k) {
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] + nums[i+1] == k) {
				System.out.println("nums["+i+"]"+"+"+"nums["+(i+1)+"] == "+ k);
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = {3,4,1,5,6,7};
		find_pair_sum(nums, 7);
	}
}
