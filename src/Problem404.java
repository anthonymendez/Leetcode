import java.util.Stack;

public class Problem404 {
	public int sumOfLeftLeaves(TreeNode root){
		int count = 0;
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		if(root != null)
			s.push(root);
		
		while(!s.isEmpty()){
			TreeNode curr = s.pop();
			
			if(curr.left != null){
				s.push(curr.left);
				if(curr.left.left == null && curr.left.right == null)
					count += curr.left.val;
			}
			
			if(curr.right != null)
				s.push(curr.right);
		}
		
		return count;
	}
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
