package jump_statement;

public class Jump_continue {

	public static void main(String[] args) {
		
		for(int x= 1; x<=20; x++) {
			
			if(x==15) {
				continue;
			}
			System.out.println(x);
			}
		
		System.out.println("--------------------------------");
		
		//while loop 30 to 10
		
		int y = 30;
		  while(y>=10) {
			  y--;
			  if (y==20) {
				  continue;	 
			  }  
			 System.out.println(y);
			  
		  
				  
			  }  
		  System.out.println("-----------------------------------");
	    //do while loop 41 to 50
		  
		  int z= 40;
		  do {
			  z++;
			  if (z==45) {
			   continue;
		}
			   System.out.println(z); 
			   
	           }while(z<=49);
	
		  }
	
			  
		  
}
	

	
			
		
	

		
		
		
	
	