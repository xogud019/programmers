package level2;

public class KPicture {
    static int answer;
    public static void main(String[] args){
        int n = 2;
        String[] data = {"N~F=0","R~T>2"};
        System.out.println(solution(n, data));
    }

    public static int solution(int n, String[] data){
        answer = 0;
        char[] friend = {'A','C','F','J','M','N','R','T'};
        dfs(friend, data, 0, friend.length);
        return answer;
    }

    public static void dfs(char[] friend, String[] data, int depth, int max){
        if(depth==max){
            char to =' ', from=' ', oper=' ';
            int val=0, tIdx=0, fIdx=0;

            for(int i=0; i<data.length; i++){
                to = data[i].charAt(0);
                from = data[i].charAt(2);
                oper = data[i].charAt(3);
                val = data[i].charAt(4)-'0';

                for(int k=0; k<friend.length; k++){
                    if(friend[k]==to){
                        tIdx = k;
                    }
                    if(friend[k]==from){
                        fIdx = k;
                    }
                }
                if(oper =='>'){
                    if(Math.abs(tIdx-fIdx)-1<=val){
                        return;
                    }
                }
                else if(oper =='<'){
                    if(Math.abs(tIdx-fIdx)-1>=val){
                        return;
                    }
                }
                else{
                    if(Math.abs(tIdx-fIdx)-1!=val){
                        return;
                    }
                }
            }
            answer++;
            return;
        }

        for(int i=depth; i<friend.length; i++){
            swap(friend, i, depth);
            dfs(friend, data, depth+1, max);
            swap(friend, i, depth);
        }
    }
    
    public static void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    /*
    public static void print(char[] friend){
        for(int i=0; i<friend.length; i++){
            System.out.print(friend[i]);
        }
        System.out.println();
    }
    */
    /*
    public static boolean dataCheck(String[] data, char[] friend){
        boolean isT = true;
        for(int i=0; i<data.length; i++){
            char to =' ', from=' ', oper=' ';
            int val=0, tIdx=0, fIdx=0;
            
            for(int j=0; j<data[i].length(); j++){
                to = data[i].charAt(0);
                from = data[i].charAt(2);
                oper = data[i].charAt(3);
                val = data[i].charAt(4);
            }
            
            for(int k=0; k<friend.length; k++){
                if(friend[k]==to){
                    tIdx = k;
                }
                if(friend[k]==from){
                    fIdx = k;
                }
            }
            //System.out.println(tIdx+","+fIdx);
            if(oper =='>'){
                if(Math.abs(tIdx-fIdx)-1<=val){
                    isT = false;
                }
            }
            else if(oper =='<'){
                if(Math.abs(tIdx-fIdx)-1>=val){
                    isT = false;
                }
            }
            else{
                if(Math.abs(tIdx-fIdx)-1!=val){
                    isT = false;
                }
            }
        }
        return isT;
    }
    */
}