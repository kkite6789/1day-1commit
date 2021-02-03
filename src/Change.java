import java.util.*;

public class Change {
//    춘향이는 편의점 카운터에서 일한다.
//    백준 14916번 문제
//    손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다.
//    동전의 개수가 최소가 되도록 거슬러 주어야 한다.
//    거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
//
//    예를 들어, 거스름돈이 15원이면 5원짜리 3개를, 거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를, 거
//    스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("5원 이상의 거스름돈을 정하세요.");
        int money = sc.nextInt();
        int change = 0;
        int five = 0;
        int two = 0;
        if(money<5){
            System.out.println("5원 미만의 거스름돈입니다.");
        }
        else{
            if((money%5)%2==0) {
                five = money/5;
                two = (money%5)/2;
            }
            else if((money%5)%2==1) {
                five = (money/5)-1;
                two = ((money%5)+5)/2;
            }
            System.out.println("5 원 개수   : "+ five);
            System.out.println("2 원 개수   : "+ two);
        }

    }
}
