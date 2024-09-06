package array;

public class Single_without_allocating_memory {

	public static void main(String[] args) {
		
		int[] abc = {3, 5, 6, 9, 23, 45, 67,98};
		
		System.out.println(abc.length);
		
		System.out.println("-------------------------------");
		
		System.out.println(abc[7]);
		
		System.out.println("-------------------------------");
		
		for(int u : abc) {
			System.out.println(u);
		}
			
			System.out.println("---------------------------");
		

		for(int i = 0; i<abc.length; i++) {
			System.out.println(abc[i]);
		}
			System.out.println("-----------------------------");
			
			// or
			for(int a = 0; a<=8; a++) {
				//System.out.println(abc[a]);
			}
		}
	}

