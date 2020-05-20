package level1;

public class SecretMap {
    public static void main(String[] args){
        int n=5;
        int[] arr1={9,20,28,18,11};
        int[] arr2={30,1,21,17,28};

        String[] answer= new String[n];
        answer = solution(n, arr1, arr2);

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }        
    }

    public static String[] solution(int n , int[] arr1, int[] arr2){
        String[] answer=  new String[n];
        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];
        String[] s1 = new String[n];
        String[] s2 = new String[n];
        String temp1 ="";
        String temp2 ="";
        for(int i=0; i<n; i++){
            temp1 = Integer.toBinaryString(arr1[i]);
            temp2 = Integer.toBinaryString(arr2[i]);
            while(temp1.length()<n){
                temp1 = "0"+temp1;
            }
            while(temp2.length()<n){
                temp2 = "0"+temp2;
            }
            s1[i]= temp1;
            s2[i]= temp2;
            temp1="";
            temp2="";
        }

        for(int i=0; i<answer.length; i++){
            answer[i]="";
        }
        
        makeMap(map1, s1);
        makeMap(map2, s2);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map1[i][j]==0&&map2[i][j]==0){
                    answer[i] +=" ";
                }
                else{
                    answer[i] +="#";
                }
            }
        }
        return answer;
    }

    public static void makeMap(int[][] map, String[] s){
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                map[i][j]= s[i].charAt(j)-'0';
            }
        }
    }
}