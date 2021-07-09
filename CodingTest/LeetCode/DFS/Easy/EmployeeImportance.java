package CodingTest.LeetCode.DFS.Easy;

import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        int answer = 0;
        
        for(Employee emp : employees){
            if(emp.id==id){
                answer += emp.importance;
                
                for(int sub:emp.subordinates){
                    answer += getImportance(employees, sub);
                }
            }
        }
        
        return answer;
    }
}
