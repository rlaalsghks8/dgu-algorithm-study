public class PGSDay24ChangeTol {
    public String solution(String myString) {
        String answer = "";
        
        answer = myString;
        
        for(int i=0; i<myString.length();i++){
            if(myString.charAt(i)<'l'){
                answer = answer.replace(myString.charAt(i),'l');
            }
        }
        
        return answer;
    }
}
