package level2;
import java.util.*;

public class Tower {
    public static void main(String[] args){
        int[] heights ={6,9,5,7,7};
        int[] result = solution(heights);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int[] answer= new int[heights.length];
        int index = heights.length-1;

        for(int i=heights.length-1; i>0; i--){
            if(stack.isEmpty()){
                stack.add(heights[i]);
            }
            else{
                if(stack.lastElement()<heights[i]){
                    
                }
            }
        }
        return answer;
    }   
}