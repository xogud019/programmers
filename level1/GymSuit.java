package level1;

public class GymSuit {
    public static void main(String[] args){
        int n=5;    //total student`s num
        int[] lost = {1,2}; //lost student`s num
        int[] reserve = {2,3}; //have a reserve student`s num
        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve){
        int answer= n-lost.length;
        int[] tempLost = lost;
        int[] tempReserve = reserve;

        for(int i=0; i<tempLost.length; i++){
            for(int j=0; j<tempReserve.length; j++){
                if((tempLost[i]==tempReserve[j])&&tempLost[i]!=0){
                    tempLost[i]=0;
                    tempReserve[j]=0;
                    answer++;
                    break;
                }
            }
        }

        for(int i=0; i<tempLost.length; i++){
            for(int j=0; j<tempReserve.length; j++){
                if(tempLost[i]!=0&&tempReserve[j]!=0){
                    if(tempLost[i]+1==tempReserve[j]||tempLost[i]-1==tempReserve[j]){
                        tempLost[i]=0;
                        tempReserve[j]=0;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer;
    }

}