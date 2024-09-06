package encapsulation;

public class Encapsulation {
	
	private int actual_amt = 7000;
	
	private void hide_amt(int required_amt) {
		actual_amt = required_amt;
		System.out.println(actual_amt);
	}
	
	private void balance(int amt) {
		actual_amt = amt;
		System.out.println(actual_amt);
	}

	public static void main(String[] args) {
		Encapsulation encapsulate = new Encapsulation();
		encapsulate.hide_amt(4000);
		encapsulate.balance(2000);

	}

}
