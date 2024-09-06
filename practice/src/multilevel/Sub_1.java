package multilevel;

public class Sub_1 extends Super {
	public void instance_1() {
		System.out.println("instance_1 from sub_1");
	}

	public static void main(String[] args) {
		Sub_1 s1 = new Sub_1();
		s1.instance_1();
		s1.super_class();
		

	}

}
