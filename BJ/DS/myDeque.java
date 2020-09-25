package BJ.DS;

import java.io.*;
public class myDeque {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        mD dq = new mD();

        for(int i=0; i<n; ++i){
            String s = br.readLine();

            if(s.contains("push_front")){
                String[] arr = s.split(" ");
                dq.fPush(Integer.parseInt(arr[1]));
                continue;
            }

            if(s.contains("push_back")){
                String[] arr = s.split(" ");
                dq.rPush(Integer.parseInt(arr[1]));
                continue;
            }

            if(s.equals("pop_front")){
                dq.fPop();
                continue;
            }

            if(s.equals("pop_back")){
                dq.rPop();
                continue;
            }

            if(s.equals("size")){
                dq.size();
                continue;
            }

            if(s.equals("empty")){
                System.out.println(dq.Empty());
                continue;
            }

            if(s.equals("front")){
                dq.front();
                continue;
            }

            if(s.equals("back")){
                dq.back();
                continue;
            }

        }

    }

    static class mD{
        Node front;
        Node rear;

        mD(){
            front = null;
            rear = null;
        }

        int Empty(){
            if(front==null) return 1;
            else return 0;
        }

        void fPush(int val){
            Node node = new Node(val);
            if(Empty()==1){
                front = node;
                rear = node;
                node.left = null;
                node.right = null;
            }
            else{
                front.left = node;
                node.right = front;
                node.left = null;
                front = node;
            }
        }

        void rPush(int val){
            Node node = new Node(val);
            if(Empty()==1){
                front = node;
                rear = node;
                node.left = null;
                node.right = null;
            }
            else{
                rear.right = node;
                node.left = rear;
                node.right = null;
                rear = node;
            }
        }

        void fPop(){
            if(Empty()==1){
                System.out.println(-1);
            }
            else{
                int data = front.val;

                if(front.right == null){
                    front = null;
                    rear = null;
                }
                else{
                    front = front.right;
                    front.left = null;
                }

                System.out.println(data);
            }
        }

        void rPop(){
            if(Empty()==1){
                System.out.println(-1);
            }
            else{
                int data = rear.val;

                if(rear.left == null){
                    front = null;
                    rear = null;
                }
                else{
                    rear = rear.left;
                    rear.right = null;
                }

                System.out.println(data);
            }
        }

        void front(){
            if(Empty()==1) System.out.println(-1);
            else{
                System.out.println(front.val);
            }
        }

        void back(){
            if(Empty()==1) System.out.println(-1);
            else{
                System.out.println(rear.val);
            }
        }

        void size(){
            if(Empty()==1) System.out.println(0);
            else{
                int count = 0;
                Node temp = front;

                while(temp != null){
                    count++;
                    temp = temp.right;
                }

                System.out.println(count);
            }
        }

    }

    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
}
