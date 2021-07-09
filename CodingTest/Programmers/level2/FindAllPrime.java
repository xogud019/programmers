package CodingTest.Programmers.level2;

import java.util.*;

public class FindAllPrime {
    public static void main(String[] args){
        String numbers = "011";
        System.out.println(solution(numbers));
    }

    public static int solution(String numbers){
        String[] arr = numbers.split("");
        List<Integer> list = new ArrayList<>();
        String s = "";
        int maxNum = 0;
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            s+=arr[i];
        }

        maxNum = Integer.parseInt(s);
        int[] primeArr = new int[maxNum+1];

        for(int i=2; i<=maxNum; i++){
            for(int j=i*2; j<=maxNum; j+=i){
                primeArr[j]=1;
            }
        }
        //System.out.println(maxNum);
        //System.out.println(isPrime(3));
        for(int i=2; i<=maxNum; i++){
            boolean isP = true;
            if(primeArr[i]==0){
                String[] iArr = Integer.toString(i).split("");
                for(int j=0; j<iArr.length; j++){
                    if(!numbers.contains(iArr[j])){
                        isP = false;
                        break;
                    }
                }

                StringBuilder temp = new StringBuilder(numbers);
                for(int k =0; k<iArr.length; k++){
                    int idx = temp.indexOf(iArr[k]);
                    if(idx == -1){
                        isP = false;
                        break;
                    }
                    else{
                        temp.setCharAt(idx, '*');
                    }
                }

                if(isP){
                    list.add(i);
                }
            }
            else continue;
        }
        /*
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        */
        return list.size();
    }
}