import java.util.*;
public class BarrelGame {
    public static void main(String[] args) {
        try {
            int boom = (int) (Math.random() * 5 + 1);
            System.out.println("폭탄 숫자->" + boom);
            Scanner sc = new Scanner(System.in);
            int pick = 0;
            int playerTurn = 0;
            int turn=0; // 1이면 첫번째 플레이어, 2이면 두번째 플레이어 승
            for(int i=0; i<100; i++) {
                if(playerTurn % 2 == 0){ // player1
                    System.out.println("player1 차례입니다. 숫자를 입력하세요.");
                    turn=1;
                } else{ // player2
                    System.out.println("player2 차례입니다. 숫자를 입력하세요.");
                    turn=2;
                }
                pick = sc.nextInt();
                if (pick == boom) {
                    System.out.println("boom!");
                    if(turn==1){
                        System.out.println("player1이 폭탄을 골랐습니다.");
                        System.out.println("player2 승리!");
                    }else{
                        System.out.println("player2가 폭탄을 골랐습니다.");
                        System.out.println("player1 승리!");
                    }
                    break;
                } else {
                    System.out.println("통과");
                }
                playerTurn++;
            }
        } catch(Exception e){
            System.out.println("숫자를 입력하세요.");
        }
    }
}
