package CodingTest.Programmers.level3;


public class WordTrans {
    static int answer;
    public static void main(String[] args){
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot","dot","dog","lot","log","cog"};
        
        System.out.println(solution(begin, target, words));
    }

    public static int solution(String begin, String target, String[] words) {
        answer = 51;
        boolean[] visited =new boolean[words.length];
        int count=0;
        for(int i=0; i<words.length; i++){
            if(target.equals(words[i])){
                count++;
            }
        }
        if(count==0){
            return 0;
        }
        else{
            dfs(words, visited, begin, target, 0, words.length);
            return answer;
        }
    }

    public static void dfs(String[] words, boolean[] visited,String begin, String target, int depth, int max){
        if(begin.equals(target)){
            if(answer>depth){
                answer = depth;
                return;
            }
            return;
        }

        for(int i=0; i<words.length; i++){
            if(visited[i]){
                continue;
            }
            
            if(wordCheck(begin, words[i])){
                visited[i] = !visited[i];
                dfs(words, visited, words[i], target, depth+1, max);
                visited[i] = !visited[i];
            }
        }
    }

    public static boolean wordCheck(String s1, String s2){
        int count =0;
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        
        return count>1?false:true;
    }
}