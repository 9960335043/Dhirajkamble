package customized_exception;

public class Customized_Exception {

	public static void main(String[] args) throws Exception {
		
          int a = 30;
		
		if(a<25) {
			throw new Exception("a is less than 25");
		}else {
			throw new Exception("a is greater than or equal to 25");
		}

	}

}
