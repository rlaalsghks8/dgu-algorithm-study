public class PGSDay18RNY_Str {
    public String solution(String rny_string) {
        String answer = "";
        
        for(int i=0; i<rny_string.length(); i++){
            if('m'==rny_string.charAt(i)){
                answer += 'r';
                answer += 'n';
            }else{
            answer +=rny_string.charAt(i);
            }
        }
        
        
        
        return answer;
    }
}
