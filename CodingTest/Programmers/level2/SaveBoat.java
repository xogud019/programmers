package CodingTest.Programmers.level2;

import java.util.*;

public class SaveBoat {
    public static void main(String[] args){
        int[] people = {70,50,80};
        int limit = 100;
        System.out.println(solution(people,limit));
    }
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int index = people.length-1;
        int i = 0;
        while(i<=index){
            if(people[i]+people[index]<=limit){
                i++;
            }
            index--;
            answer++;
        }
        return answer;
    }

    /*
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int temp = 0;
        int max = 0;
        int tot_wei = 0;
        int answer = 0;

        for(int i=0; i<people.length; i++){
            if(people[i]==0){
                continue;
            }
            tot_wei = people[i];
            people[i]= 0;
            max = tot_wei;
            for(int j=i+1; j<people.length; j++){
                if(people[j]==0){
                    continue;
                }
                if(tot_wei+people[j]<=limit&&tot_wei+people[j]>max){
                    temp = j;
                    max = tot_wei+people[j];
                }
            }
            if(temp!=0){
                people[temp]=0;
            }
            answer++;
        }

        return answer;
    }
    */

    /*
    public static int solution(int[] people, int limit) {
        int answer = 0;
        int tot_wei = 0;
        int max = 0;
        int temp = 0;
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(people);

        for(int i=0; i<people.length; i++){
            q.add(people[i]);
        }
        
        while(!q.isEmpty()){
            tot_wei = q.poll();
            max = tot_wei;
            if(tot_wei<=limit){
                int count=0;
                int len = q.size();
                while(count<len){
                    count++;
                    int n = q.poll();
                    if(tot_wei+n<=limit&&tot_wei+n>max){
                        if(temp!=0){
                            q.add(temp);
                        }
                        temp = n;
                        max = tot_wei+n;
                    }
                    else{
                        q.add(n);
                    }
                }
            }
            temp=0;
            answer++;
            tot_wei = 0;
            max = 0;
            
        }

        return answer;
    }
    */
}