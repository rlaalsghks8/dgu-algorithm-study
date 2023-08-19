import java.util.HashSet;

public class PGSLv1PocketMon{
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> pocketmonList = new HashSet<>();
        
        for(int i=0; i<nums.length;i++){
            pocketmonList.add(nums[i]);
        }
         answer = pocketmonList.size();
        if(nums.length/2<pocketmonList.size()){
            answer = nums.length/2;
        }
        
        
        
        return answer;
    }
}