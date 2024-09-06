package java_collection;

import java.util.LinkedList;

public class Collection_002 {

	public static void main(String[] args) {
		
		LinkedList<String> student = new LinkedList<String> ();
		student.add("Razia");
		student.add("Krutika");
		student.add("Akshanda");
		student.add("Piyush");
		student.add("Priya");
		student.add("Meera");
		
        System.out.println(student);
        
        System.out.println(student.contains("Pratiksha"));
       
        System.out.println(student.clone());
        
        System.out.println(student.get(0));
        
        System.out.println(student.get(4));
        
        System.out.println(student.size());
        
        System.out.println(student.getFirst());
        
        System.out.println(student.getLast());
        
        System.out.println(student.indexOf("Piyush"));
        
        System.out.println(student.isEmpty());
        
        System.out.println(student.poll());
        System.out.println(student);


        System.out.println(student.pollFirst());
        
        System.out.println(student);
        
        System.out.println(student.pollLast());
        
        System.out.println(student);
        
        System.out.println(student.offer("dhiraj"));
        
        System.out.println(student);
        
        System.out.println(student.offerFirst("suraj"));
        
        System.out.println(student);
        
        System.out.println(student.offerLast("piyush"));
        
        System.out.println(student);
        
        student.add(2,"piyush");
        
        System.out.println(student);
        
        System.out.println(student.clone());
        
        student.clear();
        System.out.println(student);















	}

}
