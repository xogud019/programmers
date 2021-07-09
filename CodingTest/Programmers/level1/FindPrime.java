package Programmers.level1;

public class FindPrime {
    public static void main(String[] args){
        int n = 5;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int[] arr= new int[n+1];
        int answer= 0;
        arr[0]=0;
        arr[1]=0;

        for(int i=2; i<n+1; i++){
            arr[i]=i;
        }

        for(int i=2; i<arr.length; i++){
            if(arr[i]==0){
                continue;
            }
            for(int j=i*2; j<arr.length; j+=i){
                arr[j]=0;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                answer++;
            }
        }

        return answer;
    }
}