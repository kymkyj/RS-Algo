package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 전화번호 목록
public class PhoneBook {
    public static boolean solution(String[] phone_book) {
        Boolean answer = true;
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }
}
