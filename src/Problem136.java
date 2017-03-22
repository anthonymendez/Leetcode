public class Problem136 {
	public int singleNumber(int[] nums) {
		boolean[] found = new boolean[nums.length];
		for(int i = 0; i < nums.length; i++){
			if(found[i])
				continue;
			for(int j = i+1; j < nums.length; j++){
				if(found[j])
					continue;
				if(nums[i] == nums[j]){
					found[i] = true;
					found[j] = true;
					break;
				}
			}
			if(!found[i])
				return nums[i];
		}
		for(int i = 0; i < nums.length; i++){
			if(!found[i])
				return nums[i];
		}
		return nums[0];
	}
}
