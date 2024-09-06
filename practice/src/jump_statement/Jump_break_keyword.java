package jump_statement;

public class Jump_break_keyword {

	public static void main(String[] args) {
		//for loop
		//from 1 to 50
		
		for(int a= 1; a<=50; a++) {
			System.out.println(a);
			if(a==5) {
				break;
			}
			
		}
		
		System.out.println("-----------------------------------");
		
		//while loop 30 to 10
		
		int b= 30;
		while(b>=10) {
			System.out.println(b);
			if(b==25) {
				break;
			}
			b--;
		}
         System.out.println("---------------------------------------");
         
         //do while loop 51 to 60
         
         int c= 51;
         do {
        	 System.out.println(c);
        	 if(c==53) {
        		 break;
        	 }
        	 c++;
        	 
         } while(c<=60);
	}

}
