import java.util.*;
public class BnryTreeLvlOrderTrav {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
            return list;
        queue.add(root);
        int n = 1;
        while(!queue.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            int j=0;
            for(int i=0;i<n;i++)
            {
                temp.add(queue.peek().val);
                TreeNode node = queue.peek();
                if(node.left!=null)
                {
                    queue.add(node.left);
                    j++;
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                    j++;
                }
                queue.poll();
            }
            n = j;
            list.add(temp);
        }
        return list;
    }

}
