package variables;

public class Static_variables {
	
	static String b = "manual";
	
	public void name() {
		System.out.println("from name method "+ b);
	}
	
    public static void testing() {
    	System.out.println("from testing method "+ b);
    }
    
	public static void main(String[] args) {
		
		System.out.println("from main method " +b);
		
		Static_variables.testing();
		
		Static_variables sv = new Static_variables();
		sv.name();		

}}