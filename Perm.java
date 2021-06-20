import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perm {
    static List<int[]> list;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        list = new ArrayList<>();
        System.out.print("input size:");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){ 
            arr[i] = i+1;
            sum += i+1;
        }

        sum -= n;

        perm(arr, 0);
        int[] temp = new int[sum+1];

        for(int[] nums:list){
            int count = 0;
            for(int i=0; i<nums.length-1; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(i < j && nums[i] > nums[j]) count++;
                }
            }
            
            temp[count]++;
        }

        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i]+" ");
        }
        scan.close();
    }

    public static void perm(int[] arr, int idx){
        if(idx == arr.length){
            int[] temp = arr.clone();
            list.add(temp);
        }

        for(int i=idx; i<arr.length; i++){
            swap(arr, i, idx);
            perm(arr, idx+1);
            swap(arr, i, idx);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return;
    }

    public static void print(int[] arr){
        for(int i:arr) System.out.print(i+" ");
        //System.out.println();
        return;
    }
}
// 3: 0-1 1-2 2-2 3-1
/*
1 2 3 4 :0
1 2 4 3 :1
1 3 2 4 :1
1 3 4 2 :2
1 4 3 2 :3
1 4 2 3 :2
2 1 3 4 :1
2 1 4 3 :2
2 3 1 4 :2
2 3 4 1 :3
2 4 3 1 :4
2 4 1 3 :3
3 2 1 4 :3
3 2 4 1 :4
3 1 2 4 :2
3 1 4 2 :3
3 4 1 2 :4
3 4 2 1 :5
4 2 3 1 :5
4 2 1 3 :4
4 3 2 1 :6
4 3 1 2 :5
4 1 3 2 :4
4 1 2 3 :3

 
*/