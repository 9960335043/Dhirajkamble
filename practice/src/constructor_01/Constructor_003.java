package constructor_01;

public class Constructor_003 {
	
	public Constructor_003() {
		this(2);
		System.out.println("user define constructor");
	}

	public Constructor_003(int a) {
		this(4, "abc");
		System.out.println("parameterized 1");
	}
		
    public Constructor_003(int b, String f) {
    	this(4, "as", 45.76f);
			System.out.println("parameterized 2");
		}
			
	public Constructor_003(int c, String h, float g) {
		this(4, "as", 45.76f, 78.99);
			System.out.println("parameterized 3");
			}	
				
	public Constructor_003(int d, String r, float o, double k) {
		this(45,78);
			System.out.println("parameterized 4");
				}
					
	public Constructor_003(int e, int u) {
			System.out.println("parameterized 5");
					}
						
	public static void main(String[] args) {
		Constructor_003 c3 = new Constructor_003();

	}

}
