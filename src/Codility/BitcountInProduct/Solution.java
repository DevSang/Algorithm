package Codility.BitcountInProduct;

public class Solution {

    public int solution(int A, int B) {
        return (int) Integer.toBinaryString(A * B).chars().filter(x -> x == '1').count();
    }
}
