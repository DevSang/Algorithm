package Codility.LastBoundedElement;

import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void test() {
        int solution = this.solution.solution(0);
        System.out.println("result " + solution);
        System.out.println("*************");
        solution = this.solution.solution(1);
        System.out.println("result " + solution);
        System.out.println("*************");
        solution = this.solution.solution(17);
        System.out.println("result " + solution);
        System.out.println("*************");

    }
}
