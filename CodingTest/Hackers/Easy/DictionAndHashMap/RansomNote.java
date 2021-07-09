package CodingTest.Hackers.Easy.DictionAndHashMap;
import java.util.*;

public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String,Integer> map =new HashMap<>();
        Map<String,Integer> map1 =new HashMap<>();
        
        for(int i=0; i<note.length; i++){
            if(!map.containsKey(note[i])){
                map.put(note[i],1);
            }
            else{
                map.put(note[i], map.get(note[i])+1);
            }
        }

        for(int i=0; i<magazine.length; i++){
            if(!map1.containsKey(magazine[i])){
                map1.put(magazine[i],1);
            }
            else{
                map1.put(magazine[i], map1.get(magazine[i])+1);
            }
        }

        for(String s : map.keySet()){
            if(!map1.containsKey(s)){
                System.out.println("No");
                return;
            }
            else{
                if(map.get(s)>map1.get(s)){
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
        return;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}