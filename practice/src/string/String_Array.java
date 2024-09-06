package string;

public class String_Array {

	public static void main(String[] args) {
		
		String a = "Pratiksha has email id pthute29@gmail.com";
		
		String [] a_break = a.split(" ");
		System.out.println(a_break[0]);
		System.out.println(a_break[1]);
		System.out.println(a_break[2]);
		System.out.println(a_break[3]);
		System.out.println(a_break[4]);
		
		System.out.println("------------------------------------");
		
		String [] a_break1 = a.split("mail");
		System.out.println(a_break1[0]);
		System.out.println(a_break1[1]);
		System.out.println(a_break1[2]);
	}

}
