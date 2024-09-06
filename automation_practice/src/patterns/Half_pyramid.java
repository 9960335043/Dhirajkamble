package patterns;

public class Half_pyramid {

	public static void main(String[] args) {
		// row - 4, col - 4
		
		for(int a= 1; a<=4; a++) {
			for(int b = 1; b<=a; b++) {
				System.out.print("*  ");
			}
			System.out.println();
	    }

		System.out.println("-------------------------------");
		
		for(int a1= 1; a1<=4; a1++) {
			for(int b1 = 1; b1<=a1; b1++) {
				System.out.print(a1+""+b1+"  ");
			}
			System.out.println();
	    }
		
		System.out.println("----------------------");
		
		for(int a2= 1; a2<=4; a2++) {
			for(int b2 = 1; b2<=a2; b2++) {
				System.out.print(b2+" ");
			}
			System.out.println();
	    }
	}
	
}
