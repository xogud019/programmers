package level2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SkillTree {
    public static void main(String[] args){
        String skill = "CBD";
        String[] skill_trees={"BACDE","CBADF","AECB","BDA"};
        System.out.println(solution(skill, skill_trees));
    }

    public static int solution(String skill, String[] skill_trees){
        int answer= 0;
        skill = "("+skill+")";
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(skill);
        Matcher matcher;
        for(int i=0; i<skill_trees.length; i++){
            matcher = pattern.matcher(skill_trees[i]);
            while(matcher.find()){
                list.add(matcher.group(0));
            }
        }

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        
        return answer;
    }
}