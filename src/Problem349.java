import java.util.ArrayList;
import java.util.Arrays;

public class Problem349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i = 0; i < nums1.length && i < nums2.length; i++){
			if(nums1[i] == nums2[i])
				results.add(nums1[i]);
		}
		int[] answer = new int[results.size()];
		for(int i = 0; i < results.size(); i++){
			answer[i] = results.get(i);
		}
		return answer;
	}
}
