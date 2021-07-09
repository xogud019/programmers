package CodingTest.LeetCode.Tree.Easy;
//try again
public class MaximumDepthofNaryTree {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        
        if(root.children == null || root.children.isEmpty()) return 1;
        
        int answer = -1;
        
        for(Node node : root.children){
            answer = Math.max(answer, maxDepth(node));
        }
        
        return answer+1;
    }
}
