
public class Problem167 {
	public int[] twoSum(int[] numbers, int target) {
		for(int i = numbers.length-1; i >= 0; i--){
			for(int j = i-1; j >= 0; j--){
				if(numbers[i]+numbers[j] == target)
					return new int[]{i+1,j+1};
			}
		}
		return new int[]{-1,-1};
	}
}
