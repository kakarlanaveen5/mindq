package conditions;

public class IfStatement {

	public static void main(String[] args) {
		int a;
		String msg;
		a=0;
		if (a>0) {
			msg = "positive";
		}
		else if (a == 0) {
			msg = "nutral";
		}
		else
		{
			msg="negative";
		}
		System.out.println(msg);

	}

}
