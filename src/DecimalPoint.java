import java.util.*;
import java.math.*;

public class DecimalPoint {
    public static void main(String[] args) {
        String a = "10";
        String b = "15";
        String c = "17";
        String d = "35";

        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);
        int cc = Integer.parseInt(c);
        int dd = Integer.parseInt(d);

        int sum = aa+bb+cc+dd;
        System.out.println("sum : " + sum);
        double avg = (double)sum/4;
        System.out.println(avg);
        //System.out.println(String.format("%.1f",avg));
        System.out.println(Math.round(avg*10)/10.0);
    }
}
