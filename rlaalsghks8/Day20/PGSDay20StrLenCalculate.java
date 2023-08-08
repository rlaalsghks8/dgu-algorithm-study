public class PGSDay20StrLenCalculate {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        int flag =0;
        if(arr.length%2==1){
            flag = 1;
        }
        else{
            flag = 0;
        }
        if(flag==1){
            for(int i=0; i<arr.length;i+=2){
                arr[i]+=n;
            }
        }
        if(flag==0){
            for(int i=1; i<arr.length;i+=2){
                arr[i]+=n;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}
