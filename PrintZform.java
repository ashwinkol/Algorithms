package logical;

//print Z Form 
// 1 2 3
// 4 5 6
// 7 8 9

// Output : 1 2 3 5 7 8 9

public class PrintZform {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					System.out.print(" "+matrix[i][i]);
					break;
				}
				else {
				System.out.print(" "+matrix[i][j]);
				}
			}

			
		}

	}

}
