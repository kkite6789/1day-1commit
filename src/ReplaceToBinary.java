import java.sql.SQLOutput;
import java.util.*;

public class ReplaceToBinary {
    // 10진수의 숫자를 입력받아서 2진수로 변경하는 알고리즘 구현
    public static void main(String[] args) {
        System.out.println("10진수의 숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        StringBuilder num1 = new StringBuilder(); // num1에 append를 사용하기 위해 StringBuilder로 선언
        int num = sc.nextInt(); // 사용자가 입력한 십진수
        int originNum = num; // 단순히 처음정한 숫자를 표시하기 위해 정의함
        for(int i=0; i<20; i++){ // 여러번 반복하게 한 후
            if(num%2==1) // 숫자를 2로 나누었을 때 나머지가 1이면 1을 더해준다.
                num1.append("1");
            else if(num%2==0)// 2로 나누었을때 0이면 0을 추가
                num1.append("0");

            num/=2;

            if(num/2==0){ // 십진수가 더 이상 2로 나눠지지 않으면 끝낸다.
                if(num%2==1) // 마지막자리 정하기 - 마지막자리에 1을 넣는다.
                    num1.append("1");
                else // 마지막자리에 0을 넣는다.
                    num1.append("0");
                break;
            }
        }
//        System.out.println(num1.length()); num 길이
        System.out.print(originNum + ")2  :  ");
        for(int i=num1.length()-1; i>=0; i--){ // 문자열 거꾸로 만들기
            System.out.print(num1.charAt(i)); // 문자열을 반대로 출력시킨다.
        }
    }
}
