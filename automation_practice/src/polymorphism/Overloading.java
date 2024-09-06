package polymorphism;

public class Overloading {
	
	public void stp() {
		System.out.println("stp method with no arg");
		
	}

    public void stp(int count) {
    	System.out.println("stp method with int arg");
		
	}

    public void stp(String students) {
    	System.out.println("stp method with string arg");
	
    }
    
    public void stp(int srno, float percentage) {
    	System.out.println("stp method with int & float arg");
	
    }


	public static void main(String[] args) {
		Overloading abc = new Overloading();
		abc.stp();
		abc.stp(0);;
		abc.stp("xyz");
		abc.stp(1, 45.78f);
		
		

	}

}
