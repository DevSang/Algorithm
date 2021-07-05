package Codility.LargestEvenSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int solution(int[] A, int K) {

        int maxSum = 0;
        List<Integer> evenNums = new ArrayList<>(A.length);
        List<Integer> oddNums = new ArrayList<>(A.length);
        for (int num : A) {
            if (num % 2 == 1) {
                oddNums.add(num);
            } else {
                evenNums.add(num);
            }
        }
        Collections.sort(evenNums);
        Collections.sort(oddNums);
        int i = evenNums.size() - 1;
        int j = oddNums.size() - 1;

        if (K > A.length || (K % 2 == 0 && i == 0 && j == 0)) {
            return -1;
        }

        while (K > 0) {
            if (K % 2 == 1) {
                if (i >= 0) {
                    maxSum += evenNums.get(i);
                    i--;
                } else {
                    return -1;
                }
                K--;
            } else if (i >= 1 && j >= 1) {
                if (evenNums.get(i) + evenNums.get(i - 1)
                    <= oddNums.get(j) + oddNums.get(j - 1)) {
                    maxSum += oddNums.get(j) + oddNums.get(j - 1);
                    j -= 2;
                } else {
                    maxSum += evenNums.get(i) + evenNums.get(i - 1);
                    i -= 2;
                }
                K -= 2;
            } else if (i >= 1) {
                maxSum += evenNums.get(i) + evenNums.get(i - 1);
                i -= 2;
                K -= 2;
            } else if (j >= 1) {
                maxSum += oddNums.get(j) + oddNums.get(j - 1);
                j -= 2;
                K -= 2;
            }
        }

        return maxSum;
    }
}
