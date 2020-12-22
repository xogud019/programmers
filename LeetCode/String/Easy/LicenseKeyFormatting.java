package LeetCode.String.Easy;
/*

*/
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        StringBuilder sb = new StringBuilder();
        S = S.replaceAll("-","");
        
        if(S.length() <=K) return S;
        
        if(S.length()%K == 0){
            int count = 0;
            
            for(int i=0; i<S.length(); i++){
                sb.append(S.charAt(i));
                count++;
                
                if(i==S.length()-1) break;
                if(count % K ==0) sb.append("-");
            }
            
            return sb.toString();
        }
        else{
            int res = S.length()%K;
            
            for(int i=0; i<res; i++){
                sb.append(S.charAt(i));
            }
            
            sb.append("-");
            int count = 0;
            
            for(int i=res; i<S.length(); i++){
                sb.append(S.charAt(i));
                count++;
                
                if(i==S.length()-1) break;
                if(count % K ==0) sb.append("-");
            }
            
            return sb.toString();
        }
    }
}
