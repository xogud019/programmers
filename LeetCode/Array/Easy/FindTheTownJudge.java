package LeetCode.Array.Easy;

public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] arr = new int[N];
        
        for(int i=0; i<trust.length; i++){
            arr[trust[i][1]-1]++;
            arr[trust[i][0]-1]--;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==N-1) return i+1;
        }
        
        return -1;
    }
}
