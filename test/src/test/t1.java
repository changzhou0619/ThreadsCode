package test;

public class t1 implements Runnable {
	@Deprecated
	public void run() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new t1());
		t.run();
		t.run();
		t.start();
	}
	
	float add(int a, float b) {
		return b;
	}
	static float add(float a, int b) {
		return a;
	}
}
