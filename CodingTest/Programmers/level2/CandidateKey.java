package CodingTest.Programmers.level2;

import java.util.*;

public class CandidateKey {
    public static void main(String[] args){
        String[][] relation = {{"100","ryan","music","2"},
                               {"200","apeach","math","2"},
                               {"300","tube","computer","3"},
                               {"400","con","computer","4"},
                               {"500","muzi","music","3"},
                               {"600","apeach","music","2"}};
        System.out.println(solution(relation));
    }    

    public static int solution(String[][] relation){
        Set<String> tuple = new HashSet<>();
        Set<Integer> atr = new HashSet<>();
        
        //System.out.println(2<<relation[0].length);
        for(int i=0; i<1<<relation[0].length; i++){ 
            tuple.clear();  
            for(int k=0; k<relation.length; k++){
                String data = "";

                for(int j=0; j<relation[0].length; j++){
                    if((i&(1<<j))!=0){
                        data+=relation[k][j];
                    }
                }
                //System.out.println(data);
                tuple.add(data);
            }
            if(tuple.size()==relation.length){
                //System.out.println(i);
                addKey(atr,i);
            }
        }
        return atr.size();
    }

    public static void addKey(Set<Integer> atr, int i){
        for(int k : atr){
            if((k&i)==k){
                System.out.println(i);
                return;
            }
        }
        atr.add(i);
    }
}

//powerset basic logic
/*
for(int i=0; i<1<<arr.length; i++){
    for(int j=0; j<arr.length; j++){
        if((i&1<<j)!=0){
            System.out.println(arr[j]);
        }
    }
    System.out.println();
}
*/