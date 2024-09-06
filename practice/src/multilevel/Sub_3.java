package multilevel;

public class Sub_3 extends Super {
	public void instance_3() {
		System.out.println("instance_3 from sub_3");
	}

	public static void main(String[] args) {
		Sub_3 s3 = new Sub_3();
		s3.instance_3();
		s3.super_class();

	}

}
