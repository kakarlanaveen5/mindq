package conditions;

public class ShortIF {
	public static void main(String args[]) {
		//Write program for even or odd number by using Ternary Operator
		// Ternary Operator <condition>?<True>:<False>
		int a=21;
		String msg;
		msg = (a%2 == 0)?"even number":"odd number";
		System.out.println(msg);
	}
}
