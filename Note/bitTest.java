package Note;

public class bitTest {
    public static void main(String[] args){
        int idx = 3;

        while(idx > 0){
            System.out.println(idx);

            idx -= (idx &-idx);

            System.out.println(idx);
        }

        System.out.println("-----------------");

        int i = 3;

        while(i > 0){
            System.out.println(i);

            i &= (i-1);
        }
    }
}
