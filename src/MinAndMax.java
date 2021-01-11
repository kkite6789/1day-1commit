import java.util.*;

public class MinAndMax {
    public static void main(String[] args) {

        // 배열의 길이와 그 개수만큼 숫자들을 입력하여 최솟값 최대값을 구해라
        // 백준 알고리즘 10818번 문제

        System.out.println("입력한 숫자 중 가장 작은 수, 큰 수 찾기 ");
        System.out.println("몇개의 숫자를 입력하시겠습니까?");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();//String은 next int는 nextInt

        int[] array = new int[num];
        System.out.println(array.length+"개의 숫자를 입력합니다.");

        System.out.println("입력 시작.");
        for(int i=0; i<num; i++){
            System.out.println(i+1 +" 번째 숫자를 입력하세요.");
            Scanner sc2 = new Scanner(System.in);
            array[i]=sc2.nextInt();
        }
        Arrays.sort(array);
        System.out.println("제일 작은 수는 "+array[0]+" 이고 제일 큰 수는 "+array[num-1]+" 입니다.");
    }
}


