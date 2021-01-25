import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
public class SearchString {
    public static void main(String[] args) {
        // 1. 문자열이 들어가 있는 문자
        // 2. 찾는 문자를 따로 지정
        // 3. 그문자열을 찾고 몇번 들어가있는지 횟수 체크

        String a = "123abcd452abcdef22abcd";
        String searchText = "a";

        int count = 0;

        String[] b = a.split("");
        System.out.println(b.length);

        for (String s : b) {
            if (s.equals(searchText)) {
                count++;
                System.out.println("loop 중");
            }
        }

        System.out.println(searchText + " 는 " + count + "번 들어가있습니다.");

    }
}
