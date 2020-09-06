package Hackers.JavaPrac;
import java.util.*;

public class StaticBlock {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = false;
    static{
        if(B<=0||H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } 
        else flag = true;
    }
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main
}