
public class coinChnage {
	
	private static void coinChange(int change) {
		
		int[] coins = {10,5,2,1};
		int i = 0;
		
		while(change > 0) {
			if(coins[i] > change) {
				i++;
			}
			else {
				System.out.print(" "+coins[i]);
				change = change - coins[i];
			}
		}
		
		
	}

	public static void main(String[] args) {
		coinChange(122);

	}

}
