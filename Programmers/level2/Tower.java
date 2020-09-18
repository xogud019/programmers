package Programmers.level2;


public class Tower {
    public static void main(String[] args){
        int[] heights ={1,5,3,6,7,6,5};
        int[] result = solution(heights);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int[] heights){
        int[] answer = new int[heights.length];
        for(int i=heights.length-1; i>0; i--){
            for(int j=i; j>0; j--){
                if(heights[i]<heights[j-1]){
                    answer[i]=j;
                    break;
                }

            }
        }
        return answer;
    }   
}