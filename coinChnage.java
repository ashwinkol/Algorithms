
public class coinChnage {
	
	private static void coinChange(int change) {
		
		int[] coins = {2000,500,200,100,50,10,5,2,1};
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
