package conditions;

public class IfStatement2 {

	public static void main(String[] args) {
		int a=3;
		String msg;
		if (a==1) {
			msg = "sunday";
		}
		else if (a==2) {
			msg = "Mon";
		}
		else if (a==3) {
			msg = "Tue";
		}
		else if (a==4) {
			msg = "Wed";
		}
		else if (a==5) {
			msg = "Thu";
		}
		else if (a==6) {
			msg = "Fri";
		}
		else if (a==7) {
			msg = "Sat";
		}
		else {
			msg = "invalid day number";
		}
		System.out.println(msg);

	}

}
