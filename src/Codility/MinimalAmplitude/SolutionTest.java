package Codility.MinimalAmplitude;

import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void test() {

        int solution = this.solution.solution(new int[]{5, 3, 6, 1, 3}, 2);
        System.out.println("result " + solution);
        System.out.println("****");
        solution = this.solution.solution(new int[]{3, 5, 1, 3, 9, 8}, 4);
        System.out.println("result " + solution);
        System.out.println("****");


    }
}
