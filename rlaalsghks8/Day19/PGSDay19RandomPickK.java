import java.util.ArrayList;
import java.util.List;

public class PGSDay19RandomPickK {
    public List solution(int[] arr, int k) {
       
        List<Integer> answer = new ArrayList<>();
        
       
           
                for(int j=0; j<arr.length;j++){
                    if(answer.size()==k){
                        break;
                    } 
                    else if(!answer.contains(arr[j])){
                        answer.add(arr[j]);
                        continue;
                     }
                    else if(answer.contains(arr[j])){
                        continue;
                    }
                 }
                for(int i=0; i<k; i++){
                    if(answer.size()<k){
                        answer.add(-1);
                    }
                }
        
        
        
        return answer;
    }
}
