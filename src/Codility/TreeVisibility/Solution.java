package Codility.TreeVisibility;

public class Solution {

    public class Tree {

        public int x;
        public Tree l;
        public Tree r;
    }

    public int answer = 0;

    public int solution(Tree T) {

        if (T == null) {
            return 0;
        }
        
        dfs(T, -100001);
        return answer;
    }

    public void dfs(Tree T, int value) {

        if (T.x >= value) {
            answer++;
        }
        if (T.l != null) {
            dfs(T.l, Math.max(value, T.x));
        }
        if (T.r != null) {
            dfs(T.r, Math.max(value, T.x));
        }
    }
}
