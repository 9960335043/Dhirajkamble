package method;


public class Intance_method {
	
	public void bank() {
		
		String name = "BOI";
		System.out.println(name);
		
		int account = 123456;
		System.out.println(account);
		
	}

	public void application() {
		System.out.println("finnone");
	
	}
	
	public static void main(String[] args) {
		
		Intance_method Im = new Intance_method();
		Im.bank();
		Im.application();

	}

}
