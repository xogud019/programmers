package Programmers.level1;

public class FailRate {
    public static void main(String[] args){
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] result = solution(N, stages);
        for(int i =0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int N, int[] stages){
        int[] answer= new int[N];
        double[][] temp = new double[N][2];
        int player = stages.length;
        for(int i=1; i<=N; i++){
            int count=0;
            for(int j=0; j<stages.length; j++){
                if(i== stages[j]){
                    count++;
                }
            }
            temp[i-1][0]=i;
            temp[i-1][1]=(double)count/player;
            player-=count;
        }
        
        sort(temp);
      
        for(int i=0; i<answer.length; i++){
            answer[i]=(int)temp[i][0];
        }
        return answer;
    }

    public static void sort(double[][] arr){
        double temp1 = 0;
        double temp2 = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[j-1][1]<arr[j][1]){
                    temp1=arr[j-1][0];
                    temp2=arr[j-1][1];
                    arr[j-1][0] = arr[j][0];
                    arr[j-1][1] = arr[j][1];
                    arr[j][0]=temp1;
                    arr[j][1]=temp2;
                }
                else if(arr[j-1][1]==arr[j][1]){
                    if(arr[j-1][0]>arr[j][0]){
                        temp1=arr[j-1][0];
                        temp2=arr[j-1][1];
                        arr[j-1][0] = arr[j][0];
                        arr[j-1][1] = arr[j][1];
                        arr[j][0]=temp1;
                        arr[j][1]=temp2;
                    }
                }   
            }
        }
    }
}