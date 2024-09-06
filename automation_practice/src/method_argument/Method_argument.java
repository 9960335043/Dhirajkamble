package method_argument;

public class Method_argument {
	
	int d;
    String k;
    
   static float e;
    
	public void placement(int x, String j ) {
       d=x;
       k=j;
       System.out.println(d);
       System.out.println(k);
	}		
	
	public static void number(float y) {
		e=y;
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		
		Method_argument m1 = new Method_argument();
		
		m1.placement(77, "Pratik Lohkare");
		
		System.out.println(m1.d);
		
       // number(99.99f);
		
		Method_argument.number(101.10f);
	}

}
