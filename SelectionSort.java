package logical;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = {1,4,3,2,4,5,6,7,8,9};
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if(array[i] > array[j]) {
					int tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
		System.out.println("Sorted Array: "+Arrays.toString(array));
	}

}
