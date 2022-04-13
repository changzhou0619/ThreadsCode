package test;

import java.util.Scanner;

public class uniquePath {
	public static int uniquePath(int[][] grid, int m, int n) {
		int temp[][] = new int[m][n];
		if (grid[0][0] == 1) {
			return 0;
		}
		else {
			temp[0][0] = 1;
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					temp[i][j] = 0;
					continue;
				}
				if (i == 0 & j != 0) {
					temp[i][j]=temp[i][j-1];
				}
				if (i != 0 & j == 0) {
					temp[i][j]=temp[i-1][j];
				}
				if (i != 0 & j != 0) {
					temp[i][j]=temp[i-1][j] + temp[i][j-1];
				}
//				if(i == 0 || j == 0) {
//					grid[i][j] = 1;
//				}
//				else {
//					grid[i][j] = grid[i-1][j] + grid[i][j-1];
//				}
			}
		}
		return temp[m-1][n-1];
	}
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("PLease input m: ");
		int m = sc1.nextInt();
		System.out.println("Please input n: ");
		int n = sc1.nextInt();
		int grid[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		
//change grid 0 to 1 by pos
		grid[1][1] = 0; 
		
		
		
		int number = uniquePath(grid, m, n);
		System.out.println("Numbers of unique path: "+number);
	}
}
