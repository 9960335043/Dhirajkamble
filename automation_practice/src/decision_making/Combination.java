package decision_making;

public class Combination {

	public static void main(String[] args) {
		
		int month_no = 6;
		String month = "";
		
		switch(month_no) {
		case 1:
			month = "jan";
			System.out.println(month);
			break;
		case 2:
			month = "feb";
			System.out.println(month);
			break;
		case 3:
			month = "mar";
			System.out.println(month);
			break;
		case 4:
			month = "apr";
			System.out.println(month);
			break;
		case 5:
			month = "may";
			System.out.println(month);
			break;
		case 6:
			month = "june";
			System.out.println(month);
			break;
		case 7:
			month = "july";
			System.out.println(month);
			break;	
		case 8:
			month = "aug";
			System.out.println(month);
			break;	
			
		case 9:
			month = "sep";
			System.out.println(month);
			break;	
		case 10:
			month = "oct";
			System.out.println(month);
			break;	
		case 11:
			month = "nov";
			System.out.println(month);
			break;
		case 12:
			month = "dec";
			System.out.println(month);
			break;	
		
			default:
				System.out.println("invalid month no");
		}
       System.out.println("the month is : " + month);
	}

}
