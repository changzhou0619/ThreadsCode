package leetcode_easy_array;

import java.util.Scanner;
//On each day, you may decide to buy and/or sell the stock. 
//You can only hold at most one share of the stock at any time. 
//However, you can buy it then immediately sell it on the same day.
public class buy_sell_stock {
	public static int maxProfits(int[] prices) {
		int k = 0;
		for (int i = 0; i < prices.length-1; i++) {
			if (prices[i+1]>=prices[i]) {
					k += prices[i+1]-prices[i];
			}
		}
		return k;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num array: ");
		String array = sc.nextLine();
		int[] prices = new int[array.length()];
		for (int i = 0; i < prices.length; i++) {
			prices[i] = Integer.parseInt(array.substring(i, i+1));
		}
		int k = maxProfits(prices);
		System.out.println(k);
	}
}
