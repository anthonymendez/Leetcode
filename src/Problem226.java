import java.util.Stack;

public class Problem226 {
	public TreeNode invertTree(TreeNode root) {
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		if(root == null)
			return root;
		nodeStack.push(root);
		while(!nodeStack.isEmpty()){
			TreeNode currentNode = nodeStack.pop();
			TreeNode hold = currentNode.left;
			currentNode.left = currentNode.right;
			currentNode.right = hold;
			if(currentNode.left != null)
				nodeStack.push(currentNode.left);
			if(currentNode.right != null)
				nodeStack.push(currentNode.right);
		}
		return root;
	}
}
//Defined in TreeNode.java
//class TreeNode{
//	int val;
//	 TreeNode left, right;
//	 TreeNode(int x){
//		 val = x;
//	}
//}
