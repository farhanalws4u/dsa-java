public class Immediate_smaller {

	static int findSmaller(int arr[], int ele) {

		float smaller = Float.NEGATIVE_INFINITY;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < ele) {

				if (arr[i] > smaller)
					smaller = arr[i];
			}
		}
		return (int) smaller;
	}

	public static void main(String args[]) {

		int arr[] = { 4, 67, 13, 12, 15, 35, 20 };

		int ele = 20;

		int smaller = findSmaller(arr, ele);

		System.out.println("smaller element immediate to " + ele + "is " + " " + smaller);

	}
}
