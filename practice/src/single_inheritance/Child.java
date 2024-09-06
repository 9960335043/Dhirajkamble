package single_inheritance;

public class Child extends Parent {

	int a = 78;
	
	public static void main(String[] args) {
		Child cv = new Child();
		System.out.println(cv.a);
		System.out.println(cv.g);

	}

}
