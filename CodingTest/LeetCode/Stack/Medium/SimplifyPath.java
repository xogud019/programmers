package CodingTest.LeetCode.Stack.Medium;
/*
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.

 

Example 1:

Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.
Example 2:

Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
Example 3:

Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
Example 4:

Input: path = "/a/./b/../../c/"
Output: "/c"
 

Constraints:
1.1 <= path.length <= 3000
2.path consists of English letters, digits, period '.', slash '/' or '_'.
3.path is a valid absolute Unix path.
*/
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        StringBuilder answer = new StringBuilder();
        Stack<String> stk = new Stack<>();
        
        while(path.contains("//")) path = path.replaceAll("//","/");
        
        if(path.charAt(path.length()-1)=='/') path = path.substring(0,path.length()-1);
        
        String[] arr = path.split("/");
        
        for(String s:arr){
            if(s.length() == 0||s.equals(".")) continue;
            if(s.equals("..")){
                if(!stk.isEmpty()) stk.pop();
                continue;
            }
            
            stk.push(s);
        }
        
        if(stk.isEmpty()) return "/";
        
        while(!stk.isEmpty()) answer.insert(0,"/"+stk.pop());
        
        return answer.toString();
    }
}
