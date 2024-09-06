package array;

public class Single_dimensional {

	public static void main(String[] args) {
		
		int [] abc = new int [4];
		
		abc[0] =20;
		abc[1] =78;
		abc[2] =89;
		abc[3] =67;
		
		
		
		//for loop
		for(int q = 0; q<4; q++) {
			System.out.println(abc[q]);
		}

		System.out.println("---------------------------");
		//for each loop/for enhanced loop
		//here we neither initialize the variable nor we specify
		//the conditions and increment/decrement
		
		for(int s : abc) {
			System.out.println(s);
		}
		System.out.println("-----------------------------");
		System.out.println(abc.length);
		
		System.out.println("---------------------------");
		System.out.println(abc[2]);
		
		System.out.println("-----------------------");
		//System.out.println(abc[4]);
	}

}
