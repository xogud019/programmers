package CodingTest.Hackers.Medium.Search;
import java.util.*;

public class IceCreamParlor {
    static void whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<cost.length; i++){
            int now = money-cost[i];
            if(map.containsKey(now)){
                System.out.println(map.get(now)+" "+(i+1));
                return;
            }

            if(!map.containsKey(cost[i])) map.put(cost[i],i+1);
        }
    }
    /*failed case -> time out
    static void whatFlavors(int[] cost, int money) {
        int len = cost.length;
        int max = Integer.MIN_VALUE;
        int[] arr = new int[2];

        for(int i=0; i<len-1; i++){
            for(int j=len-1; j>i; j--){
                int newCost = cost[i]+cost[j];
                if(newCost<=money&&newCost>max){
                    max = newCost;
                    arr[0] = i+1;
                    arr[1] = j+1;
                }
            }
        }

        System.out.println(arr[0]+" "+arr[1]);
    }
    */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}