package CodingTest.LeetCode.BinarySearch.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
interface CustomFunction{
    public default int f(int x, int y) {
        return 0;
    }
}

public class FindPositiveIntegerSolutionForAGivenEquation {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> answer = new ArrayList<>();
        
        int x = 1;
        int y = 1000;
        int val = 0;
        
        while(x <= 1000 && y >= 1){
            val = customfunction.f(x,y);
            
            if(val>z){
                y--;
            }
            else if(val<z){
                x++;
            }
            else{
                answer.add(Arrays.asList(x,y));
                x++;
            }
        }
        
        return answer;
    }
}
