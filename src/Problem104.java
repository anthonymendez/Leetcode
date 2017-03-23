import java.util.Stack;

// YAY DFS, something I know!... sort of?
public class Problem104 {
	public int maxDepth(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		int max = 0;
		if(root != null){
			root.val = 1;
			s.push(root);
		}
		while(!s.isEmpty()){
			TreeNode current = s.pop();
			if(current.val > max)
				max = current.val;
			if(current.left != null){
				current.left.val = current.val+1;
				s.push(current.left);
			}
			if(current.right != null){
				current.right.val = current.val+1;
				s.push(current.right);
			}
		}
		return max;
	}
}
class TreeNode {
	 int val;
	 TreeNode left, right;
	 TreeNode(int x){
		 val = x;
	 }
}