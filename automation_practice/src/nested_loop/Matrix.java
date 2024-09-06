package nested_loop;

public class Matrix {

	public static void main(String[] args) {
		//3*3
		// 11 12 13
		// 21 22 23
		// 31 32 33
		
		for(int a = 1; a<=3; a++) {
			for(int b =1; b<=3; b++) {
				System.out.print(a+""+b+" ");
				
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
		//5*6
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=6; y++) {
				System.out.print(x+""+y+" ");
			}
			System.out.println();
		}

	}

}
