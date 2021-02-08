import java.util.*;

public class RockScissorPaper {
    // 0-가위 1-바위 2-보
    public static void main(String[] args) {
        String choice = ""; // 플레이어가 고른 것
        int computerChoice = 0; // 컴퓨터가 고른 가위,바위,보 (정수형) 0:가위 1:바위 2:보
        int playerPick = 0; // 플레이어가 고른 가위,바위,보(정수형) 0:가위 1:바위 2:보
        int round =3; // 라운드 횟수
        int score=0;  // 0:패배  1:무승부  2:승리
        int winPoint = 3; // 승리 시 점수
        int drawPoint = 1; // 무승부 시 점수

        Scanner sc = new Scanner(System.in);
        System.out.println("총 "+round+"라운드로 진행되는 가위바위보 게임");
        System.out.println("승리 - "+winPoint+"점, 무승부 - "+drawPoint+"점 패배시 탈락");
        System.out.println("'가위' '바위' '보' 중에 고르세요.");
        System.out.println("3가지 외에 다른 것을 입력 시 실격입니다.");
        System.out.println("시작합니다!");
        System.out.println(" ");

        for(int i=1; i<=3; i++) {
            System.out.println(i + "회차");
            choice = sc.next();
            computerChoice = (int)(Math.random()*3)+1; // 0:가위 1:바위 2:보
            switch(choice){
                case "가위" :
                    playerPick = 0;
                    break;
                case "바위" :
                    playerPick = 1;
                    break;
                case "보" :
                    playerPick=2;
                    break;
                default:
                    System.out.println("가위 바위 보중에 입력하세요.");
                    playerPick=00;
                    break;

            }
            if (playerPick == 00){
                System.out.println("실격입니다.");
                break;
            } else if ((playerPick == 0 && computerChoice == 1) || (playerPick == 1 && computerChoice == 2) || (playerPick == 2 && computerChoice == 0)) {
                System.out.println(i + " 라운드 패배했습니다.");
                System.out.println("탈락입니다.  : ( ");
                break;
            } else if ((playerPick == 0 && computerChoice == 0) || (playerPick == 1 && computerChoice == 1) || (playerPick == 2 && computerChoice == 2)) {
                System.out.println(i + " 라운드 비겼습니다.");
                System.out.println(winPoint + " 점 획득! 다음라운드로 진행합니다.");
                score += winPoint;
            } else {
                System.out.println(i + " 라운드 승리했습니다!");
                System.out.println(drawPoint + " 점 획득! 다음라운드로 진행합니다.");
                score += drawPoint;
            }
        }
        System.out.println("총 점수는 : " + score + " 입니다. ");
    }
}

