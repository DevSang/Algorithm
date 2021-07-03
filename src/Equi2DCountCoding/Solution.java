package Equi2DCountCoding;

public class Solution {

  public int solution(int[][] A) {
    int[] sumRowArr = sumRow(A);
    int[] sumColumnArr = sumColumn(A);

    int equilRowCount = checkRow(sumRowArr);
    int equilColumnCount = checkRow(sumColumnArr);

    return equilRowCount * equilColumnCount;
  }

  //Row 합
  public int[] sumRow(int[][] A) {
    int[] sumRowArr = new int[A.length];
    int tempSum = 0;
    int tempPosition = 0;
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[0].length; j++) {
        tempSum += A[i][j];
      }
      sumRowArr[tempPosition++] = tempSum;
      tempSum = 0;
    }
    return sumRowArr;
  }

  //Column 합
  public int[] sumColumn(int[][] A) {
    int[] sumColumnArr = new int[A[0].length];
    int tempSum = 0;
    int tempPosition = 0;
    for (int i = 0; i < A[0].length; i++) {
      for (int j = 0; j < A.length; j++) {
        tempSum += A[j][i];
      }
      sumColumnArr[tempPosition++] = tempSum;
      tempSum = 0;
    }

    return sumColumnArr;
  }

  // 평행 검사
  public int checkRow(int[] arr) {
    int equilCount = 0;

    for (int i = 0; i < arr.length; i++) {
      int firstPartSum = 0;
      int secondPartSum = 0;

      for (int j = 0; j < i; j++) { // 첫부분 배열 합
        firstPartSum += arr[j];
      }

      for (int k = i + 1; k < arr.length; k++) { // 두번째 부분 배열 합
        secondPartSum += arr[k];
      }

      if (firstPartSum == secondPartSum) {
        equilCount++;
      }
    }
    return equilCount;
  }
}
