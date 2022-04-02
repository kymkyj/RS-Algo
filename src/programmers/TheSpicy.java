package programmers;

import java.util.PriorityQueue;

public class TheSpicy {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        while (pq.peek() < K) {
            if (pq.size() < 2) { // 스코빌 지수를 만들 수 없는 경우
                return -1;
            }
            int food1 = pq.poll();
            int food2 = pq.poll();
            pq.add(food1 + 2 * food2);

            answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int [] scoville = {1,2,3,9,10,12};
        int K = 7;
        System.out.println(solution(scoville, K));
    }
}
