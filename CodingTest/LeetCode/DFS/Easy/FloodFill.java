package CodingTest.LeetCode.DFS.Easy;

public class FloodFill {
    static int[] X = {-1, 0, 1, 0};
    static int[] Y = {0, 1, 0, -1};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int start = image[sr][sc];
        
        dfs(image, sr, sc, start, newColor);
        
        return image;
        
    }
    
    public void dfs(int[][] image, int x, int y, int start, int newColor){
        if(x<0 || y<0 || x>= image.length || y>= image[0].length || image[x][y] != start) return;
        
        //System.out.println(image[x][y]);
        if(image[x][y] != newColor){
            image[x][y] = newColor;
            
            for(int i=0; i<X.length; i++) dfs(image,x+X[i],y+Y[i],start,newColor);            
        }
        
        /*
        for(int i=0; i<X.length; i++){
            for(int j=0; j<Y.length; j++){
                if(i>=0 && j>=0 && i<image.length && j<image[0].length && image[i][j] == start){
                    image[i][j] = start;
                    dfs(image, i, j, start, newColor);
                    return;
                }
            }
        }
        */
    }
}
