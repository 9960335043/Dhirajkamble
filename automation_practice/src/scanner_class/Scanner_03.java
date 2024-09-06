package scanner_class;

import java.util.Scanner;

public class Scanner_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to get the table");
		
		int x = sc.nextInt();
		
		System.out.println("your table is as follows : - ");
		for(int a = 1; a<=10; a++) {
		
			System.out.println(x*a);
			//System.out.println(x + "*" + a + "=" + x*a);
		}

	}

}
