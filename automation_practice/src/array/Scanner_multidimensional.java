package array;

import java.util.Scanner;

public class Scanner_multidimensional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter row size");
		int row = sc.nextInt();
		
		System.out.println("enter col size");
		int col = sc.nextInt();
		
		int[][] abc = new int [row][col];
		
		System.out.println("insert values");
		for(int u = 0; u<row; u++) {
			for(int v = 0; v<col; v++) {
			abc[u][v] = sc.nextInt();
				
	}
		}
 
		System.out.println("multidimensional array is as follows : ");
		for(int u1 =0; u1<row; u1++) {
			for(int v1 = 0; v1<col; v1++) {
				System.out.print(abc[u1][v1]+" ");
	}
		
			System.out.println();
}}
}