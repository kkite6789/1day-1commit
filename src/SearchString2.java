public class SearchString2 {
    public static void main(String[] args) {
        // 이번엔 알파벳이 아닌 문자열을 찾도록 하기

        String a = "1abc4abc5abc";
        String b = "abc";

        String[] aa = a.split("");
        String[] bb = b.split("");
        int count = 0;
        int maxNum = a.length()-b.length()+1;

        System.out.println(maxNum);

            for(int i=0; i<maxNum; i++ ){
                if (aa[i].equals(bb[0])) {// 첫 번째 자리끼리 맞을 때
                    if(aa[i+1].equals(bb[1])) { // 두 번째 자리끼리 맞을 때
                        if(aa[i+2].equals(bb[2])) { // 세 번째 자리끼리 맞을 때
                            count++;
                            //System.out.println(aa[i]+aa[i+1]+aa[i+2]);
                        }
                    }
                }
                else{
                    System.out.println(aa[i]+" 는 첫 번째 자리 숫자가 아닙니다.");
                }
            }
        System.out.println("count : " + count);
    }
}
