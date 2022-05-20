package inflearn;

import java.util.Locale;
import java.util.Scanner;

public class CharSearch {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char x : str.toCharArray()){
            if(x == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        CharSearch T = new CharSearch();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
