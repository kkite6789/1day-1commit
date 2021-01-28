import java.util.*;
import java.math.*;

public class SumOfNumber {
    public static void main(String[] args) {
//        첫째줄에 숫자의 개수를 n을 입력받고, 둘째줄에 숫자 n개를 연속으로 입력합니다.
//        이때 입력된 숫자들의 합을 출력합니다.

        try {
            System.out.println("먼저 숫자의 갯수를 정하세요.");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(n +"개의 숫자를 입력하세요(띄워쓰기 구분)");
            Scanner sc2 = new Scanner(System.in);
            String a = sc2.nextLine();

            String[] arr = new String[n];
            arr = a.split(" ");
            int sum = 0;
            double avg = 0;
            double mul = 1;

            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(arr[i]);
                mul *= Integer.parseInt(arr[i]);
            }
            avg = (double) sum / n;

            double avg1 = Math.round(avg * 10 / 10);
            double mul1 = Math.round(mul * 10 / 10);

            /// 사용자가 고르기
            while(true) {
                System.out.println("숫자를 입력하세요 (1~3)");
                System.out.println("1번 : 덧셈");
                System.out.println("2번 : 곱셈");
                System.out.println("3번 : 평균값");
                Scanner sc3 = new Scanner(System.in);
                int choice = sc3.nextInt();
                if (choice <= 3) {
                    switch (choice) {
                        case 1:
                            System.out.println(sum);
                            break;
                        case 2:
                            System.out.println(mul);
                            break;
                        case 3:
                            System.out.println(avg);
                            break;
                    }
                    break;
                } else {
                    System.out.println("다시 입력하세요");
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
