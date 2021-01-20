import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.*;

public class SubString_array {
    //programmers 배열 자르고 해당번째 수 구하기
    //array의 값들에서 commands의 2차원 배열로 (첫문자열,끝문자열,몇번째숫자) 값을 정해 int배열로 return을 보낸다.
    public int[] solution(int[] array, int[][] commands) {
        // 풀어보기
    //   1/20 인프런 대체
        /*
            1/21 할 것들
            문자열중에서 특정 문자열 찾기
            반올림
            x가 들어가 있는 문자열 정렬(정수만 적용되게)

         */

        return null;
    }

    public static void main(String[] args) {
        // 메인에서 solution으로 array와 2차원배열 commands를 보낸 후
        // solution 메소드에서 해당 값으로 처리하여 결과를 출력한다.

        System.out.println("숫자를 입력하세요 (띄워쓰기로 다음 숫자 구분)");
        Scanner sc= new Scanner(System.in);
        String num = sc.nextLine();

        String[] array1;
        //int[][][] commands;
        array1 = num.split(" ");
        int[] array = new int[array1.length];

        System.out.println(array.length);
        for(int i=0; i<array1.length; i++){
           array[i] = Integer.parseInt(array1[i]);
            System.out.println(array[i] + " <-- array 안 "+ i + " 번째 숫자");
        }
        System.out.println("시작할 첫 문자열 위치(숫자로)");
        Scanner sc2 = new Scanner(System.in);
        int startNum = sc2.nextInt();
        System.out.println("끝낼 마지막 문자열 위치(숫자로)");
        Scanner sc3 = new Scanner(System.in);
        int lastNum = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        int pickNum = sc4.nextInt();
        // commands = new int[startNum][lastNum][pickNum];



    }
}
