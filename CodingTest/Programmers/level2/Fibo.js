function solution(n){
    var fibo = [0,1];
    for(var i=2; i<=n; i++){
        fibo.push((fibo[i-2]+fibo[i-1])%1234567);
    }

    return fibo[n];
}