import java.util.ArrayList;
import java.util.Collections;

public class Problem485 {
	public int findMaxConsecutiveOnes(int[] nums) {
		ArrayList<Integer> countings = new ArrayList<Integer>();
		int thisCount = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 1){
				thisCount++;
			}else{
				countings.add(thisCount);
				thisCount = 0;
			}
		}
		if(thisCount > 0)
			countings.add(thisCount);
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < countings.size(); i++){
			if(countings.get(i) > max)
				max = countings.get(i);
		}
		return max;
	}
}
