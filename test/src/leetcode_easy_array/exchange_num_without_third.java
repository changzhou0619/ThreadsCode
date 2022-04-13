package leetcode_easy_array;

public class exchange_num_without_third {
	public static float[] swap_num(float m, float n) {
		float[] result = new float[2];
		m = m + n;
		n = m - n;
		m = m - n;
		result[0] = m;
		result[1] = n;
		return result;
	}
	public static void main(String[] args) {
		float m = 1;
		float n = 2;
		float[] result = new float[2];
		System.out.println("m: "+ m);
		System.out.println("n: "+ n);
		result = swap_num(m, n);
		System.out.println("m: "+ result[0]);
		System.out.println("n: "+ result[1]);
	}
}
