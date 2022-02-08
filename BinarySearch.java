package logical;

public class BinarySearch {

	public static int binSearch(int arr[], int start, int end, int find) {
		if (end >= start) {
			int mid = (start + end) / 2;

			if (arr[mid] == find) {
				return mid;
			}

			if (find > arr[mid]) {
				return binSearch(arr, mid + 1, end, find);
			}

			else {
				return binSearch(arr, start, mid - 1, find);
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int find = 8;
		int found = binSearch(array, 0, array.length - 1, find);
		if (found != -1) {
			System.out.println("Element Found At Index: " + found);
		} else {
			System.out.println(find + " Dose Not Exist In The Array!");
		}
	}

}
