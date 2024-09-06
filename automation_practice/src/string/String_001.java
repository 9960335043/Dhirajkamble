package string;

public class String_001 {

	public static void main(String[] args) {
		
		String x = "Automation";
	
		// to print string value in forward direction
		for(int i = 0; i<x.length(); i++) {
			System.out.print(x.charAt(i)+ " ");

		}
		System.out.println("---------------------------");
		
		// to print string value in backward direction
		System.out.println(x.length());
		
		for(int j =(x.length()-1); j>=0; j--) {
			System.out.print(x.charAt(j)+ " ");
		}

	}

}
