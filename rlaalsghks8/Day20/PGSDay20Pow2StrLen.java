public class PGSDay20Pow2StrLen{
    public int[] solution(int[] arr) {
        int arrLen = arr.length;
        while(arrLen%2 == 0) {
            arrLen = arrLen/2;
        }
        if(arrLen == 1) {
            return arr;
        }
        //2의 거듭제곱이 아닌 
        double x = 0;
        int y = 0;
        int len = arr.length;
        
        while(len > x) {
            x = Math.pow(2, y++);
        }
        int[] answer = new int[(int)x];
        
        for(int i = 0; i< arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}