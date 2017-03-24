import java.util.Arrays;

public class Problem453 {
	public int minMoves(int[] nums) {
		int moves = 0;
		
		Arrays.sort(nums);
		
		for(int i : nums)
			moves += i-nums[0];
		
		return moves;
	}
}
