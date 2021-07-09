package Programmers.level3;


public class VisitLength {
    public static void main(String[] args){
        //String dirs ="ULURRDLLU";
        //String dirs ="LURDLURD";
        String dirs ="UUUUUUUR";
        
        System.out.println(solution(dirs));
    }

    public static int solution(String dirs) {
        int answer = 0;
        boolean[][] uD = new boolean[11][11];
        boolean[][] lR = new boolean[11][11];
        Point point = new Point();

        for(int i=0; i<dirs.length(); i++){
            if(dirs.charAt(i)=='U'){
                if(point.y<10){
                    point.y+=1;
                    if(!uD[point.x][point.y]){
                        answer++;
                    }
                    uD[point.x][point.y] = true;
                }
            }
            else if(dirs.charAt(i)=='D'){
                if(point.y>0){
                    if(!uD[point.x][point.y]){
                        answer++;
                    }
                    uD[point.x][point.y] = true;
                    point.y-=1;                    
                }
            }
            else if(dirs.charAt(i)=='R'){
                if(point.x<10){
                    point.x+=1;
                    if(!lR[point.x][point.y]){
                        answer++;
                    }
                    lR[point.x][point.y] = true;
                }
            }
            else{
                if(point.x>0){
                    if(!lR[point.x][point.y]){
                        answer++;
                    }
                    lR[point.x][point.y] = true;
                    point.x-=1;
                }
            }
        }

        return answer;
    }

    static class Point{
        int x = 5;
        int y = 5;
    }
}