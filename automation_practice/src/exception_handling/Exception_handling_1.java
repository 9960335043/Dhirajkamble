package exception_handling;

public class Exception_handling_1 {

	

	
		public static void main(String[] args) {
			
			int [] abc = new int [4];
			
			abc[0] =20;
			abc[1] =78;
			abc[2] =89;
			abc[3] =67;
			
			
			for(int s : abc ) {
				System.out.println(s);
			}
			System.out.println(abc[2]);
			
			try {
				Thread.sleep(2000);
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
				System.out.println("finally block");
			}
			 
		}
}
