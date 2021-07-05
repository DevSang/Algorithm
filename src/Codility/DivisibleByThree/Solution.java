package Codility.DivisibleByThree;

/**
 * 방법은 현재 숫자 합을 total이라고 하면, 각 자리를 0,1,2 .. 9로 바꿔가면서 total을 체크하면 되는데요,  바뀐 숫자num - 각자리숫자s[i] 의 차이를 diff라고 하면 total + diff가 3의 배수인지
 * 체크하면 돼요
 */

public class Solution {

    public int solution(String S) {
        int ans = 0;
        String[] numbers = S.split("");
        int[] diff = new int[numbers.length - 1];
        int current = Integer.parseInt(S);
        int total = 0;

        while (current != 0) {
            total += current % 10;
            current /= 10;
        }

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            int remain = (total - num) % 3;
            if (remain == 0) {
                ans += 4;
            } else {
                ans += 3;
            }
            if ((remain + num) % 3 == 0) {
                ans -= 1;
            }
            if (total - num == 0) {
                ans -= 1;
            }
        }
        if (total % 3 == 0) {
            ans += 1;
        }
        return ans;
    }
}
