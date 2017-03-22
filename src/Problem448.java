import java.util.ArrayList;
import java.util.List;

public class Problem448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> numsL = new ArrayList<Integer>();
		for(int i = 1; i <= nums.length; i++){
			list.add(i);
			numsL.add(nums[i-1]);
		}
		list.removeAll(numsL);
		return list;
	}
}
