public class spTree {
    public static void main(String[] args){
        int total_sp = 121;
        int[][] skill = {{1,2},{1,3},{3,6},{3,4},{3,5}};
        int[] result =solution(total_sp,skill);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int total_sp, int[][] skill){
        int[] result = {};
        for(int i=0; i<skill.length; i++){
            for(int j=0; j<skill[i].length; j++){
                
            }
        }
        return result; 
    }
}
