package level2;

public class NLCD {
    public static void main(String[] args){
        int[] arr = {2,4,6,15};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr) {
        for(int i =arr[arr.length-1]; ; i++){
            boolean isT = false;
            
            for(int j=0; j<arr.length; j++){
                if(i%arr[j]!=0){
                    isT = true;
                    break;
                }
            }
            if(isT==false){
                return i;
            }
        }
     }
}