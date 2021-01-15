import java.util.*;

public class AminusB {
    public static void main(String[] args) {
        // A,B를 입력받아 A-B를 구하시오 (0<A,B<10)

        int a,b,c;

        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        String[] plusNum = ab.split(" ");
        a = Integer.parseInt(plusNum[0]);
        b = Integer.parseInt(plusNum[1]);
        c = a-b;

        System.out.println(c);

    }
}
