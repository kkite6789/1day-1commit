import java.util.*;

public class Lotto {
    public static void swap(int[] arr, int a, int b){
        int temp = 0;
        arr[a] = temp;
        arr[b] = arr[a];
        temp = arr[b];
    }
    public static void sort(int[] number){
        for(int i=0; i<number.length; i++){
            for(int j=0; j<number.length-i-1; j++){
                if(number[j]>number[j+1]){
                    swap(number,number[j],number[j+1]);
                }
            }
        }
    }
    // 로또 시스템
    // 1~45까지의 숫자 중 랜덤으로 6개의 숫자
    // 숫자들을 정렬하고 중복숫자는 못나오게 한다.
    // 차 후에 당첨시스템 및 등수도 구현
    public static void main(String[] args) {
        int number[] = new int[6];
        System.out.println("로또 번호를 자동으로 생성합니다.");
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 45) + 1;

            for (int j = 0; j < i; j++) {
                if (number[j] == number[i]) {
                    System.out.println("중복숫자 제거");
                    i--;
                    break;
                }
            }
        }
        sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+ " ");

        }
    }
}