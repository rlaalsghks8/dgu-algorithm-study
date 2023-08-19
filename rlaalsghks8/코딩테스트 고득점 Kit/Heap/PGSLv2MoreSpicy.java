import java.util.PriorityQueue;

public class PGSLv2MoreSpicy{
    public int solution(int[] scoville, int K) {
        
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int food : scoville){
            pq.offer(food);
        }
        
        
        while(!pq.isEmpty()) {
            
            if (pq.size() == 1) {
                if (pq.peek() >= K) { 
                    return answer;
                } else { 
                    return -1;
                }
            }
            
            
            if (pq.peek() >= K) {
                return answer;
            } else {
                int firstLow = pq.poll(); 
                int secondLow = pq.poll(); 

                int result = firstLow + (secondLow * 2);

                pq.offer(result);

                answer++;
            }
        }

        return answer;
    }
}