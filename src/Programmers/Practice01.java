package Programmers;

public class Practice01 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int absolutesLength = absolutes.length;
        int signsLength = signs.length;

        int sum = 0;
        for (int i = 0; i < absolutesLength; i++) {
            int absolute = absolutes[i];
            if (signs[i]) {
                sum += absolute;
            } else {
                sum -= absolute;
            }
        }
        answer = sum;

        return answer;

    }
}