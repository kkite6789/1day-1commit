import java.util.*;

public class devideAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String[] arr = num.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        System.out.printf("%.9f%n",(double)a/b);
    }
}
