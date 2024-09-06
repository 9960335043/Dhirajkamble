package interface_01;

public class Execute implements Interface_001, Interface_002{

	public static void main(String[] args) {
		Execute exe = new Execute();
		exe.abstract_1();
		exe.jkl();
		exe.instance_1();
		System.out.println(exe.a);
		System.out.println(exe.b);
		System.out.println(exe.g);
		System.out.println(exe.o);
		System.out.println(exe.r);

	}

	@Override
	public void jkl() {
		System.out.println("jkl method");
		
	}

	@Override
	public void instance_1() {
		System.out.println("instance_1 method");
		
		
	}

	@Override
	public void abstract_1() {
		System.out.println("abstract_1 method");
		
		
	}

}
