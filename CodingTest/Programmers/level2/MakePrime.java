package Programmers.level2;


public class MakePrime {
    static int answer;
    static int r = 3;
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(solution2(nums));
    }   
    
    public static int solution(int[] nums){
        answer = 0;
        boolean[] visited = new boolean[nums.length];
        dfs(nums, visited, 0, nums.length, 3);

        return answer;
    }

    public static void dfs(int[] nums, boolean[] visited, int start, int n, int r){
        if(r==0){
            int sum = 0;
            for(int i=0; i<visited.length; i++){
                if(visited[i]==true){
                    sum+=nums[i];
                }
            }

            if(isPrime(sum)){
                answer++;
            }
            return;
        }

        for(int i=start; i<n; i++){
            visited[i] = true;
            dfs(nums, visited, i+1, n, r-1);
            visited[i] = false;
        }
    }

    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static int solution2(int[] nums){
        int answer = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(isPrime(sum)) answer++;
                }
            }
        }
        return answer;
    }
}