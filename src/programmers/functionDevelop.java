package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class functionDevelop {
    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            // 몇일 걸리는지 계산해서 큐에넣기
            queue.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1);
            // 7 3 9
        }
        List<Integer> result = new ArrayList<>();
        int prev = queue.poll(); // 7
        int cnt = 1;
        while(!queue.isEmpty()){
            int curr = queue.poll(); // 3
            if(prev >= curr){
                cnt++;
            }else{
                result.add(cnt);
                cnt = 1;
                prev = curr;
            }
        }
        result.add(cnt);
        int [] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int [] progresses = {93, 30, 55};
        int [] speeds = {1, 30, 5};
        for(int a : solution(progresses, speeds)){
            System.out.print(a + " ");
        }
    }
}
