function solution(s) {
    var count = 0;
    var answer = "";
    
    for(var i=0; i<s.length; ++i){
        if(s[i]==" "){
            answer += " ";
            count = 0;
            continue;
        }    
        
        if(count%2==0) answer += s[i].toUpperCase();
        else answer += s[i].toLowerCase();
        
        count++;
    }
    
    return answer;
}