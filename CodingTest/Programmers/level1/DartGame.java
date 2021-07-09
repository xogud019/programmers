package CodingTest.Programmers.level1;

public class DartGame{
    public static void main(String[] args){
        String dartResult = "10D#10S*10S*";
        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult){
        int answer = 0, count = 0, index = 0;
        int starCount=0;
        for(int i=0; i<dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                count++;
            }
        }
        String[] temp = new String[count];

        for(int i=0; i<temp.length; i++){
            temp[i]="";
        }
        int[] oper = new int[temp.length];
        for(int i=0; i<dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))==true){
                temp[index]+=dartResult.charAt(i);
            }
            else{
                if(i+1<dartResult.length()){
                    if(Character.isDigit(dartResult.charAt(i))==false&&Character.isDigit(dartResult.charAt(i+1))==true){
                        temp[index]+=dartResult.charAt(i);
                        index++;
                    }
                    else{
                        temp[index]+=dartResult.charAt(i);
                    }
                }
                else{
                    temp[index]+=dartResult.charAt(i);
                }
            }
            if(dartResult.charAt(i)=='*'){
                starCount++;
            }
        }
        /*
        for(int i=0; i<temp.length; i++){
            System.out.println(temp[i]);
        }
        */

        for(int i=0; i<temp.length; i++){
            int tempNum=0;
            for(int j=0; j<temp[i].length(); j++){
                if(Character.isDigit(temp[i].charAt(j))==true){
                    if(Character.isDigit(temp[i].charAt(j+1))==true){
                        tempNum = Integer.parseInt(temp[i].substring(j, j+2));
                        //System.out.println(tempNum);
                        j++;
                    }
                    else{
                        tempNum = temp[i].charAt(j)-'0';
                        //System.out.println(tempNum);

                    }
                }
                else{
                    if(temp[i].charAt(j)=='S'){
                        tempNum*=1;
                    }
                    else if(temp[i].charAt(j)=='D'){
                        tempNum = tempNum*tempNum;
                    }
                    else if(temp[i].charAt(j)=='T'){
                        tempNum = tempNum*tempNum*tempNum;
                    }
                    else if(temp[i].charAt(j)=='*'){
                        if(i==0){
                            if(starCount==2){
                                System.out.println(tempNum+"aa");
                                tempNum = tempNum*2;
                                starCount=1;
                                System.out.println(tempNum+"aa");

                            }
                            else{
                                tempNum*=2;
                            }
                        }
                        else{
                            if(starCount==2){
                                tempNum = tempNum*2;
                                oper[i-1]*=2;
                                starCount=1;
                            }
                            else{
                                tempNum*=2;
                                oper[i-1]*=2;
                            }
                        }
                        
                    }
                    else if(temp[i].charAt(j)=='#'){
                        tempNum *=-1;
                    }
                }
            }
            oper[i]=tempNum;
        }

        for(int i =0; i<oper.length; i++){
            System.out.println(oper[i]);
            answer+=oper[i];
        }
        return answer;
    }
}