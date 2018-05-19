package Sort;

public class Quicksort {

	public int partition(int[] arr, int low, int high) {

		int i = low - 1;
		int pivot = arr[high];

		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {

				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	public void sort(int[] arr, int low, int high) {

		if (low < high) {

			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);

		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };

		int n = arr.length;
		Quicksort ob = new Quicksort();
		ob.sort(arr, 0, n - 1);

		printArray(arr);
	}
}
