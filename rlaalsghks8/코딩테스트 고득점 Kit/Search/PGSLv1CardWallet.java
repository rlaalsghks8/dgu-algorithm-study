public class PGSLv1CardWallet{
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i=0; i<sizes.length;i++){
            int tmp1 = sizes[i][0];
            int tmp2 = sizes[i][1];
            int changeNum;
            if(tmp1<tmp2){
                changeNum = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = changeNum;
            }
        }
        int maxLength = sizes[0][0];
        int maxWidth = sizes[0][1];
        for(int j=1; j<sizes.length; j++){
        
            if(sizes[j][0]>maxLength){
                maxLength = sizes[j][0];
            }
            if(maxWidth<sizes[j][1]){
                maxWidth = sizes[j][1];
            }
            
            
        }
        answer = maxLength * maxWidth;
        return answer;
    }
}