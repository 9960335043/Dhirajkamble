package patterns;

public class Zero_one_triangle {

	public static void main(String[] args) {
		
		//row = 5, collumn = 5
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				int add=a+b;
				if(add%2==0) {
					System.out.print("1 ");
					
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
