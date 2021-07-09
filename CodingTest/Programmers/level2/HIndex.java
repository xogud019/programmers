package CodingTest.Programmers.level2;


public class HIndex {
    public static void main(String[] args){
        int[] citations = {5,5,5,5};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations){
        int answer =0;
        int h = citations.length;
        int n = citations.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0 ;j<n; j++){
                if(citations[j]>=h){
                    count++;
                }
            }
            if(count>=h){
                return h;
            }
            h--;
        }
        
        return answer;
    }
}