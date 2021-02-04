import java.util.*;

public class RockScissorPaper {
    // 0-가위 1-바위 2-보
    public static void compare(int player1, int player2){

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("가위 바위 보 중에 고르세요.");
        String choice = ""; // 플레이어가 고른 것
        int computerChoice = (int)(Math.random()*3)+1;
        int playerPick = 0;
        int turn = 1;
        int score=0;  // 0:패배  1:무승부  2:승리
        boolean check= true;
        for(int i=0; i<3; i++) {
            System.out.println(i+1 + "회차");
            choice = sc.next();
            if (choice.equals("가위")) {
                playerPick = 0;
            } else if (choice.equals("바위")) {
                playerPick = 1;
            } else if (choice.equals("보")) {
                playerPick = 2;
            } else {
                System.out.println("가위 바위 보중에 입력하세요.");
                check = false;
            }
        }
        while(turn<=3){// turn 1부터 3까지

            switch (playerPick) {
                case 0 : //가위
                    if(computerChoice == 0) {
                        System.out.println(score + "점 획득! 비겼습니다.");
                        score+=1;
                    }else if(computerChoice == 1) {
                        System.out.println(score + "점 획득.. 졌습니다.");
                        score+=0;
                    }else if(computerChoice == 2) {
                        System.out.println(score + "점 획득!! 이겼습니다.");
                        score+=2;
                    }
                case 1 : // 바위
                    if(computerChoice == 0) {
                        System.out.println(score + "점 획득!! 이겼습니다.");
                        score+=2;
                    }else if(computerChoice == 1) {
                        System.out.println(score + "점 획득! 비겼습니다.");
                        score+=1;
                    }else if(computerChoice == 2) {
                        System.out.println(score + "점 획득.. 졌습니다.");
                        score+=0;
                    }

                case 2 : // 보
                    if(computerChoice == 0) {
                        System.out.println(score + "점 획득.. 졌습니다.");
                        score+=0;
                    }else if(computerChoice == 1) {
                        System.out.println(score + "점 획득!! 이겼습니다.");
                        score+=2;
                    }else if(computerChoice == 2) {
                        System.out.println(score + "점 획득! 비겼습니다.");
                        score+=1;
                    }
                    turn++;
            }

        }
        System.out.println("총 점수는 : " + score + " 입니다. ");
    }
}

