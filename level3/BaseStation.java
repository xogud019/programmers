package level3;

public class BaseStation {
    public static void main(String[] args){
        int n = 16;
        int[] stations = {9};
        int w = 2;
        System.out.println(solution(n, stations, w));
    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int loc = 1;
        int sta = 0;
        while(loc<=n){
            if(sta<stations.length&&loc>=stations[sta]-w){
                loc = stations[sta]+w+1;
                sta++;
            }
            else{
                answer++;
                loc +=2*w+1;
            }
        }
        return answer;
    }
}

/*failed case
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();

        for(int i=1; i<n+1; i++){
            q.add(i);
            for(int j=0; j<stations.length; j++){
                if(i>=(stations[j]-w)&&i<=(stations[j]+w)){
                    q.remove(i);
                }
            }
        }
       
        while(!q.isEmpty()){
            int count=0;
            while(!q.isEmpty()&&count<w){
                q.poll();
                count++;
            }

        }
        return answer;    
*/