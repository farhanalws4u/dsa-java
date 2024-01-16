package Array;

public class Immediate_greater {

	static int findGreater(int arr[], int ele) {

		int greater = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > ele) {

				if (arr[i] < greater)
					greater = arr[i];
			}
		}
		return greater;
	}

	public static void main(String args[]) {

		int arr[] = { 4, 67, 13, 12, 15, 35, 20 };

		int ele = 4;

		int greater = findGreater(arr, ele);

		System.out.println("greater element immediate to " + ele + "is " + " " + greater);

	}
}
