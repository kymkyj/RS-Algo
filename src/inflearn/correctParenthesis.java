package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 올바른 괄호
public class correctParenthesis {
    public static String Solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            }else{
                // 닫는괄호가 왔을 때 비어있는지 한번 물어봄
                // 여는괄호 < 닫는괄호가 많을 경우
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        // 여는괄호 > 닫는괄호가 많은 경우
        if(!stack.isEmpty()) return "NO";
        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Solution(str));
    }
}
