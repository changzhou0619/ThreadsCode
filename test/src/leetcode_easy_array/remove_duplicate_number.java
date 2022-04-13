package leetcode_easy_array;

import java.util.Scanner;
//Given an integer array nums sorted in non-decreasing order, 
//remove the duplicates in-place such that each unique element appears only once. 
//The relative order of the elements should be kept the same.
public class remove_duplicate_number {
	public static int removeDuplicates(int[] nums) {
		int[] expectedNums = new int[nums.length];
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				expectedNums[num] = nums[i];
				num++;
			}
			else if (nums[i] > nums[i-1]) {
				expectedNums[num] = nums[i];
				num++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = expectedNums[i];
		}
		return num;
	}
//	public static int removeDuplicates(int[] nums) {
//		int num = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (i == 0) {
//				nums[num] = nums[i];
//				num++;
//			}
//			else {
//				if (nums[i] > nums[i-1]) {
//					nums[num] = nums[i];
//					num++;
//				}
//			}
//		}
//		for (int i = num; i < nums.length; i++) {
//			nums[i] = 0;
//		}
//		return num;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num array: ");
		String array = sc.nextLine();
		int[] nums = new int[array.length()];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(array.substring(i, i+1));
		}
		int k = removeDuplicates(nums);
		System.out.println(k);
	}
}
