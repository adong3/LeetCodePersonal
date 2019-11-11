import java.util.*;
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        if (p == null && q != null || p != null && q == null) return false;
        if (p == null && q == null ) return true;
        queue1.add(p);
        queue2.add(q);
        while (!queue1.isEmpty()) {
			int size = queue1.size();
			for (int i = 0; i < size; i++) {
				TreeNode node1 = queue1.remove();
				TreeNode node2 = queue2.remove();
				if (node1.val != node2.val) return false;
				if (node1.left == null && node2.left != null) return false;
				if (node1.left != null) {
					if (node2.left == null) return false;
					if (node1.left.val != node2.left.val) return false;
					queue1.add(node1.left);
					queue2.add(node2.left);
				}
				if (node1.right == null && node2.right != null) return false;
				if (node1.right != null) {
					if (node2.right == null) return false;
					if (node1.right.val != node2.right.val) return false;
					queue1.add(node1.right);
					queue2.add(node2.right);
				}
			}
		
		}
        return true;
    }
}
