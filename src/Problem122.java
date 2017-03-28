
public class Problem122 {
	public int maxProfit(int[] prices) {
		int profits = 0;
		boolean ownStocks = false;
		for(int i = 0; i < prices.length; i++){
			// Cases where we own stocks
			if(ownStocks){
				if(i+1 < prices.length && prices[i] < prices[i+1]){
					// We wait to sell!
				}else if(i+1 < prices.length && prices[i] > prices[i+1]){
					// Sell now since prices are going to drop!
					ownStocks = false;
					profits += prices[i];
				}else{
					// There is no future stock! Sell now!
					ownStocks = false;
					profits += prices[i];
				}
			}
			// Cases where we don't own stocks
			else{
				if(i+1 < prices.length && prices[i] < prices[i+1]){
					// Stock prices are raising! Buy now!
					ownStocks = true;
					profits -= prices[i];
				}else{
					// We wait to buy!
				}
			}
		}
		return profits;
	}
}
