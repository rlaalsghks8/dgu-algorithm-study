import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PGSDay21BackRank5Up{
    public List solution(int[] num_list) {
    
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(num_list);
        for (int i = 5; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}