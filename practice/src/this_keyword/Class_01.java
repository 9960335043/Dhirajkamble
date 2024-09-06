package this_keyword;

public class Class_01 {
	
	int a = 99;
	String b = "String value";
	static float g =99.99f;
	
	public static void username() {
		System.out.println("username_abcd");
	}
	
	public void login() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.g);
		this.username();
		this.password();
		System.out.println("login method from Class_01");
	}
	
	public void password() {
		System.out.println("password method from class_01");
	}
	
	public Class_01() {
		this(2);
		System.out.println("user define constructor from Class_01");
	}
	
	public Class_01(int a) {
		System.out.println("parameterized constructor from Class_01");
	}

	public static void main(String[] args) {
		Class_01 c1 = new Class_01();
        c1.login();
	}

}
