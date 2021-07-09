package Note;

import java.util.Stack;

public class fsddf {
    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> stk = new Stack<>();
        boolean[] table = new boolean[n];
        
        for(String cmds : cmd){
            if(cmds.length() == 1){
                if(cmds.equals("C")){
                    table[k] = true;
                    boolean empty = true;
                    stk.push(k);
                    for(int i=k+1; i<n; i++){
                        if(!table[i]){
                            empty = false;
                            k = i;
                            break;
                        }
                        empty = true;
                    }
                    
                    if(empty){
                        while(table[k] && k > 0){
                            k--;
                        }
                    }
                }
                else{
                    int idx = stk.pop();
                    table[idx] = false;
                }
            }
            else{
                String[] c = cmds.split(" ");
                int move = Integer.parseInt(c[1]);
                
                if(c[0].equals("U")){
                    while(move > 0 && k > 0){
                        k--;
                        if(!table[k]) move--;
                    }    
                }
                else{
                    while(move > 0 && k < n){
                        k++;
                        if(!table[k]) move--;
                    }
                }
            }
            /*
            for(boolean v:table) System.out.print(v+" ");
            System.out.print(k);
            System.out.println();
            */
        }
        
        StringBuilder sb = new StringBuilder();
    
        for(boolean v : table){
            if(!v) sb.append("O");
            else sb.append("X");
        }
        
        return sb.toString();
    }
}
