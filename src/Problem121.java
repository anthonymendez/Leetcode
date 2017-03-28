import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Problem121 {
	public int maxProfit(int[] prices) {
		int maxProf = 0, minPrice = Integer.MAX_VALUE;
		
		for(int currPrice : prices){
			minPrice = Math.min(currPrice, minPrice);
			maxProf = Math.max(maxProf - minPrice, maxProf);
		}
		
		return maxProf;
	}
}
