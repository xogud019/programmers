package Programmers.level3;

public class Popbollnoon {
    public int solution(int[] a) {
        int answer = 2;
        int l = a[0], r = a[a.length-1];
        
        for(int i=1; i<a.length-1; i++){
            if(a[i] < l){
                answer++;
                l = a[i];
            }
            if(a[a.length-1-i] < r){
                answer++;
                r = a[a.length-1-i];
            }
            
            if(l==r) break;
        }
        
        return answer + (l==r? -1:0);
    }
}
