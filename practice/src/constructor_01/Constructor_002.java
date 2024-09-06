package constructor_01;

public class Constructor_002 {
	
	public Constructor_002(String a) {
		System.out.println("it is a parameterized constructor");
	}
	
	public Constructor_002() {
		System.out.println("it is user define constructor");
		
	}
	
	public Constructor_002(int b) {
		System.out.println("parameterized 2");
		
	}
	
	public static void main(String[] args) {
		Constructor_002 c2 = new Constructor_002("abc");
		Constructor_002 c = new Constructor_002();
		Constructor_002 c1 = new Constructor_002(2);
	}

}
