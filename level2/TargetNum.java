package level2;

class TargetNum{
    public static void main(String[] args){
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    public static int solution(int[] numbers, int target){
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }

    public static int dfs(int[] numbers, int target, int sum, int index){
        if(index == numbers.length){
            if(sum==target){
                return 1;
            }
            else{
                return 0;
            }
        }

        return dfs(numbers, target, sum+numbers[index], index+1)+ dfs(numbers, target, sum-numbers[index], index+1);
    }
}