package Array;

public class Immediate_smaller {

	static int findSmaller(int arr[], int ele) {

		int smaller = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < ele) {

				if (arr[i] > smaller)
					smaller = arr[i];
			}
		}
		return smaller;
	}

	public static void main(String args[]) {

		int arr[] = { 4, 67, 13, 12, 15, 35, 20 };

		int ele = 20;

		int smaller = findSmaller(arr, ele);

		System.out.println("smaller element immediate to " + ele + "is " + " " + smaller);

	}
}
