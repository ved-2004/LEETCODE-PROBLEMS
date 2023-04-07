import java.util.*;
public class LowestCommAncestUsingHuffman {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> getPath(TreeNode root, TreeNode n)
    {
        TreeNode cur = root;
        List<Integer> list = new ArrayList<>();
        while(cur!=n)
        {
            if(cur.val > n.val)
            {
                list.add(0);
                cur = cur.left;
            }
            else
            {
                list.add(1);
                cur = cur.right;
            }
        }
        return list;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> pList = getPath(root,p);
        List<Integer> qList = getPath(root,q);
        if(root==null)
            return null;
        TreeNode cur = root;
        for(int i=0;i<Math.min(pList.size(),qList.size());i++)
        {
            if(pList.get(i) == qList.get(i))
            {
                cur = pList.get(i)==0 ? cur.left : cur.right;
            }
            else
                break;
        }
        return cur;
    }
}
