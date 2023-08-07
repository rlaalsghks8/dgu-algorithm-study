public class PGSDay18SimpleCalculate {
    public int solution(String binomial) {
        int answer = 0;
         String[]splArr = binomial.split(" ");
         if (splArr[1].equals("-")) {
             answer = (Integer.parseInt(splArr[0]) - Integer.parseInt(splArr[2])); 
         }
         if (splArr[1].equals("+")) {
             answer = Integer.parseInt(splArr[0]) + Integer.parseInt(splArr[2]); 
         }
         if (splArr[1].equals("*")) {
             answer = Integer.parseInt(splArr[0]) * Integer.parseInt(splArr[2]); 
         }
         return answer;
 
     }
}
