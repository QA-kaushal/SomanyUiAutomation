package SomanyTestClass;

public class basicTest {
	public static void main(String[] args) {
		int[] arr = {12,10, 5,7, 12,3,8, 9};
		int max = arr[0];
		int secondmax = arr[1];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax =max;
				max = arr[i];
			} else if (arr[i]> secondmax && arr[i] != max) {
				secondmax = arr[i];
			}
		}
		System.out.println("Second highest value: " + secondmax);
	}
} 
