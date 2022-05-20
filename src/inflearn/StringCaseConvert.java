package inflearn;

import java.util.Scanner;

public class StringCaseConvert {
    // StuDY
    // 대문자는 65 ~ 90
    // 소문자는 97 ~ 122
    // a 와 A의 차이 97-65 = 32
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else{
//                answer += Character.toLowerCase(x);
//            }
            // 이러면 대문자
            if(x >= 65 && x <= 90) answer += Character.toLowerCase(x);
            else
                answer += Character.toUpperCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        StringCaseConvert T = new StringCaseConvert();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
