package variables;

public class Instance_variables {

	  String a = "Automation";
			
	  public void verify() {
		  System.out.println("from verify method " + a);
			}
			
	  public static void function() {
			Instance_variables v = new Instance_variables();
			System.out.println("from function method "+ v.a);
			}
			
	 public static void main(String[] args) {
			Instance_variables v = new Instance_variables();
			System.out.println("from main method " + v.a);
		      
				v.verify();
				function();
				
			}

		


	}


