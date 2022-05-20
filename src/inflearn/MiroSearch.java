package inflearn;

import java.io.IOException;
import java.util.Scanner;

public class MiroSearch {
    // 상하좌우 방향설정해주는 스태틱 변수 선언
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public static void DFS(int x, int y){
        // 아래의 경우 종착점에 온 것
        if(x == 7 && y == 7) answer++;
        else{
            for(int i=0; i<4; i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                // 범위를 확인하기 위해(경계선 안인지 밖인지)
                if(nx >=1 && nx <=7 && ny >=1 && ny <= 7 && board[nx][ny]==0){
                    // 갈 경우에 0인곳을 1로 체크표시해준다.
                    board[nx][ny]=1;
                    DFS(nx, ny);
                    // 뒤로 백할 경우 0으로 바꿔준다
                    board[nx][ny]=0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
       Scanner kb = new Scanner(System.in);
       board = new int[8][8];
       for(int i=1; i<=7; i++){
           for(int j=1; j<=7; j++){
               board[i][j] = kb.nextInt();
           }
       }
       // 출발점을 체크해주기 위해 선언
       board[1][1] = 1;
       DFS(1,1);
        System.out.println(answer);
    }
}
