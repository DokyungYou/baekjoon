import java.util.ArrayDeque;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {
            deque.add(numbers[i]);
        }

        if(direction.equals("right")){
            int item= deque.removeLast();
            deque.addFirst(item);
        }else{
            int item = deque.removeFirst();
            deque.addLast(item);
        }
        Integer[] num =deque.toArray(new Integer[0]);

        for (int i = 0; i < num.length; i++) {
            answer[i]=num[i];
        }

        return answer;
    }
}