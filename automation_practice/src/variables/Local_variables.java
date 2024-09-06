package variables;

import java.net.http.HttpClient.Version;

public class Local_variables {

	public void testing() {
		int a = 99;
		System.out.println(a);
		
	}
	public void automation() {
		String b = "API";
		System.out.println(b);
		
		
	}
	public static void manual() {
		String abc = "SQL";
		System.out.println(abc);
		
		
	}
	public static void main(String[] args) {
		manual();
		
		Local_variables v = new Local_variables();
		v.automation();
		v.testing();
	}

}
