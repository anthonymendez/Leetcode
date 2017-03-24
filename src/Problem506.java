import java.util.Arrays;
import java.util.HashMap;

public class Problem506 {
	public String[] findRelativeRanks(int[] nums) {
		String[] answer = new String[nums.length];
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < nums.length; i++){
			hm.put(nums[i],i);
		}
		
		Arrays.sort(nums);
		
		for(int i = nums.length-1, rank = 1; i >= 0; i--, rank++){
			if(i == nums.length-1)
				answer[hm.get(nums[i])] = "Gold Medal";
			else if(i == nums.length-2)
				answer[hm.get(nums[i])] = "Silver Medal";
			else if(i == nums.length-3)
				answer[hm.get(nums[i])] = "Bronze Medal";
			else
				answer[hm.get(nums[i])] = rank+"";
		}
		
		return answer;
	}
}
