package abstraction;

public class Execute extends EFG{
	
	
    //annotation
	@Override
	public void login() {
		System.out.println("username : abcdefg");
		System.out.println("password : abc@123");
		
		String user = "xyz";
		System.out.println(user);
		String pass = "xyz@123";
		System.out.println(pass);
		
		
	}

	@Override
	public void search() {
		System.out.println("amazon search functionality");
		
	}
	
	public static void main(String[] args) {
		Execute exe = new Execute();
		exe.login();
		exe.search();
		exe.verify();
	}

	@Override
	public void verify() {
		System.out.println("verify method");
		
	}

}
