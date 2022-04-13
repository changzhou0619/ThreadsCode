package leetcode_easy_array;

import java.util.Arrays;

public class valid_sudoku {
	
	public static boolean isValidSudoku(char[][] board) {
//		System.out.println(row+"i="+i+"j="+j);
		char[] chs = new char[9];
//		ROW
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				chs[j] = board[i][j];
			}
			Arrays.sort(chs);
			for (int j = 0; j < 8; j++) {
				if (chs[j] != '.' && chs[j] == chs[j+1]) {
					System.out.println("row i="+i+"j="+j);
					return false;
				}
			}
		}
//		COLUMN
		for (int i = 0; i < 9; i++) {
		    for (int j = 0; j < 9; j++) {
		    	chs[j] = board[j][i];
		    }
		    Arrays.sort(chs);
		    //System.out.println(a);
			for (int j = 0; j < 8; j++) {
				if(chs[j] != '.' && chs[j] == chs[j+1]) {
					
					
					return false;
				}
			}
		}
//		9*9
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				chs[3*i+j] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j < 6; j++) {
				chs[3*i+j-3] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 6; j < 9; j++) {
				chs[3*i+j-6] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		////////////////////////////////////////////////////////////////////
		for (int i = 3; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				chs[3*(i-3)+j] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		
		
		for (int i = 3; i < 6; i++) {
			for (int j = 3; j < 6; j++) {
				chs[3*(i-3)+j-3] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		
		
		for (int i = 3; i < 6; i++) {
			for (int j = 6; j < 9; j++) {
				chs[3*(i-3)+j-6] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		///////////////////////////////////////////////////////
		for (int i = 6; i < 9; i++) {
			for (int j = 0; j < 3; j++) {
				chs[3*(i-6)+j] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		
		
		for (int i = 6; i < 9; i++) {
			for (int j = 3; j < 6; j++) {
				chs[3*(i-6)+j-3] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		
		
		for (int i = 6; i < 9; i++) {
			for (int j = 6; j < 9; j++) {
				chs[3*(i-6)+j-6] = board[i][j];
			}
		}
		Arrays.sort(chs);
		for (int j = 0; j < 8; j++) {
			if (chs[j] != '.' && chs[j] == chs[j+1]) {
				return false;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		char[][] boards = new char[][] { {'5','3','.','.','7','.','.','.','.'},
										{'6','.','.','1','9','5','.','.','.'},
										{'.','9','8','.','.','.','.','6','.'},
										{'8','.','.','.','6','.','.','.','3'},
										{'4','.','.','8','.','3','.','.','1'},
										{'7','.','.','.','2','.','.','.','6'},
										{'.','6','.','.','.','.','2','8','.'},
										{'.','.','.','4','1','9','.','.','5'},
										{'.','.','.','.','8','.','.','7','9'}};
		System.out.println(isValidSudoku(boards));
	}
//	[['5','3','.'|,'.','7','.'|,'.','.','.'],
//	 ['6','.','.'|,'1','9','5'|,'.','.','.'],
//	 ['.','9','8'|,'.','.','.'|,'.','6','.'],
//	
//	 ['8','.','.'|,'.','6','.'|,'.','.','3'],
//	 ['4','.','.'|,'8','.','3'|,'.','.','1'],
//	 ['7','.','.'|,'.','2','.'|,'.','.','6'],
//	
//	 ['.','6','.'|,'.','.','.'|,'2','8','.'],
//	 ['.','.','.'|,'4','1','9'|,'.','.','5'],
//	 ['.','.','.'|,'.','8','.'|,'.','7','9']]
}
