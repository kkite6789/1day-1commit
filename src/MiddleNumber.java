import java.util.*;

public class MiddleNumber {
    public static void main(String[] args) {

        int[] arr= new int[3];
        System.out.println("3 숫자 중 가운데 숫자 뽑기");

        for(int i=0; i<3; i++){
            Scanner sc = new Scanner(System.in);
            arr[i]=sc.nextInt();
            System.out.println(arr[i]+" 입력완료. ");
        }

        Arrays.sort(arr);

        System.out.println(arr[0] + " <-- 정렬된 1번째숫자");
        System.out.println(arr[1] + " <-- 정렬된 2번째숫자");
        System.out.println(arr[2] + " <-- 정렬된 3번째숫자");

        System.out.println("답은 : " + arr[1]);
    }

}
