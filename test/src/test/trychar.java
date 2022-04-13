package test;

public class trychar {
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		char mid_ch;
        for(int i = 0; i<=s.length/2-1; i++){
            mid_ch = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = mid_ch;
        }
        System.out.println(s);
        String A = "qwfa";
        System.out.println(A.length());
        System.out.println(A.charAt(mid_ch));
	}
	
}
