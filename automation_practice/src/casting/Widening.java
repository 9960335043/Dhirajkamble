package casting;

public class Widening {

	public static void main(String[] args) {
		int x = 50;
		long y = x;
		System.out.println(y);
		
		short j = 120;
		long k = j;
		System.out.println(k);
		
		float a = 1000.00f;
		double b = a;
		System.out.println(a);
	}

}
