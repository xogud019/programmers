package level2;
import java.util.*;

public class Printer {
    public static void main(String[] args){
        int[] priorities={2,1,3,2};
        int location = 2;
        //char c = 'A';
        //System.out.println((char)((int)c+1));
        System.out.println(solution(priorities, location));
    }   
    
    public static int solution(int[] priorities, int location){
        char[] paper = new char[priorities.length];
        Queue<Integer> prio = new LinkedList<>();
        Queue<Character> pap = new LinkedList<>();
        int answer= 0;
        int[] arr= new int[paper.length];
        for(int i=0; i<paper.length; i++){
            paper[i]=(char)((int)'A'+i);
            pap.add(paper[i]);
            prio.add(priorities[i]);
        }

        for(int i=0; i<paper.length; i++){
            int temp = prio.poll();
            int count=0;
            for(int j=0; j<paper.length-1; j++){
                if(temp<priorities[j]){
                    prio.add(temp);
                    count++;
                }
            }
            if(count==0){
                arr[i]=temp;
            }
        }

        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        return answer;
    }
}