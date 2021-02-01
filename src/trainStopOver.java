import java.sql.SQLOutput;
import java.util.*;

public class trainStopOver {
    public static void main(String[] args) {


    // 백준 2455번 지능형 기차,
    // 한 기차가 1번역부터 4번역 까지 있는 노선에서 운행되고 있다.
    // 이 기차에는 자동으로 사람이 몇명 내리는지 인식할 수 있는 장치가 있다.
    // 이 장치를 이용해 어느 때에 가장 사람이 많이 탑승하는지 구해라.
    // 단. 모든 사람들은 기차에 탈 때 모두 내리고 탑승을 시작한다.
    // 첫째 줄엔 기차의 최대인원 수 이다.

        System.out.println("최대 인원 수를 적으시오.");
        Scanner sc = new Scanner(System.in);
        int max=0; // 가장 많았던 승객 수
        int cnt=0; // 승객 수

        for(int i=0; i<4; i++){
            // 하차와 승차를 따로 구분
            if(i==0) {
                System.out.println("첫번째 역입니다.");
                System.out.println("탑승한 승객 수를 적어주세요.");
                cnt+=sc.nextInt();
            }
            else if(i>0 && i<3) {
                System.out.println(i + " 번째 역입니다.");
                System.out.println("하차 승차 인원을 띄워쓰기로 구분해 적어주세요.");
                System.out.println("ex) 5 10");
                cnt -= sc.nextInt(); //하차
                cnt += sc.nextInt(); //승차
            }
            else if(i==3) {
                System.out.println("마지막 역입니다.");
                System.out.println("하차한 승객 수를 적어주세요.");
                cnt-=sc.nextInt();
            }
            if(cnt>max){ // 승객이 가장 많을 때 max에 저장한다.
                max=cnt;
            }
        }

        System.out.println("가장많았던 승객 수는 " + max +" 입니다.");
    }
}
