package level2;

public class SkillTree {
    public static void main(String[] args){
        String skill = "CBD";
        String[] skill_trees={"CEFD","sd","wd"};
        System.out.println(solution(skill, skill_trees));
        
    }

    public static int solution(String skill, String[] skill_trees){
        int answer= 0;
        int index =0;
        int sIndex =0;
        while(index<skill_trees.length){
            for(int i=0; i<skill_trees[index].length(); i++){
                if(skill.indexOf(skill_trees[index].charAt(i))>0&&sIndex==0){
                    break;
                }
                else{
                    if(skill_trees[index].charAt(i)==skill.charAt(sIndex)){
                        sIndex++;
                    }
                    else{
                        if(skill.indexOf(skill_trees[index].charAt(i))>0){
                            break;
                        }
                    }
                }

                if(sIndex==skill.length()||i==skill_trees[index].length()-1){
                    answer++;
                    break;
                }
            }
            index++;
            sIndex=0;
        }
        return answer;
    }
}