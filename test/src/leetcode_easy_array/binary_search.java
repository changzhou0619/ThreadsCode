package leetcode_easy_array;

public class binary_search {
	public static int[] sort(int[] nums) {
//		int[] num = new int[nums.length];
		int mid_num = 0;
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-1-i; j++) {
				if (nums[j] > nums[j+1]) {
					mid_num = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = mid_num;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		return nums;
	}
	public int bsRecursion(int[] input, int Lpos, int Rpos, int target) {

	      int middle = (Lpos + Rpos) / 2;

	      if (target < input[Lpos] || target > input[Rpos] || Lpos > Rpos) {
	         return -1;
	      }
	      
	      if (target < input[middle]) {
	         return bsRecursion(input, Lpos, middle - 1, target);
	      } else if (target > input[middle]) {
	         return bsRecursion(input, Lpos + 1, Rpos, target);
	      } else {
	         return middle;
	      }
	   }
	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		nums = sort(nums);
		for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
		}
	}
}
