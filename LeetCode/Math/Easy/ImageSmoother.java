package LeetCode.Math.Easy;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int r = M.length, c = M[0].length;
        int[][] answer = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                int count = 0;
                
                for(int x=-1; x<=1; x++){
                    for(int y=-1; y<=1; y++){
                        if(x+i < 0 || x+i >= r || y+j < 0 || y+j >= c) continue;   
                        //System.out.println(x+i+" "+y+j);
                        answer[i][j] += M[x+i][y+j];
                        count++;
                    }
                }
                
                answer[i][j] /= count;
            }
        }
        
        return answer;
    }
}
