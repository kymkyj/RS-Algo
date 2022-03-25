package inflearn;

public class RecursivePractice {
    public void DFS(int n){
        if(n == 0){
            return;
        }else{
            DFS(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        RecursivePractice T = new RecursivePractice();
        T.DFS(3);
    }
}
