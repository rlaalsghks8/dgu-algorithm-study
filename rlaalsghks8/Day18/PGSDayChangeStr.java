public class PGSDayChangeStr {
    public int solution(String myString, String pat) {
        int answer = 0;
        String patCheck = "";
        
        for(int i=0; i<pat.length();i++){
            if(pat.charAt(i)=='A'){
                patCheck += 'B';
            }
            else if(pat.charAt(i)=='B'){
                patCheck +='A';
            }
        }
        
        if(myString.contains(patCheck)){
            answer = 1;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}
