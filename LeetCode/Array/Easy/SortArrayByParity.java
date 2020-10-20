package LeetCode.Array.Easy;

import java.util.*;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        /*Sort
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
        
        /*Two pass
        int[] ans = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];

        return ans;
        */

        /*In-Place
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
        */
        
        //speed 5
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int[] answer = new int[A.length];
        
        for(int i:A){
            if(i%2==0) even.add(i);
            else odd.add(i);
        }
        
        Collections.sort(even);
        Collections.sort(odd);
        
        for(int i=0; i<even.size(); i++){
            answer[i] = even.get(i);
        }
        
        for(int i=even.size(); i<odd.size()+even.size(); i++){
            answer[i] = odd.get(i-even.size());
        }
        
        return answer;
    }
}
