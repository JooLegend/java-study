import java.util.Arrays;

public class Sample16 {
    public static void main(String[] args) {
        int[] lotto998 = new int[] {13,17,18,20,42,45};
        int[] lotto997 = new int[] {4,7,14,16,24,44};
        int[] lotto996 = new int[] {6,11,15,24,32,39};

//        System.out.println("998회 로또 당첨번호 : " + Arrays.toString(lotto998));
//        System.out.println("997회 로또 당첨번호 : " + Arrays.toString(lotto997));
//        System.out.println("996회 로또 당첨번호 : " + Arrays.toString(lotto996));

        int[][] lottoTable = new int[][] {lotto998,lotto997,lotto996};
        System.out.println(Arrays.deepToString(lottoTable));

        int[] mynum = new int[] {13,17,18,20,42,45};
        System.out.println(Arrays.equals(lotto998,mynum) ? "True":"False");
    }
}
