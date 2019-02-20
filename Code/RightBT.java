package Code;

import java.util.*;

public class RightBT {



     public class TreeNode {
          int val;
         TreeNode left;
        TreeNode right;
         TreeNode(int x) { val = x; }
     }


    List<TreeNode> list=new ArrayList<>();
    TreeNode node1;
     public TreeNode increasingBST(TreeNode root) {


            inOrder(root);
             node1=list.get(0);
              root=node1;
            for(int i=1;i<list.size();i++)
            {
                rightTree(list.get(i));
            }
         return root;
        }
        public void rightTree(TreeNode node)
        {
            node1.right=node;
            node1=node;
        }

        public void inOrder(TreeNode node)
        {
            if(node==null)
            {
                return ;
            }
            inOrder(node.left);
            list.add(node);
            inOrder(node.right);
        }
    }

