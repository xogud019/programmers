package level3;
//not
public class VisitLength {
    public static void main(String[] args){
        String dirs ="ULURRDLLU";
        
        System.out.println(solution(dirs));
    }

    public static int solution(String dirs) {
        int answer = 0;
        int idx = 0;
        int idy = 0;
        Point point = new Point();
        boolean[][] route = new boolean[dirs.length()][2];
        for(int i=0; i<dirs.length(); i++){
            if(dirs.charAt(i)=='U'){
                if(point.y<5){
                    point.y +=1;
                    idy++;
                    if(!route[idx][idy]){
                        answer++;
                    }
                }
            }
            else if(dirs.charAt(i)=='D'){
                if(point.y>-5){
                    point.y -=1;
                    idy--;
                    if(!route[idx][idy]){
                        answer++;
                    }
                }
            }
            else if(dirs.charAt(i)=='R'){
                if(point.x<5){
                    point.x +=1;
                    idx++;
                    if(!route[idx][idy]){
                        answer++;
                    }
                }
            }
            else{
                if(point.x>-5){
                    point.x -=1;
                    idx--;
                    if(!route[idx][idy]){
                        answer++;
                    }
                }
            }  
        }
        System.out.println(point.x+","+point.y);
        return answer;
    }

    static class Point{
        int x = 0;
        int y = 0;
    }
}