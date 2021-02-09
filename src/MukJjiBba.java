import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.*;

public class MukJjiBba {
    //컴퓨터와 묵찌빠하기
    //처음 시작은 가위바위보로 결정
    //이기면 공격 비기면 다시 지면 수비이다.
    public static int rsp(String userChoice,int computerChoice){
        //첫 가위바위보로 승패정하기

        int whoWin=0; // 0이 무승부  1이 승리 2가 패배

            if ((userChoice.equals("묵") && computerChoice == 0) || (userChoice.equals("찌") && computerChoice == 1) || (userChoice.equals("빠") && computerChoice == 2)) {
                System.out.println("컴퓨터 :" + computerChoice);
                System.out.println("비겼습니다. 다시 가위바위보!");
                System.out.println("다시 '묵' '찌' '빠' 중에 고르세요.");
            }
            else if ((userChoice.equals("묵") && computerChoice == 1) || (userChoice.equals("찌") && computerChoice == 2) || (userChoice.equals("빠") && computerChoice == 0)) {
                System.out.println("컴퓨터 :" + computerChoice);
                System.out.println("이겼습니다. 공격하세요!!");
                System.out.println("'묵' '찌' '빠' 중에 고르세요.");
                whoWin=1;
            }
            else{
                System.out.println("컴퓨터 :" + computerChoice);
                System.out.println("졌습니다. 수비하세요.");
                System.out.println("'묵' '찌' '빠' 중에 고르세요.");
                whoWin=2;
            }

            return whoWin;
    }
    public static int phase2(int whoWin, String userChoice, int computerChoice){
        int win=0;
        if(whoWin==1) {//승리일 때
            if ((userChoice.equals("묵") && computerChoice == 0) || (userChoice.equals("찌") && computerChoice == 1) || (userChoice.equals("빠") && computerChoice == 2)) {
                System.out.println("컴퓨터 :" + computerChoice);
                System.out.println("묵찌바 승리!");
                System.out.println("축하합니다.");
                win = 1; // 확정 승리
            }
        } else if(whoWin==2){
            if ((userChoice.equals("묵") && computerChoice == 0) || (userChoice.equals("찌") && computerChoice == 1) || (userChoice.equals("빠") && computerChoice == 2)) {
                System.out.println("컴퓨터 :" + computerChoice);
                System.out.println("묵찌바 패배..");
                System.out.println("다음에 도전하세요.");
                win = 1; // 확정 패배
            }
        }
        if ((userChoice.equals("묵") && computerChoice == 1) || (userChoice.equals("찌") && computerChoice == 2) || (userChoice.equals("빠") && computerChoice == 0)) {
            System.out.println("컴퓨터 :" + computerChoice);
            System.out.println("이겼습니다. 다시 공격하세요!!");
            System.out.println("'묵' '찌' '빠' 중에 고르세요.");
            win=2; // 공격턴
        } else if((userChoice.equals("묵") && computerChoice == 2) || (userChoice.equals("찌") && computerChoice == 0) || (userChoice.equals("빠") && computerChoice == 1)){
            System.out.println("컴퓨터 :" + computerChoice);
            System.out.println("졌습니다. 다시 수비하세요.");
            System.out.println("'묵' '찌' '빠' 중에 고르세요.");
            win=3;// 수비턴
        }
        return win;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보! '묵' '찌' '빠' 중에 고르세요.");
        String userChoice=sc.next();
        int win = 0;
        int computerChoice=(int)(Math.random()*3);
        while(true){
            int whoWin = rsp(userChoice, computerChoice);
            if(whoWin == 0) {
                userChoice = sc.next();
                computerChoice = (int) (Math.random() * 3);
            }
            else if(whoWin == 1) { // 승리일 때
                userChoice = sc.next();
                computerChoice = (int) (Math.random() * 3);
                win = phase2(whoWin, userChoice, computerChoice);
                if(win==1) { // 묵찌빠 승리
                    break;
                } //else if(win==2){ // 다시 공격
                  else if(win==3){ // 수비로 변경
                    whoWin=2;
                }
            }
            else { // 패배일 때
                userChoice = sc.next();
                computerChoice = (int) (Math.random() * 3);
                win = phase2(whoWin, userChoice, computerChoice);
                if(win==1) {
                    break;
                } else if(win==2){ // 공격으로 변경
                    whoWin=1;
                }
            }
        }
    }
}
