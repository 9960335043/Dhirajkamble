package loop;

public class While {

	public static void main(String[] args) {
		
		//print 30 to 70
		
		int w =30;
		while(w<=70 ) {
			System.out.println(w);
			w++;
		}

		System.out.println("---------------------");

		
		int w1 =70;
		while(w1>=30) {
			System.out.println(w1);
			w1--;
		}
		System.out.println("---------------------------");
		
		int d = 1;
		while(d<=20) {
			if(d%2==0) {
			System.out.println(d);
			
		}
			d++;
	}
      System.out.println("--------------------------");

		int d1 = 20;
		while(d1>=1) {
			if(d1%2==0) {
			System.out.println(d1);
			
		}
			d1--;
	}
		System.out.println("------------------------");
		
		//for odd number
		int d2 = 1;
		while(d2<=50) {
			if(d2%2!=0) {
				System.out.println(d2);
			}
			d2++;
		}
		System.out.println("------------------");
		
		//for table
		int y= 1;
		while(y<=10) {
			System.out.println("7 * " +y+ " = " + 7*y);
			y++;
		}
}
}