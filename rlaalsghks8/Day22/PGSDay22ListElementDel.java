import java.util.ArrayList;
import java.util.List;

public class PGSDay22ListElementDel {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
         for (int element : arr) {
            answer.add(element);
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    answer.remove(Integer.valueOf(arr[i]));
                    break;
                }
            }
            
        }
        return answer;
    }
}
