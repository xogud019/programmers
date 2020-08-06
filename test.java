public class test {
    public static void main(String[] args){
        int[][] s=  {{6,1,8},{7,5,3},{2,9,4}};
        System.out.println(181054345%4);
        /*
        rotate(s);
        rotate(s);

        for(int i=0; i<s.length; i++){
            for(int j=0; j<s[0].length; j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
        */
    }

    public static void rotate(int[][] s){
        int[][] temp= new int[3][3];

        for(int i=0; i<s.length; i++){
            for(int j=0; j<s[0].length; j++){
                temp[j][s.length-1-i] = s[i][j];
            }
        }
        for(int i=0; i<s.length; i++){
            for(int j=0; j<s[0].length; j++){
                s[i][j] = temp[i][j];
            }
        }
    }
}