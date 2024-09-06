package this_keyword;

public class Class_02 extends Class_01 {
	
	int w = 100;
	
	public static void function() {
		System.out.println("function method from class_02");
	}
	
	public void verify() {
		System.out.println("verify method from class_02");
		this.login();
		System.out.println(this.w);
		this.function();
	}

	public Class_02() {
		this("abc");
		System.out.println("user define constructor from class_02");
	}
	
	public Class_02(String h) {
		System.out.println("parameterized constructor from class_02");
	}
	
	public static void main(String[] args) {
		Class_02 c2 = new Class_02();
		c2.verify();
		

	}

}
