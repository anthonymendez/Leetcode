
public class Problem283 {
	public void moveZeroes(int[] nums) {
		for(int i = 0, j = i+1; i < nums.length && j < nums.length ;){
			if(nums[i] != 0){
				i++;
				j = i+1;
			}
			else if(nums[i] == 0 && nums[j] != 0){
				nums[i] = nums[j];
				nums[j] = 0;
				i++;
				j = i+1;
			}else if(nums[i] == 0 && nums[j] == 0){
				j++;
			}
		}
	}
}
