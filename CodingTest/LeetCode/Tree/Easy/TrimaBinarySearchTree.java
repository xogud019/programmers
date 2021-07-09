package CodingTest.LeetCode.Tree.Easy;

public class TrimaBinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return root;
        if(root.val > high) return trimBST(root.left, low, high);
        if(root.val < low) return trimBST(root.right, low, high);
        
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        
        return root;
    }
    /*failed case
    public TreeNode trimBST(TreeNode root, int low, int high) {
        List<Integer> list = new ArrayList<>();
        TreeNode answer = new TreeNode();
        
        trim(root, low, high, list);
        
        for(int i:list){
            System.out.println(i);
            //answer.insert(i);    
        }
        
        return answer;
    }
    
    public void trim(TreeNode root, int low, int high, List<Integer> list){
        if(root == null) return;
        
        if(root.val>=low && root.val<=high) list.add(root.val);
        
        trim(root.left, low, high, list);
        trim(root.right, low, high, list);
    }
    */
}
