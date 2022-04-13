package leetcode_easy_array;
//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
public class rotate_image {
	public void rotate(int[][] matrix) {
		int mid_num = 0;
		for (int i = 0; i < matrix.length-1; i++) {
			for (int j = i; j < matrix.length-i-1; j++) {
				mid_num = matrix[i][j];
				matrix[i][j] = matrix[matrix.length-j-1][i];
				matrix[matrix.length-j-1][i]= matrix[matrix.length-i-1][matrix.length-j-1];
				matrix[matrix.length-i-1][matrix.length-j-1] = matrix[j][matrix.length-i-1];
				matrix[j][matrix.length-i-1] = mid_num;
			}
		}
	}
}
