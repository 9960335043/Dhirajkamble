package java_collection;

import java.util.ArrayList;

public class Collection_001 {

	public static void main(String[] args) {
		
		ArrayList<Integer> sr_no = new ArrayList<Integer>();
		
		sr_no.add(0, null);
		sr_no.add(1, 50);
		sr_no.add(1);
		sr_no.add(2);
		sr_no.add(null);
		sr_no.add(3);
		sr_no.add(4);
		sr_no.add(5);
		sr_no.add(6);
		sr_no.add(2);
		sr_no.add(null);
		
		System.out.println(sr_no.indexOf(1));
        System.out.println(sr_no.get(2));
		System.out.println(sr_no);
		System.out.println(sr_no.get(0));
		System.out.println(sr_no.get(2));
		System.out.println(sr_no.isEmpty());
		
		sr_no.remove(2);
		System.out.println("new collection : " + sr_no);
		
		System.out.println("first : " + sr_no.getFirst());
		System.out.println("last : " + sr_no.getLast());
		
		System.out.println(sr_no.contains(4));
		System.out.println(sr_no.contains(3));
		
		sr_no.removeFirst();
		sr_no.removeLast();
		System.out.println("collection : " + sr_no);
		
		System.out.println("clone of sr_no : "+ sr_no.clone());
		
		sr_no.add(0, 100);
		System.out.println(sr_no);
	}

}
