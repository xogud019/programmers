package Programmers.level3;


public class Palindrome {
    public static void main(String[] args){
        String s= "axabcbaba";
        
        System.out.println(solution(s));
    }

    public static int solution(String s){
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            int idx = 0;
            int idy = 0;

            for(int j=s.length()-1; j>=0; j--){
                boolean isT = true;
                int temp = 0;
                if(i>j){
                    continue;
                }

                if(Math.abs(i-j)<answer){
                    continue;
                }
                
                if(s.charAt(i)==s.charAt(j)){
                    idy = j;
                    idx = i;

                    while(true){
                        if(idx==idy){
                            temp++;
                            break;
                        }
                        if(idx>idy){
                            break;
                        }
                        if(s.charAt(idx)==s.charAt(idy)){
                            temp+=2;
                            idx++;
                            idy--;
                        }
                        else{
                            isT = false;
                            break;
                        }
                    }

                    if(isT&&temp>answer){
                        answer = temp;
                    }
                }
            }
        }
        return answer;
    }
    /*failed case2 -> time out
    public static int solution(String s){
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sub = s.substring(i, j);
                String obj = new StringBuffer(sub).reverse().toString();

                if(sub.equals(obj)&&sub.length()>answer){
                    answer= sub.length();
                }
            }
        }
        return answer;
    }
    */
    /*failed case1 counter case ->axabcbaba
    public static int solution(String s){
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            int idy = 0;
            int idx = 0;
            for(int j=s.length()-1; j>=0; j--){
                if(s.charAt(i)==s.charAt(j)){
                    idy = j;
                    idx = i;
                    break;
                }
                if(i==j){
                    continue;
                }
            }

            int temp = 0;
            while(true){
                System.out.println(idx+","+idy);
                if(idx>idy){
                    break;
                }
                if(idx==idy){
                    temp+=1;
                    break;
                }
                if(s.charAt(idx)==s.charAt(idy)){
                    idx++;
                    idy--;
                    temp+=2;
                    System.out.println(idx+","+idy);

                }
                else{
                    break;
                }   
            }
            System.out.println(temp);
            if(temp>answer){
                answer = temp;
            }
        }
        return answer;
    }
    */
}