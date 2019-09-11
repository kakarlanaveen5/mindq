package arrays;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		int i,arr[] = {-4,23,12432,4444,576};
		for (i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		//For Each Loop example
		for (int a:arr) {
			System.out.println(a);
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
