package array;

public class String_multidimensional {

	public static void main(String[] args) {
		
		String [][] name = new String [2][2];
		
		name [0][0] = "ab";
		name [0][1] = "bc";
		
		name [1][0] = "cd";
		name [1][1] = "de";
		
		for(int a = 0; a<2; a++) {
			for(int b = 0; b<2; b++) {
				System.out.print(name[a][b] + " ");
			}
			System.out.println();
		}
				

	}

}
