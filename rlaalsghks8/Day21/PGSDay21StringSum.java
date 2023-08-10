public class PGSDay21StringSum {
    public int solution(String num_str) {
        int answer = 0;
        String[] numstr_str = num_str.split("");
        int[] intArray = new int[numstr_str.length];
        
        for(int i=0; i<numstr_str.length; i++){
            intArray[i] = Integer.valueOf(numstr_str[i]);
            answer += intArray[i];
        }
        return answer;
    }
}
