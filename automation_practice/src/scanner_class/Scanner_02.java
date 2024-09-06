package scanner_class;

import java.util.Scanner;

public class Scanner_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter firstname");
		String fn = sc.nextLine();
		
        System.out.println("enter lastname");
		String In = sc.nextLine();
		
		String name =fn.concat(In);
		
		System.out.println("your name is : " + name);
	}

}
