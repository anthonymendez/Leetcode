import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Problem530 {
	public int getMinimumDifference(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		s.push(root);
		while(!s.isEmpty()){
			TreeNode current = s.pop();
			values.add(current.val);
			if(current.left != null)
				s.push(current.left);
			if(current.right != null)
				s.push(current.right);
		}
		int diff = Integer.MAX_VALUE;
		for(int i = 0; i < values.size(); i++){
			for(int j = i+1; j < values.size(); j++){
				int thisDif = Math.abs(values.get(i)-values.get(j));
				if(thisDif < diff)
					diff = thisDif;
			}
		}
		return diff;
	}
}
