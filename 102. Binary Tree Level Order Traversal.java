
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {

        	return list;
		}
        queue.add(root);
        
        while (!queue.isEmpty()) {
        	List<Integer> leveList = new LinkedList<>();
        	int size = queue.size();
        	for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				leveList.add(node.val);
			}
        	list.add(leveList);
        	
		}
        return list;
    }
}
