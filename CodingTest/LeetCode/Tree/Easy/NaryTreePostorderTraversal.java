package CodingTest.LeetCode.Tree.Easy;
//try again
public class NaryTreePostorderTraversal {
    public int sumRootToLeaf(TreeNode root) {
        int answer = 0;
        
        answer = dfs(root, 0);
        
        return answer;
    }
    
    public int dfs(TreeNode root, int sum){
        sum = sum*2 + root.val;
        
        if(root.left == null && root.right == null) return sum;
        
        int l = root.left == null ? 0 : dfs(root.left, sum);
        int r = root.right == null ? 0 : dfs(root.right, sum);

        return l+r;
    }
    /*failed case
    public List<Integer> postorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        
        postOrder(root, answer);
        
        return answer;
    }
    
    public void postOrder(Node root, List<Integer> answer){
        if(root != null){
            for(Node node : root.children){
                postOrder(node, answer);
            }
            
            answer.add(root.val);
        }
    }
    */
}
