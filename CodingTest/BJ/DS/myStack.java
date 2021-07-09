package CodingTest.BJ.DS;

import java.util.*;

public class myStack {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Integer> list = new ArrayList<>();
        mStack stk = new mStack();

        for(int i=0; i<n; i++){
            String s = scan.nextLine();
            if(s.contains(" ")){
                String[] ss = s.split(" ");
                stk.push(Integer.parseInt(ss[1]));

            }
            else if(s.equals("top")){
                list.add(stk.top());
            }
            else if(s.equals("size")){
                list.add(stk.size());
            }
            else if(s.equals("empty")){
                list.add(stk.empty());
            }
            else if(s.equals("pop")){
                list.add(stk.pop());
            }
        }

        scan.close();

        for(int i:list){
            System.out.println(i);
        }
    }
}

class mStack{
    List<Integer> list;
    int point = -1;

    mStack(){
        list = new ArrayList<>();
    }

    void push(int val){
        list.add(val);
        this.point++;
    }

    int top(){
        if(this.point==-1) return -1;
        else return list.get(this.point);
    }

    int empty(){
        return list.size()==0? 1:0;
    }

    int size(){
        return list.size();
    }

    int pop(){
        if(this.point == -1) return -1;
        else{
            int temp = list.get(this.point);
            list.remove(this.point--);
            return temp;
        }
    }
}
