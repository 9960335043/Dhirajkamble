package java_collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_interface {

	public static void main(String[] args) {
		
		HashSet<Float> value = new HashSet<Float>();
		for(float i = 100.00f; i<=120.00f; i++) {
			value.add(i);
		}System.out.println(value);
		
		value.add(135.00f);
		System.out.println("----------------------------");
		value.add(135.00f);
		value.add(120.00f);
		System.out.println(value);
		System.out.println(value.add(null));
		System.out.println(value);
		System.out.println(value.add(null));
		System.out.println(value);
		System.out.println(value.size());
		System.out.println("------------------------------------");
		
		Iterator<Float> j = value.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}




	}

}
