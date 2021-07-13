package Codility.HolidayAdvisor;

import java.util.HashMap;

public class Solution {

    public class Distance {

        int value;
        int count;
    }

    public int solution(int A[]) {
        HashMap<Integer, Integer> mapWithNoDuplicated = new HashMap<Integer, Integer>();
        for (int j = 0; j < A.length; j++) {
            mapWithNoDuplicated.put(A[j], j);
        }

        HashMap<Integer, Distance> distanceMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                Distance distance = new Distance();
                distance.value = A[i];
                distance.count = i;
                distanceMap.put(i, );
            }
        }
        System.out.println(distanceMap.keySet());
        System.out.println(distanceMap.entrySet());

        int count = 0;
        HashMap<Integer, Integer> locationMap = new HashMap<>();
        for (int i = 0; i < distanceMap.size(); i++) {
            if () {
                if (locationMap.size() != mapWithNoDuplicated.size()) {
                    locationMap.put()
                }
            }
        }

        for (int j = 0; j < A.length; j++) {
            if (locationMap.keySet().size() == uniqueValues.keySet().size()) {
                return answer;
            } else {
                if (locationMap.get(A[j]) == null) {
                    locationMap.put(A[j], )
                }
//                }
            }

            return 0;
        }
    }
