package CodingTest.Programmers.level3;


public class Origami {
    static int[] newP;
    public static void main(String[] args){
        int n = 1;
        int[] result = solution(n);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] solution(int n){
        int[] paper = {0};
        if(n==1){
            return paper;
        }
        dfs(paper, 0, n);
        return newP;
    }  

    public static void dfs(int[] paper,int depth, int max){
        newP = new int[paper.length*2+1];

        for(int i=0; i<paper.length; i++){
            newP[i] = paper[i];
        }

        newP[paper.length] = 0;
        int index=2;
        for(int i=paper.length+1; i<paper.length*2+1; i++){
            if(newP[i-index]==1){
                newP[i]=0;
                index+=2;
            }
            else if(newP[i-index]==0){
                newP[i]=1;
                index+=2;
            }
        }
        
        if(depth==max-2){
            paper = newP;
            return;
        }
        else{
            dfs(newP, depth+1, max);
        }
        
    }

    public static void reverse(int[] paper){
        for(int i=0; i<paper.length; i++){
            if(paper[i]==1){
                paper[i]=0;
            }
            else{
                paper[i]=1;
            }
        }
    }
}