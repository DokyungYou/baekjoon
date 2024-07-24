import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        // 내림차순으로 세팅
        TreeMap<Integer, Integer> treemap = new TreeMap<>((o1, o2) -> {
            return Integer.compare(o2, o1);  // o1 < o2 ? 1 : o1 == o2 ? 0 : -1;
        });


        // 인덱스의 값을 key로 넣고 내림차순 정렬
        // value 에는 인덱스값
        for (int i = 0; i < emergency.length; i++) {
            treemap.put(emergency[i], i);
        }


        int order = 0;
        for(Map.Entry<Integer, Integer> entry : treemap.entrySet()){
            emergency[entry.getValue()] = ++order;
        }

        return emergency;
    }
}
