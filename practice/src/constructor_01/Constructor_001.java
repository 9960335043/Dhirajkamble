package constructor_01;

public class Constructor_001 {
	
	public Constructor_001() {
		System.out.println("it is a user define constructor");
	}
	
	public void instance() {
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		Constructor_001 c1 = new Constructor_001();
		c1.instance();

	}

}
