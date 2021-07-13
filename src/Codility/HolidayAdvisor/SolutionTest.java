package Codility.HolidayAdvisor;

import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void test() {
        int solution = this.solution.solution(new int[]{1, 1, 2, 2, 1, 2, 2, 4, 3, 1, 2});
        System.out.println("result " + solution);
        System.out.println("*************");
        solution = this.solution.solution(new int[]{2, 1, 1, 3, 2, 1, 1, 3});
        System.out.println("result " + solution);
        System.out.println("*************");
        solution = this.solution.solution(new int[]{7, 5, 2, 7, 2, 7, 4, 7});
        System.out.println("result " + solution);
        System.out.println("*************");

    }
}
