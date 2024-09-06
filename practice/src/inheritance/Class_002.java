package inheritance;

public class Class_002 extends Class_001 {
	
	int w= 34;
	double p =56.89;
	
	public static void static_method() {
		System.out.println("static_method from class_002");
	}

	public static void main(String[] args) {
	    Class_002 c2 = new Class_002();
	    System.out.println(c2.w);
		System.out.println(c2.p);
		static_method();
		
		System.out.println("--------------------------------------");
		

		System.out.println(c2.a);
		System.out.println(c2.b);
		c2.instance_method();
	}

}
