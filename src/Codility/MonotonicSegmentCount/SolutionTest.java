package Codility.MonotonicSegmentCount;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    Solution solution = new Solution();

    static List<int[]> provider() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{});
        list.add(new int[]{1, 2});
        list.add(new int[]{1, 4, 2, 3, 3, 5, 6, 7, 7, 9});
        list.add(new int[]{1, 2, 4, 7, 6, 6, 6, 2, 0});
        return list;
    }

    @ParameterizedTest
    @MethodSource("provider")
    void test(int[] value) {

        int solution = this.solution.solution(value);
        System.out.println("result " + solution);
        System.out.println("****");


    }
}
