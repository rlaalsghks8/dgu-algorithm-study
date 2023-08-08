public class PGSDay20BindingStr {
    public int solution(String[] strArr) {
        int answer = 0;
        int maxLen = strArr[0].length();
        int checkLen=0;
        for(int l=1; l<strArr.length; l++){
            if(strArr[l].length()>maxLen){
                maxLen = strArr[l].length();
            }
            checkLen = maxLen+1;
        }
        
        int check[] = new int[checkLen];
        for(int i=0; i<strArr.length; i++){
            int k = strArr[i].length();
            check[k]++;
        }
        
        
        int max = check[0];
        for(int j=1; j<check.length;j++){
            if(check[j]>max){
                max=check[j];
            }
            answer = max;
        }
        
        
        
        return answer;
    }
}
