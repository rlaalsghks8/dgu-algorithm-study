import java.util.Arrays;

public class PGSDay22FoundZehlen {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
            if(Arrays.stream(num_list).anyMatch(i -> i == n)){
                answer = 1;
            }
            else{
                answer = 0;
            }
            
           
        
        return answer;
    }
}
