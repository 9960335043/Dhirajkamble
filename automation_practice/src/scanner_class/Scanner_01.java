package scanner_class;

import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st value");
		
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd value");
		
		int b = sc.nextInt();
		
		int c = a+b;
		
		System.out.println("The addition of two values is : " + c);
	}

}
