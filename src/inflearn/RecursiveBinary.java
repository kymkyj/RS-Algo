package inflearn;

public class RecursiveBinary {
    public void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n / 2);
            // 스택프레임으로 인해 아래에 출력해야 함
            System.out.print(n%2+ " ");
        }
    }

    public static void main(String[] args) {
        RecursiveBinary T = new RecursiveBinary();
        T.DFS(11);
    }
}
