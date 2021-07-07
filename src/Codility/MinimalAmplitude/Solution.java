package Codility.MinimalAmplitude;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    // Function to find the minimum
    // different in the subAays
    // of size K in the Aay
    static int findKMin(int A[], int n, int K) {
        // Create a Double Ended Queue, Qi
        // that will store indexes
        // of Aay elements, queue will
        // store indexes of useful elements
        // in every window
        Deque<Integer> Qi = new LinkedList<>();

        // Process first K (or first window)
        // elements of Aay
        int i;
        for (i = 0; i < K; ++i) {

            // For every element,
            // the previous smaller elements
            // are useless so remove them from Qi
            while ((!Qi.isEmpty()) &&
                A[i] >= A[Qi.peekLast()])

            // Remove from rear
            {
                Qi.pollLast();
            }

            // Add new element at rear of queue
            Qi.addLast(i);
        }

        int minDiff = Integer.MAX_VALUE;

        // Process rest of the elements,
        // i.e., from A[k] to A[n-1]
        for (; i < n; ++i) {

            // The element at the front
            // of the queue is the largest
            //  element of previous window
            minDiff = Math.min(minDiff,
                A[Qi.peekFirst()]);

            // Remove the elements
            // which are out of this window
            while ((!Qi.isEmpty()) &&
                Qi.peekFirst() <= i - K) {
                Qi.pollFirst();
            }

            // Remove all elements smaller
            // than the currently being
            // added element (remove useless elements)
            while ((!Qi.isEmpty()) &&
                A[i] >= A[Qi.peekLast()]) {
                Qi.pollLast();
            }

            // Add current element
            // at the rear of Qi
            Qi.addLast(i);
        }

        // Compare the maximum
        // element of last window
        minDiff = Math.min(minDiff,
            A[Qi.peekFirst()]);
        return minDiff;
    }

    // Function to find the minimum
    // of the maximum difference of the
    // adjacent elements after removing
    // K elements from the Aay
    public int solution(int[] A, int K) {
        int n = A.length;
        // Create the difference Aay
        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = A[i + 1] - A[i];
        }

        // find minimum of all maximum
        // of subAay sizes n - K - 1
        int answer = findKMin(diff, n - 1, n - K - 1);
        return answer;
    }
}
