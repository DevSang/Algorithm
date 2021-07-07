package Codility.MonotonicSegmentCount;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int[] A) {

        List<Integer> segementArray = new ArrayList<>(A.length);
        int diff = 0;
        int count = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > 1000000) {
                return -1;
            }
            int newDiff = A[i] - A[i - 1];
            if (newDiff * diff < 0
                || (newDiff * diff == 0 && i != 1 && (newDiff != 0 || diff != 0))) {
                segementArray.add(count);
                count = 1;
            }
            if (i == A.length - 1) {
                segementArray.add(count + 1);
            }
            count++;
            diff = newDiff;
        }

        int ans = 0;
        for (int segement : segementArray) {
            ans += sum(segement);
        }

        if (ans > 1000000) {
            return -1;
        }

        return ans;
    }

    public int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num * (num - 1) / 2;
    }

}
