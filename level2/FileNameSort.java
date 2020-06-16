package level2;

public class FileNameSort {
    public static void main(String[] args){
        String[] files ={"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        String[] result = solution(files);

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static String[] solution(String[] files) {
        String[] answer = {};
        String head ="";
        String num ="";
        String tail ="";

        for(int i=0; i<files[0].length(); i++){
            if(Character.isDigit(files[0].charAt(i))){
                num +=""+files[0].charAt(i);
            }
        }
        return answer;
    }
}