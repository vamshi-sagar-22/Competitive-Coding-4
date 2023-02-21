/*
Check if given binary tree is height balanced
approach: get the height and check differences or check if diff between left and right sub-trees which should always be <=1.
time: O(n)
space: O(1)
 */
public class Problem2 {
    boolean flag;
    /*
    public boolean isBalanced(TreeNode root) {
        helper(root, 0);

        if(flag) return false;
        return true;
    }

    private int helper(TreeNode root, int currdist) {
        if(root==null) return 0;
        int x = helper(root.left, currdist+1)+1;
        int y = helper(root.right, currdist+1)+1;

        if(Math.abs(x-y)>1){
            flag = true;
        }

        return Math.max(x,y);
    }

     */
}
