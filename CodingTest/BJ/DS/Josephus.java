package CodingTest.BJ.DS;

import java.util.*;
import java.io.*;

public class Josephus {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        Queue<Integer> q = new LinkedList<>();
        int count = 1;

        for(int i=1; i<=n; i++){
            q.add(i);
        }
        sb.append("<");

        while(!q.isEmpty()){
            if(count%k==0){
                sb.append(q.poll());
                if(!q.isEmpty()){
                    sb.append(", ");
                }
            }
            else{
                q.add(q.poll());
            }

            count++;
        }

        sb.append(">");

        System.out.println(sb.toString());
    }
}
