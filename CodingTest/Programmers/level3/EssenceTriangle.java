package CodingTest.Programmers.level3;


public class EssenceTriangle {
    public static void main(String[] args){
        int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
        System.out.println(solution(triangle));
    }
    public static int solution(int[][] triangle) {
        int answer = 0;
        dfs(triangle, 1, triangle.length);
        //print(triangle);
        for(int i=0; i<triangle[triangle.length-1].length; i++){
            if(triangle[triangle.length-1][i]>answer){
                answer = triangle[triangle.length-1][i];
            }
        }
        return answer;
    }

    public static void dfs(int[][] triangle, int index, int max){
        if(index==max){
            return;
        }

        for(int i=0; i<triangle[index].length; i++){            
            if(i==0){
                triangle[index][i]+=triangle[index-1][i];
                continue;
            }

            if(i+1==triangle[index].length){
                triangle[index][i]+=triangle[index-1][i-1];
                continue;
            }

            triangle[index][i] += Math.max(triangle[index-1][i-1],triangle[index-1][i]);
        }
        dfs(triangle, index+1, max);
    }

    public static void print(int[][] triangle){
        for(int i=0; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}