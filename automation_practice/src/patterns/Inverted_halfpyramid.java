package patterns;

public class Inverted_halfpyramid {

	public static void main(String[] args) {
		
        for(int x = 4; x>=1; x--) {
        	for(int y = 1; y<=x; y++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
        System.out.println("---------------------------------");
        
        for(int x1 = 4; x1>=1; x1--) {
        	for(int y1 = 1; y1<=x1; y1++) {
        		System.out.print(y1+" ");
        	}
        	System.out.println();
        }
        System.out.println("----------------------------------");
        
        for(int x2 = 4; x2>=1; x2--) {
        	for(int y2 = 1; y2<=x2; y2++) {
        		System.out.print(x2+""+y2+" ");
        	}
        	System.out.println();
        }
	}

}
