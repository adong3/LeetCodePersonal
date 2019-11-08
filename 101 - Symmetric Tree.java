import java.util.ArrayList;

class Solution {
    public boolean isSymmetric(TreeNode root) {


    	ArrayList<TreeNode> leftList = new ArrayList<TreeNode>();
    	ArrayList<TreeNode> rightList = new ArrayList<TreeNode>();
    	preOrderLeft(root, leftList,root);
    	preOrderRight(root, rightList,root);
    	if (leftList.size() != rightList.size()) {
			return false;
		}
    	for (int i = 0; i < leftList.size(); i++) {
    		if (leftList.get(i) == null && rightList.get(i) != null) {
				return false;
			}
    		if (leftList.get(i) != null && rightList.get(i) == null) {
				return false;
			}
			if (leftList.get(i) != null && rightList.get(i) != null && leftList.get(i).val != rightList.get(i).val) {
				return false;
			}
		}
    	
        return true;
    }
    
    public void preOrderLeft(TreeNode node, ArrayList<TreeNode> list,TreeNode root) {

    	if (node == null) {
    		list.add(null);
			return;
		}
		if (node!=null) {
			list.add(node);
		}
		preOrderLeft(node.left, list,root);
		preOrderLeft(node.right, list,root);
	}
    
    public void preOrderRight(TreeNode node, ArrayList<TreeNode> list,TreeNode root) {

    	if (node == null) {
    		list.add(null);
			return;
		}
		if (node!=null) {
			list.add(node);
		}
		preOrderRight(node.right, list,root);
		preOrderRight(node.left, list,root);
	}
    
}
