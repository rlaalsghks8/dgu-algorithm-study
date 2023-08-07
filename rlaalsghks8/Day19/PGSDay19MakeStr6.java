import java.util.ArrayList;
import java.util.List;

public class PGSDay19MakeStr6 {
    public int[] solution(int[] arr) {
        
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {  //List가 비어있는지 확인(boolean값 반환)
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }

        if (stk.isEmpty()) {
            return new int[]{-1};   //정수형 배열 생성 후 반환
        }
        
        int[] answer = new int[stk.size()];
        for (int j = 0; j < stk.size(); j++) {
            answer[j] = stk.get(j);   //get()로 List에 있는 값을 answer에 대입
        }
        return answer;
    }
}

//이번 문제에서 포인트
// List(ArrayList)에서 get으로 각 인덱스에 있는 값을 가지고 오고
// 특정 배열을 return을 하려면 new int[]{-1}; 로 하면 됨