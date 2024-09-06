package scanner_class;

import java.util.Scanner;

public class Scanner_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st value");
		
		int a = sc.nextInt();
		
		System.out.println("Entre 2nd value");
		int b = sc.nextInt();
		
		System.out.println("choose the operator among +, -, *, / ");
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+' :
			System.out.println("the addition of values is : " + (a+b));
			break;
			
		case '-' :	
			System.out.println("the subtraction of values is : " + (a-b));
			break;
		
		case '*' :	
			System.out.println("the multiplication of values is : " + a*b);
			break;
			
		case '/' :	
			System.out.println("the division of values is : " + a/b);
			break;
			
			default:
				System.out.println("invalid operator");
				break;
		}
	}

}
