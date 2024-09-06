package array;

public class Multidimensional_without_allocating_memory {

	public static void main(String[] args) {
		
		//3*3
		
		int [][] data = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int x=0; x<3; x++ ) {
			for(int y= 0; y<3; y++) {
				System.out.print(data[x][y]+ " ");
			}
			System.out.println();
		}

	}

}
