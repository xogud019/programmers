package CodingTest.Programmers.level2;


class mulMatrix{
    public static void main(String[] args){
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};
        int[][] result = solution(arr1, arr2);
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] arr1, int[][] arr2){
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                int sum = 0;
                for(int k=0; k<arr2.length; k++){
                    sum+=arr1[i][k]*arr2[k][j]; 
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}