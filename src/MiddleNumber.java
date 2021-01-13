import java.util.*;

public class MiddleNumber {
    public static void main(String[] args) {
        // 3개의 입력 받는 숫자 중 가운데 숫자 출력하기
        int[] arr = new int[3];
        System.out.println("3 숫자 중 가운데 숫자 뽑기");

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] res = num.split(" ");

        for(int i=0; i<3; i++) {
            arr[i]=Integer.parseInt(res[i]);
            System.out.println(i + "번째 숫자" +arr[i] + " 입니다. ");
        }
        Arrays.sort(arr);

        System.out.println("답은 : " + arr[1]);
    }

}
