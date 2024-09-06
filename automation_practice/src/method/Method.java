package method;

public class Method {
	
	public static void login() {
	
	System.out.println("login method");
	
	String username = "STP Infotech";
	System.out.println(username);
	
	String password = "stp@1234";
	System.out.println(password);

	
	}
	
	

	public static void main(String[] args) {
		login();
		
		System.out.println("---------------------------");
		
		Method.login();

	}

}
