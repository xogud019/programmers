package LeetCode.Tree.Easy;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        
        return makeBST(nums, 0, nums.length-1);
    }
    
    public TreeNode makeBST(int[] nums, int start, int end){
        if(start>end) return null;
        
        int mid = (start+end)/2;
        
        TreeNode answer = new TreeNode(nums[mid]);
        
        answer.left = makeBST(nums,start,mid-1);
        answer.right = makeBST(nums,mid+1,end);
        
        return answer;
    }
}
