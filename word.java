public class word {
    public static void main(String[] args){
        String word = "EIO";
        System.out.println(solution(word));
    }

    public static int solution(String word){
        int[] arr = {781,156,31,6,1};
        int answer = 0;

        for(int i=0; i<word.length(); i++){
            char temp = word.charAt(i);
            if(temp=='A'){
                answer+=1;
                continue;
            }
            if(temp=='E'){
                answer+= arr[i]*1+1;
                continue;
            }
            if(temp=='I'){
                answer+=arr[i]*2+1;
                continue;
            }
            if(temp=='O'){
                answer+=arr[i]*3+1;
                continue;
            }
            if(temp=='U'){
                answer+=arr[i]*4+1;
                continue;
            }
        }
        return answer;
    }
}