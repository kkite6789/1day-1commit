import java.util.*;

public class drawingLots {
    // 사용자가 원하는 갯수, 범위 만큼 제비뽑기
    public static void drawing(int cnt, int max){

        for(int i=1; i<=cnt; i++){
            System.out.print(i+" 회차 뽑기 : ");
            System.out.println((int)(Math.random()*max+1));
        }


    }

    public static void main(String[] args) {

        //int min=0; // 범위(최솟값)  - 보류 중 -
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 번 뽑을지 정하세요.");
        int cnt = sc.nextInt(); // 횟수
        System.out.println("최대로 나올 수 있는 숫자를 정하세요.");
        int max = sc.nextInt(); // 최대값

        drawing(cnt,max);
    }
}
