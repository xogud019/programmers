package CodingTest.LeetCode.Math.Easy;

public class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] || rec2[0] == rec2[2] || rec2[1] == rec2[3]) return false;
        //r1 left = 0 right = 
        return rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec1[2] > rec2[0] && rec1[3] > rec2[1]; 
    }
}
