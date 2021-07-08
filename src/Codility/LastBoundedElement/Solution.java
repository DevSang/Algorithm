package Codility.LastBoundedElement;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int N) {
        int index = 1;

        List<Integer> list = new ArrayList<>();
        list.add(0);

        if (1 >= N) {
            return N;
        }
        while (list.get(index - 1) < N) {
            list.add(list.get(index - 1) + index);
            index++;
        }
        ;

        return index - 2;
    }
}
