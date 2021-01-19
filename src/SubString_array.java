import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.*;

public class SubString_array {
    //programmers 배열 자르고 해당번째 수 구하기
    //array의 값들에서 commands의 2차원 배열로 (첫문자열,끝문자열,몇번째숫자) 값을 정해 int배열로 return을 보낸다.
    public int[] solution(int[] array, int[][] commands) {
        // 풀어보기
    // 1/19 모의면접준비로 대체

        return null;
    }

    public static void main(String[] args) {
        // 메인에서 solution으로 array와 2차원배열 commands를 보낸 후
        // solution 메소드에서 해당 값으로 처리하여 결과를 출력한다.

        System.out.println("숫자를 입력하세요 (띄워쓰기로 다음 숫자 구분)");
        Scanner sc= new Scanner(System.in);
        String num = sc.nextLine();

        String[] array1;
        array1 = num.split(" ");
        int[] array2 = new int[array1.length];

        System.out.println(array2.length);
        for(int i=0; i<array1.length; i++){
           array2[i] = Integer.parseInt(array1[i]);
            System.out.println(array2[i] + " <-- array 안 "+ i + " 번째 숫자");
        }
    // 내일 오류 분석 및 전체적인 수정요망

    }
}
