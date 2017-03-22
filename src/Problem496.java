
public class Problem496 {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] answer = new int[findNums.length];
		for(int i = 0; i < findNums.length; i++){
			int currNum = findNums[i];
			int NumInNums = -1;
			int greater = -1;
			for(int j = 0; j < nums.length; j++){
				if(nums[j] == currNum){
					NumInNums = j;
					break;
				}
			}
			for(int j = NumInNums; j < nums.length; j++){
				if(nums[j] > currNum){
					greater = nums[j];
					break;
				}
			}
			answer[i] = greater;
		}
		return answer;
	}
}
