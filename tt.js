solution('abs');

function solution(s) {
    var stringL = s.length;
    if((stringL % 2)== 0) {
        var i = stringL / 2;
        return s[i-1], s[i];
    } else {
        var j =stringL / 2;
        return s[j];
    }
}