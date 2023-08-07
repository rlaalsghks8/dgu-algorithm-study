public class PGSDay18SplitX{
    public int[] solution(String myString) {
        String[] result = myString.split("x",myString.length());
        //배열의 크기를 myString.length로 한정
        int[] answer = new int[result.length];
        for(int i=0; i<result.length; i++)
            answer[i] = result[i].length();
        
        return answer;
    }
}