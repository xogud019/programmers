package CodingTest.Programmers.level1;


public class RectangleStar {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        solution(a,b);   
    }

    public static void solution(int a, int b){
        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}