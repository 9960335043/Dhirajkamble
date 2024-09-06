package decision_making;

public class Nested_if {
	
     public static void main(String[] args) {
    	 int z=1000;
    	 
    	 if(z==1000) {
    		 System.out.println("z equal to 1000");
    		 if(z>200) {
    			 System.out.println("z is greater than 200");
    			 if(z>300) {
    				 System.out.println("z is greater than 300");
    				 if(z==500) {
    					 System.out.println("z equal to 500");
    					 if(z<2000) {
    						 System.out.println("z less than 2000");
    					 }
    				 }
    			 }
    		 }
    		 
    	 }else {
    		 System.out.println("none");
    	 }
	
}
}
