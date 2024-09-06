package constructor_01;

public class Constructor_004 {
	
	public Constructor_004(int z, int g) {
		System.out.println("parameter type - short");
			
	}
     
	public Constructor_004(int y) {
		this(3,4);
		System.out.println("parameter type - short1");
	}
	
	
	public static void main(String[] args) {
		Constructor_004 cv = new Constructor_004(2);
		

	}

}
