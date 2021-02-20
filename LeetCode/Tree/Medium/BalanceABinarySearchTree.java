package LeetCode.Tree.Medium;
//not yet
public class BalanceABinarySearchTree {
    /*failed case
    static TreeNode answer;
    
    public TreeNode balanceBST(TreeNode root) {
        if(root == null) return null;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode temp;
            
            for(int i=0; i<size; i++){
                temp = q.poll();
                list.add(temp.val);
                
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        
        Collections.sort(list);
        //this part maybe reason
        int rootIdx = list.size()/2;
        int rootVal = list.get(rootIdx);
        list.remove(rootIdx);
        answer = new TreeNode(rootVal);
        
        for(int i:list){
            addNode(i);
        }
        
        return answer;
    }
    
    public void addNode(int val){
        TreeNode node = new TreeNode(val);
        
        if(answer == null) answer = node;
        else{
            TreeNode cur = answer;
            TreeNode parent;
            
            while(true){
                parent = cur;
                
                if(val < parent.val){
                    cur = parent.left;
                    
                    if(cur == null){
                        parent.left = node;
                        return;
                    }
                }
                else{
                    cur = parent.right;
                    
                    if(cur == null){
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }
    */
}
