package patterns;

public class Rotate_by_180 {

	public static void main(String[] args) {
		
		//row = 4, collumn = 4
		
		for(int u = 1; u<=4; u++) {
			
			for(int v=1; v<=4-u ; v++) {
				System.out.print("  ");
			}
			
			for(int w=1; w<=u; w++) {
				System.out.print("* ");
			}
			 System.out.println();
		}
       
	}

}
