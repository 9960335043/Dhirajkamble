package multilevel;

public class Sub_2 extends Super {
	public void instance_2() {
		System.out.println("instance_2 from sub_2");
	}

	public static void main(String[] args) {
		Sub_2 s2 = new Sub_2();
		s2.instance_2();
		s2.super_class();

	}

}
