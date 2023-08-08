public class PGSDay20StrVsStr {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int result1 = 0;
        int result2 = 0;
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        if(arr1Len<arr2Len){
            answer = -1;
        }
        else if(arr1Len>arr2Len){
            answer = 1;
        }
        else{
            for(int i=0; i<arr1.length; i++){
                result1 += arr1[i];
                result2 += arr2[i];
            }
            if(result1>result2){
                answer = 1;
            }
            else if(result1<result2){
                answer = -1;
            }
        }
        
        
        return answer;
    }
}
