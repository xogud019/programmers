package BJ.DS;

import java.io.*;
import java.util.*;

public class MyQueue {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        mQ q = new mQ();

        for(int i=0; i<n; ++i){
            String s = br.readLine();

            if(s.contains(" ")){
                String[] arr = s.split(" ");
                q.push(Integer.parseInt(arr[1]));
                continue;
            }

            if(s.equals("pop")){
                q.pop();
                continue;
            }
            if(s.equals("size")){
                q.size();
                continue;
            }
            if(s.equals("empty")){
                q.empty();
                continue;
            }
            if(s.equals("front")){
                q.front();
                continue;
            }
            if(s.equals("back")){
                q.back();
                continue;
            }
            
        }

    }

    static class mQ{
        int top = -1;
        List<Integer> list;
        int base = 0;

        mQ(){
            list = new ArrayList<>();
        }

        void push(int val){
            list.add(val);
            this.top++;
        }

        void pop(){
            if(list.size()==0) System.out.println(-1);
            else{
                System.out.println(list.get(0));
                list.remove(0);
                this.top--;
            }
        }

        void size(){
            System.out.println(list.size());
        }

        void empty(){
            if(list.size()==0) System.out.println(1);
            else System.out.println(0);
        }
        
        void front(){
            if(list.size()==0) System.out.println(-1);
            else System.out.println(list.get(this.base));
        }

        void back(){
            if(list.size()==0) System.out.println(-1);
            else System.out.println(list.get(this.top));
        }
    }
}
