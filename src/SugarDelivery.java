import java.util.*;

public class SugarDelivery {
    public static void main(String[] args) {
        //    백준 2839문제 설탕배달
        //    킬로그램이 스캐너로 입력되었을때,
        //    상근이가 배달해야하는 봉지의 최소 개수를 출력합니다.
        //    만약 3킬로그램 혹은 5킬로그램 봉지로 딱 떨어지게 만들 수 없다면 -1을 출력합니다.

        Scanner sc = new Scanner(System.in);
        int kilogram = sc.nextInt();
        int bundle = 0;
        System.out.println("배달해야하는 킬로그램 : "+ kilogram);

        if(kilogram % 5 == 0){
            bundle = kilogram/5;
        }
        else if(kilogram % 3 == 0){
            bundle = kilogram/3;
        }
        else{
            bundle = -1;
        }

        System.out.println("상근이가 배달해야하는 봉지의 최소 개수를 출력합니다. " + bundle);


    }
}
