package trees;

public class LowestAncestor {

	public static class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {

			this.val = val;
			this.left = null;
			this.right = null;
		}

	}

	public TreeNode findLowestAncestor(TreeNode root, int p, int q) {

		if (root == null) {
			return root;
		}

		if (root.val > Math.max(p, q)) {

			return findLowestAncestor(root.left, p, q);
		} else if (root.val < Math.min(p, q)) {
			return findLowestAncestor(root.right, p, q);
		}
		return root;

	}

	
	public static void main(String[] args) {

		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.right.left = new TreeNode(3);
		root.left.right.right = new TreeNode(5);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);

		LowestAncestor l = new LowestAncestor();
		TreeNode ans = l.findLowestAncestor(root, 0, 5);
		System.out.println(ans.val);
		

	}

}
