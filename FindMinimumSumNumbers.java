package logical;

public class FindMinimumSumNumbers {
	static int aMin;
	public static void main(String[] args) {

		int[] a = {4,1,5,6};
		int[] b = {1,3,4,7};
		
		aMin = a[0];

		for (int i = 0; i < a.length; i++) {
			if(a[i] < aMin) {
				aMin = a[i];
			}
		}
		
		System.out.println(aMin);

	}

}
