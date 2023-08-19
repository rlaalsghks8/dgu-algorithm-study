import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class PGSLv1NonFinishPlayer {
     public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> checkList = new HashMap<>();
        for (String player : participant) 
            checkList.put(player, checkList.getOrDefault(player, 0) + 1);
            /**
             * getOrDefault(Object key, V DefaultValue)
             * 매개 변수 : 이 메서드는 두 개의 매개 변수를 허용합니다.
             * key : key의 값을 가져와야 하는 요소의 키입니다.
             * defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.
             * 반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환됩니다.
             */

        for (String player : completion) 
            checkList.put(player, checkList.get(player) - 1);

            Iterator<Map.Entry<String, Integer>> iter = checkList.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        /**
         * 1) hasNext(): 다음 요소에 읽어 올 요소가 있는지 확인 하는 메소드 있으면 true, 없으면 false 를 반환한다.
         * 2) next(): 다음 요소를 가져온다. 
         * 3) remove(): next()로 읽어온 요소를 삭제한다.
         */

        return answer;
}
}
