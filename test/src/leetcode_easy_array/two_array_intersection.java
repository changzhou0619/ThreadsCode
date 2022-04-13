package leetcode_easy_array;


public class two_array_intersection {
	
	public int[] intersect(int[] num1, int[] num2) {
		int start_pos = 0;
		int end_pos = 0;
		int len = 0;
		if (num1.length>=num2.length) {
			SHORTER: for (int i = 0; i < num2.length;) {
				for (int j = 0; j < num1.length;) {   
					if (num2[i]==num1[j]) {
						
						i++;
					}
				}
			}
		} 
		else {
			int[] num3 = new int[num1.length];
		}
		return num1;
	}
}
