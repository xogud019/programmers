package CodingTest.LeetCode.Math.Easy;

public class AddDigits {
    public int addDigits(int num) {
        while(num > 9){
            int temp = 0;
            
            while(num > 0){
                temp += num % 10;
                num /= 10;
            }
            
            num = temp;
        }
        
        return num;
    }
    /*
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
    */
}
