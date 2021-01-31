package LeetCode.Array.Medium;
/*
You are given two images img1 and img2 both of size n x n, represented as binary, square matrices of the same size. (A binary matrix has only 0s and 1s as values.)

We translate one image however we choose (sliding it left, right, up, or down any number of units), and place it on top of the other image.  After, the overlap of this translation is the number of positions that have a 1 in both images.

(Note also that a translation does not include any kind of rotation.)

What is the largest possible overlap?

Example 1:

Input: img1 = [[1,1,0],[0,1,0],[0,1,0]], img2 = [[0,0,0],[0,1,1],[0,0,1]]
Output: 3
Explanation: We slide img1 to right by 1 unit and down by 1 unit.

The number of positions that have a 1 in both images is 3. (Shown in red)

Example 2:

Input: img1 = [[1]], img2 = [[1]]
Output: 1

Example 3:

Input: img1 = [[0]], img2 = [[0]]
Output: 0
 

Constraints:
1.n == img1.length
2.n == img1[i].length
3.n == img2.length
4.n == img2[i].length
5.1 <= n <= 30
6.img1[i][j] is 0 or 1.
7.img2[i][j] is 0 or 1.
*/

public class ImageOverlap {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int row = img1.length, col = img1[0].length, answer = 0;
        int R = row*3, C = col*3;
        int[][] arr = new int[R][C];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[row+i][col+j] = img2[i][j];
            }
        }
        
        for(int i=0; i<=R-row; i++){
            for(int j=0; j<=C-col; j++){
                int count = 0;
                for(int r=i; r<i+row; r++){
                    for(int c=j; c<j+col; c++){
                        if(arr[r][c] == img1[r-i][c-j] && arr[r][c] == 1) count++;
                    }
                }
                
                answer = Math.max(count, answer);
            }
        }
        
        return answer;
    }
}
