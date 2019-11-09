
import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {

        	return list;
		}
        queue.add(root);
        boolean rightStart = false;
        while (!queue.isEmpty()) {
        	List<Integer> leveList = new ArrayList<Integer>();
        	int size = queue.size();
        	if (rightStart == false) {
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
        		rightStart = true;
			} else if (rightStart) {
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
				List<Integer> rightLeveList = new ArrayList<Integer>();
				for (int j = leveList.size() - 1; j >= 0; j--) {
					rightLeveList.add(leveList.get(j));
				}
				leveList = rightLeveList;
				
				rightStart = false;
			}
        	list.add(leveList);
        	
		}
        return list;
    }
}
