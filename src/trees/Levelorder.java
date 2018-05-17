package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Levelorder {

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

	public List<List<Integer>> levelorderTraversal(TreeNode root) {

		List<List<Integer>> output = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();

		q.add(root);
		while (!q.isEmpty()) {
			ArrayList<Integer> level = new ArrayList<Integer>();
			int qlen = q.size();
			for (int i = 0; i < qlen; i++) {

				TreeNode temp = q.poll();

				level.add(temp.val);

				if (temp.left != null) {
					q.offer(temp.left);
				}
				if (temp.right != null) {
					q.offer(temp.right);
				}

			}
			output.add(level);
		}
		return output;
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
		Levelorder l = new Levelorder();
		List<List<Integer>> ans = l.levelorderTraversal(root);

		for (List<Integer> i : ans) {
			System.out.println(i);
		}

	}

}
