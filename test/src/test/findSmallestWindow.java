package test;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class findSmallestWindow {
	public static String findSmallesrWindow(String line) {
		if (line == null || line.length() <= 1) {
			return line;
		}
		int start = 0;
		int end = line.length() - 1;
		int ch_pos = 0;
		Map<Character, List<Integer>> map = new HashMap<>();
		for (int index = 0; index < line.length(); index++) {
			map.put(line.charAt(index), null);
		}
		int remaining_char = map.keySet().size();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (map.get(ch) == null) {
				List list = new LinkedList<Integer>();
				map.put(ch, list);
				remaining_char--;
			}
			map.get(ch).add(i);
			while(map.get(line.charAt(ch_pos)).size() > 1) {
				map.get(line.charAt(ch_pos)).remove(0);
				ch_pos++;
			}
			if (remaining_char == 0) {
				if (i - ch_pos < end - start) {
					start = ch_pos;
					end = i;
				}
			}
		}
		return line.substring(start, end + 1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = null;
		System.out.println("Please input a string of letters: ");
		line = sc.nextLine();
		String ans = findSmallesrWindow(line);
		System.out.println(ans);
	}
}
