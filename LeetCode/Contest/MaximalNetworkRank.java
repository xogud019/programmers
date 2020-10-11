package LeetCode.Contest;

public class MaximalNetworkRank {
    /*failed case
    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] arr = new int[n][n];
        int answer = 0;
        
        if(n==2 && roads.length != 0) return 1;
        if(roads == null) return 0;
        
        for(int i=0; i<roads.length; i++){
            arr[roads[i][0]][roads[i][1]] = 1;
            arr[roads[i][1]][roads[i][0]] = 1;
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int[] temp = new int[n];
                
                for(int k =0; k<n; k++){
                    temp[k] = arr[i][k]|arr[j][k];
                    //System.out.print(temp[k]+" ");
                }
                answer = Math.max(answer, countOne(temp));
            }
        }
        
        return answer;
    }
    
    public int countOne(int[] a){
        int count = 0;
        
        for(int i:a){
            if(i==1) count++;
        }
        
        return count;
    }
    */
}
