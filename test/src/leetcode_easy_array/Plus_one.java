package leetcode_easy_array;
//You are given a large integer represented as an integer array digits, 
//where each digits[i] is the ith digit of the integer. 
//The digits are ordered from most significant to least significant in left-to-right order. 
//The large integer does not contain any leading 0's.
public class Plus_one {	
	public static int[] plus_one(int[] digits) {
		for (int i = digits.length-1; i >= 0 ; i--) {
			if (digits[i] + 1 == 10) {
				if (i == 0) {
					digits[i] = 0;
					int[] nums = new int[digits.length+1];
					nums[0] = 1;
					for (int j = 0; j < digits.length; j++) {
						nums[j+1] = digits[j];
					}
					return nums;
				}
				else {
					digits[i] = 0;
				}
			}
			else {
				digits[i] = digits[i] + 1;
				return digits;
			}
		}
		return digits;
	}
}
