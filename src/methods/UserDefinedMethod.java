package methods;

public class UserDefinedMethod {
	public static void mindq() {
		System.out.println("MindQ is a training institute");
	}
	public static void primeNumber(int a) {
		int count=0, i;
		for (i=1; i<=a; i++) {
			if (a%i == 0) {
				count=count + 1;
			}
		}
		if (count == 2) {
			System.out.println(a + " is a prime number");
		}
		else
		{
			System.out.println(a + " is not a prime number");
		}
	}
	public static void main(String args[]) {
		mindq();
		primeNumber(7);
		
	}
	
}
