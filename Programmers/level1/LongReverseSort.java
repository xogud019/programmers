package Programmers.level1;


public class LongReverseSort {
    public static void main(String[] args){
        long n = 873211;
        System.out.println(solution(n));
    }

    public static long solution(long n){
        String s =""+n;
        String ss= "";
        char[] temp = s.toCharArray();
        sort(temp);
        for(int i=0; i<temp.length; i++){
            ss+=temp[i];
        }

        return Long.parseLong(ss);
    }

    public static void sort(char[] temp){
        char c= temp[0];
        for(int i=0; i<temp.length-1; i++){
            for(int j=1; j<temp.length; j++){
                if(temp[j-1]<temp[j]){
                    c= temp[j-1];
                    temp[j-1]= temp[j];
                    temp[j]= c;
                }
            }
        }
    }
}
//Arrays.sort(arr, Collections.reverseOrder()); reverse sort