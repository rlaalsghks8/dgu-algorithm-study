import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PGSDay18SplitStr{
    public String[] solution(String myString) {
        
        String[] splitArr = myString.split("x");
        List<String> answer = new ArrayList<>();
        
        for (String str : splitArr) {
            if (!str.isEmpty()) {
                answer.add(str);
            }
        }
        
        String[] resultArr = answer.toArray(new String[answer.size()]);
        Arrays.sort(resultArr);
     
        return resultArr;
    }
}