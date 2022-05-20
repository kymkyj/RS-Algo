package inflearn;

import java.util.Scanner;

public class StringSearchWord {
    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String [] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len>m){
                m=len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringSearchWord T = new StringSearchWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // 한줄을 입력받아야 함으로
        System.out.print(T.solution(str));
    }
}
