package level1;

public class KeyPad {
    public static void main(String[] args){
        int[] numbers ={1};
        String hand ="left";
        
        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand){
        String answer ="";
        Hand l = new Hand(100,3,0);
        Hand r = new Hand(101,3,2);

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1){
                answer+="L";
                l.pos = 1;
                l.x = 0;
                l.y = 0;
                continue;
            }
            if(numbers[i]==2){
                if(Math.abs(l.x-0)+Math.abs(l.y-1)<Math.abs(r.x-0)+Math.abs(r.y-1)){
                    answer+="L";
                    l.pos = 2;
                    l.x = 0;
                    l.y = 1;
                    continue;
                }
                else if(Math.abs(l.x-0)+Math.abs(l.y-1)>Math.abs(r.x-0)+Math.abs(r.y-1)){
                    answer+="R";
                    r.pos = 2;
                    r.x = 0;
                    r.y = 1;
                    continue;
                }
                else{
                    if(hand.equals("left")){
                        answer+="L";
                        l.pos = 2;
                        l.x = 0;
                        l.y = 1;
                        continue;
                    }
                    else{
                        answer+="R";
                        r.pos = 2;
                        r.x = 0;
                        r.y = 1;
                        continue;
                    }
                }
            }
            if(numbers[i]==3){
                answer+="R";
                r.pos = 3;
                r.x = 0;
                r.y = 2;
                continue;
            }
            if(numbers[i]==4){
                answer+="L";
                l.pos = 4;
                l.x = 1;
                l.y = 0;
                continue;
            }
            if(numbers[i]==5){
                if(Math.abs(l.x-1)+Math.abs(l.y-1)<Math.abs(r.x-1)+Math.abs(r.y-1)){
                    answer+="L";
                    l.pos = 5;
                    l.x = 1;
                    l.y = 1;
                    continue;
                }
                else if(Math.abs(l.x-1)+Math.abs(l.y-1)>Math.abs(r.x-1)+Math.abs(r.y-1)){
                    answer+="R";
                    r.pos = 5;
                    r.x = 1;
                    r.y = 1;
                    continue;
                }
                else{
                    if(hand.equals("left")){
                        answer+="L";
                        l.pos = 5;
                        l.x = 1;
                        l.y = 1;
                        continue;
                    }
                    else{
                        answer+="R";
                        r.pos = 5;
                        r.x = 1;
                        r.y = 1;
                        continue;
                    }
                }
            }
            if(numbers[i]==6){
                answer+="R";
                r.pos = 6;
                r.x = 1;
                r.y = 2;
                continue;
            }
            if(numbers[i]==7){
                answer+="L";
                l.pos = 7;
                l.x = 2;
                l.y = 0;
                continue;
            }
            if(numbers[i]==8){
                if(Math.abs(l.x-2)+Math.abs(l.y-1)<Math.abs(r.x-2)+Math.abs(r.y-1)){
                    answer+="L";
                    l.pos = 8;
                    l.x = 2;
                    l.y = 1;
                    continue;
                }
                else if(Math.abs(l.x-2)+Math.abs(l.y-1)>Math.abs(r.x-2)+Math.abs(r.y-1)){
                    answer+="R";
                    r.pos = 8;
                    r.x = 2;
                    r.y = 1;
                    continue;
                }
                else{
                    if(hand.equals("left")){
                        answer+="L";
                        l.pos = 8;
                        l.x = 2;
                        l.y = 1;
                        continue;
                    }
                    else{
                        answer+="R";
                        r.pos = 8;
                        r.x = 2;
                        r.y = 1;
                        continue;
                    }
                }
            }
            if(numbers[i]==9){
                answer+="R";
                r.pos = 3;
                r.x = 2;
                r.y = 2;
                continue;
            }
            if(numbers[i]==0){
                if(Math.abs(l.x-3)+Math.abs(l.y-1)<Math.abs(r.x-3)+Math.abs(r.y-1)){
                    answer+="L";
                    l.pos = 0;
                    l.x = 3;
                    l.y = 1;
                    continue;
                }
                else if(Math.abs(l.x-3)+Math.abs(l.y-1)>Math.abs(r.x-3)+Math.abs(r.y-1)){
                    answer+="R";
                    r.pos = 0;
                    r.x = 3;
                    r.y = 1;
                    continue;
                }
                else{
                    if(hand.equals("left")){
                        answer+="L";
                        l.pos = 0;
                        l.x = 3;
                        l.y = 1;
                        continue;
                    }
                    else{
                        answer+="R";
                        r.pos = 0;
                        r.x = 3;
                        r.y = 1;
                        continue;
                    }
                }
            }
            
        }
        return answer;
    }

    static class Hand{
        int x = 0;
        int y = 0;
        int pos = 0;

        Hand(int n, int x, int y){
            this.pos = n;
            this.x = x;
            this.y = y;
        }
    }
}