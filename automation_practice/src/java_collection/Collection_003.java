package java_collection;

import java.util.Vector;

public class Collection_003 {

	public static void main(String[] args) {
		
		Vector<Integer> s = new Vector<Integer>();
		for(int a=1; a<=20; a++) {
			s.add(a);
		}System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.contains(5));
		System.out.println(s.indexOf(10));
		
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.lastIndexOf(15));
		System.out.println(s.remove(5));
		System.out.println(s);

		System.out.println(s.size());


	}

}
