package conditions;

public class SwitchStatement {

	public static void main(String[] args) {
		int d;
		d=1;
		String msg;
		switch(d) {
		case 1:
			msg = "Sunday";
			break;
		case 2:
			msg = "Monday";
			break;
		case 3:
			msg = "Tue";
			break;
		case 4:
			msg = "Wed";
			break;
		case 5:
			msg = "thr";
			break;
		case 6:
			msg = "fri";
			break;
		case 7:
			msg = "sat";
			break;
		default:
			msg = "invalid day number";
		}
		System.out.println(msg);
	}

}
