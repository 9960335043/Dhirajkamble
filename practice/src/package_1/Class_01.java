package package_1;

public class Class_01 {
	
	protected int a = 5;

	protected void name() {
		System.out.println("name method from class_01");
	}
	public static void main(String[] args) {
		Class_01 c1 = new Class_01();
		System.out.println(c1.a);
		c1.name();
		
		
	}

}
