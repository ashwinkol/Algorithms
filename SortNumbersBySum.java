package logical;

import java.util.Vector;

// input : 12 10 102  31 15
//output : 10 12 102  31 15
public class SortNumbersBySum {

	public static void main(String[] args) {

		int[] nums = { 12, 10, 102, 31, 15 };

		Vector<Integer> sortedSum = new Vector<>();

		// Biggest Num in Array is 102
		
		for (int i = 0; i < 103; i++) {

			for (int j = 0; j < nums.length; j++) {
				int sum = 0;

				int tmp = nums[j];
				int num = nums[j];
				do {
					sum += num % 10;
					num = num / 10;
				} while (num != 0);

				if (sum == i) {
					sortedSum.add(tmp);
				}

			}
		}
		System.out.println(sortedSum);
	}

}
