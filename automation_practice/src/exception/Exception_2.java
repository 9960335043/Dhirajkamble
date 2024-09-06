package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_2 {
	
	public static void file() throws Throwable {
		FileInputStream fis = new FileInputStream("");
	}
	
	public static void file1() {
		
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("file1 executed successfully");
		}
	}
	

	public static void main(String[] args) throws Exception {
		
		file1();
		
		
		int a = 30;
		if(a<25) {
			throw new Exception("a is less than 25");
		}else {
			throw new Exception("a is greater than or equal to 25");
		}

	}

}
