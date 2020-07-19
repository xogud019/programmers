public class Permutation {
    public static void main(String[] args){
        char[] s = {'A','B','C','D'};
        perm(s, 0, s.length);        
    }   

    public static void perm(char[] s, int depth, int max){
        if(depth==max){
            print(s);
            return;
        }
        for(int i=depth; i<s.length; i++){
            swap(s, i, depth);
            perm(s, depth+1, max);
            swap(s, i, depth);
        }
    }

    public static void print(char[] s){
        for(int i=0; i<s.length; i++){
            System.out.print(s[i]);
        }
        System.out.println();
    }

    public static void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}