package array;

public class Multidimensoinal {

	public static void main(String[] args) {
		
		int [][] stp = new int [3][4];
		
		//datatype * rowsize * collumnsize = memory allocated;
		
		stp[0][0] = 23;
		stp[0][1] = 45;
		stp[0][2] = 67;
		stp[0][3] = 65;
		
		stp[1][0] = 23;
		stp[1][1] = 45;
		stp[1][2] = 73;
		stp[1][3] = 56;
		
		stp[2][0] = 34;
		stp[2][1] = 23;
		stp[2][2] = 98;
		stp[2][3] = 67;
		
		
		for(int a = 0; a<3; a++) {
			for(int b = 0; b<4; b++) {
				System.out.print(stp[a][b]+ " ");
			}
			System.out.println();
		}

	}

}
