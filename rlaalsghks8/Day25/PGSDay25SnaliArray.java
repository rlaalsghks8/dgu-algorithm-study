public class PGSDay25SnaliArray {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 1; //대입하는 수
        int rowStart = 0; //열 시작
        int rowEnd = n - 1; //열 끝
        int colStart = 0;  //행 시작
        int colEnd = n - 1;  //행 끝

        while (num <= n * n) {
            
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = num++;
            }
            rowStart++; 

            
            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = num++;
            }
            colEnd--; 

           
            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = num++;
            }
            rowEnd--; 
            
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = num++;
            }
            colStart++; 
        }

        return answer;
    }
}
