package Programmers.level3;

import java.util.*;

public class FindRoute {
    static List<Integer> pre = new ArrayList<>();
    static List<Integer> post = new ArrayList<>();
    public static void main(String[] args){
        int[][] nodeinfo ={{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}};
        int[][] result = solution(nodeinfo);

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] nodeinfo){
        int[][] answer =new int[2][nodeinfo.length];
        List<Node> nodeList = new ArrayList<>();

        for(int i=0; i<nodeinfo.length; i++){
            nodeList.add(new Node(nodeinfo[i][0], nodeinfo[i][1], i+1));
        }

        Collections.sort(nodeList, new Comparator<Node>(){
            @Override
            public int compare(Node n1, Node n2){
                if(n1.y==n2.y){
                    return n1.x-n2.x;
                }
                else return n2.y-n1.y;
            }
        });
        
        Tree tree = new Tree(nodeList.get(0));

        for(int i=1; i<nodeList.size(); i++){
            tree.addNode(nodeList.get(i));
        }
        
        tree.postOrder(nodeList.get(0));
        tree.preOrder(nodeList.get(0));

        for(int i=0; i<pre.size(); i++){
            answer[0][i] = pre.get(i);
        }

        for(int i=0; i<post.size(); i++){
            answer[1][i] = post.get(i);
        }
        return answer;
    }

    static class Node{
        int x = 0;
        int y = 0;
        int index = 0;

        Node left;
        Node right;
        
        Node(int x, int y, int index){
            this.x = x;
            this.y = y;
            this.index = index;
        }

        public Node getRightChild(){
            return right;
        }
        public Node getLeftChild(){
            return left;
        }
    }

    static class Tree{
        Node root;

        Tree(Node node){
            this.root = node;
        }

        public void addNode(Node node){
            Node temp = root;

            while(true){
                if(node.x<temp.x){
                    if(temp.getLeftChild()==null){
                        temp.left = node;
                        break;
                    }
                    else{
                        temp = temp.left;
                    }
                }
                else{
                    if(temp.right==null){
                        temp.right = node;
                        break;
                    }
                    else{
                        temp = temp.right;
                    }
                }
            }
        }

        public void preOrder(Node node){
            if(node!=null){
                pre.add(node.index);
                preOrder(node.left);
                preOrder(node.right);
            }
        }

        public void postOrder(Node node){
            if(node!=null){
                postOrder(node.left);
                postOrder(node.right);
                post.add(node.index);
            }
        }
        /*
        public void printTree(Node node){
            if(node==null){
                return;
            }
            printTree(node.left);
            System.out.println(node.index);
            printTree(node.right);
        }
        */
    }
}