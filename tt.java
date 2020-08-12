public class tt {
    public static void main(String[] args){
        int a = 161700;

        for(int i=1; i<101; i++){
            for(int j=1; j<101; j++){
                for(int k=1; k<101; k++){
                    if(i*j*k==a){
                        System.out.println(i+" "+j+" +"+k);
                    }
                }
            }
        }
    }
}