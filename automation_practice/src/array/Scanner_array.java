package array;

import java.util.Scanner;

public class Scanner_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		
		
		
		String []  uvw = new String [size];
		
		//uvw[index] = value;
		System.out.println("insert values");
		for(int a = 0; a<size; a++) {
			uvw[a] = sc.next();
		}
        System.out.println("your values in the array are as follows :");
		for(int b= 0; b<size; b++) {
			System.out.println(uvw[b]);
		}
		System.out.println("0th index " + uvw[0]);
		
		System.out.println("1st index " +uvw[1]);
	}

}
