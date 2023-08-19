public class PGSDay22RemoveZero{
    public String solution(String n_str) {
        String answer = "";
        int startInd;
        
        for(int i=0; i<n_str.length();i++){
            if(n_str.charAt(i)!='0'){
                startInd = i;
                for(int k=startInd; k<n_str.length();k++){
                answer += n_str.charAt(k);
                }
                break;
            }
        }
       
        return answer;
    }
}