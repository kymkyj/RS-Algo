package programmers;

import java.util.Arrays;

// 완주하지 못한 선수
public class NoClearPlayer {
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for(; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
               return participant[i];
            }
        }
        return participant[i];
    }

    public static void main(String[] args) {
        String [] participant = {"leo", "kiki", "eden"};
        String [] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }
}
