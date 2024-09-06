
package polymorphism;

public class Overriding_2 extends Overriding_1{
	
	public void name(String a) {
		System.out.println("name method from Overriding_2");
	}

	public static void main(String[] args) {
		//is a relationship
		Overriding_2 abc = new Overriding_2();
		abc.name("abc");
		
		//has a relationship
		Overriding_1 ab = new Overriding_1();
		ab.name("ab");

		//in  compilation time, it will take parent class behaviour and runtime it will take child class override behaviour.
		Overriding_1 xyz = new Overriding_2();
		xyz.name("xyz");
	}

}
