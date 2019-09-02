public class FindTriplet {

	public static void main(String[] args) {
		int arr[] = { 11, 45, 11, 7, 10, 9 };
		int sum = 25;
		if (!findTriple(arr, sum)) {
			System.out.println("There is none.");
		}

	}

	private static boolean findTriple(int arr[], int sum) {
		int size = arr.length;

		for (int i = 0; i < size - 2; i++) {

			for (int j = i + 1; j < size - 1; j++) {

				for (int k = j + 1; k < size; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						System.out.print("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
						return true;
					}
				}
			}
		}
		return false;
	}
}
