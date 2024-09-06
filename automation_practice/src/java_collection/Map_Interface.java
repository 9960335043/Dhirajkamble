package java_collection;

import java.util.HashMap;

import javax.swing.plaf.basic.BasicBorders.RolloverButtonBorder;

public class Map_Interface {

	public static void main(String[] args) {
		
		HashMap<Integer, String> stu_roll = new HashMap<Integer, String>();
		
		stu_roll.put(1, "abc");
		stu_roll.put(2, "def");
        stu_roll.put(3, "ijk");
        stu_roll.put(4, "mno");
        stu_roll.put(5, "pqr");

		System.out.println(stu_roll);
		
		stu_roll.put(4, "xyz");
		System.out.println(stu_roll);
		
		stu_roll.put(7, "abc");
		System.out.println(stu_roll);
		
		stu_roll.put(8, "null");
		System.out.println(stu_roll);
		
		stu_roll.put(8, "xcv");
		System.out.println(stu_roll);
		
		stu_roll.put(9, "null");
		System.out.println(stu_roll);
		
		
		System.out.println(stu_roll.size());
		
		stu_roll.remove(5);
		System.out.println(stu_roll);

		stu_roll.remove(9, "null");
		System.out.println(stu_roll);
		
		stu_roll.remove(1, "def");
		System.out.println(stu_roll);
		
		stu_roll.replace(1, "abcdef");
		System.out.println(stu_roll);
		
		stu_roll.replace(2, "def", "qwertyu");
		System.out.println(stu_roll);
		
		System.out.println(stu_roll.clone());
		
		System.out.println(stu_roll.containsKey(5));
		
		System.out.println(stu_roll.containsKey(8));
		
		System.out.println(stu_roll.containsValue("qwertyu"));
		
		System.out.println(stu_roll.containsValue("def"));
		
		System.out.println(stu_roll.values());
		
		System.out.println(stu_roll.keySet());
		
		stu_roll.clear();
		System.out.println(stu_roll);
		
		stu_roll.put(1, null);
		System.out.println(stu_roll);
		
		


		

	}

}
