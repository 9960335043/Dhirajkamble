package continue1;

public class Do_while_loop {

	public static void main(String[] args) {
		int c= 51;
        do {
       	 System.out.println(c);
       	 if(c==53) {
       		 continue;
       	 }
       	 c++;
       	 
        } while(c<=60);
	}

}
