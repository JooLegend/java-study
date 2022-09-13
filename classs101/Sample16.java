import java.util.Arrays;

public class Sample16 {
    public static void main(String[] args) {
        int[] lotto998 = new int[]{13,20,230,13,13};
        int[] lotto997 = new int[]{52,32,55,78,13};
        int[] lotto996 = new int[]{35,25,57,37,43};
//        System.out.println("998회 로또 당첨번호 : " + Arrays.toString(lotto998));
//        System.out.println("997회 로또 당첨번호 : " + Arrays.toString(lotto997));
//        System.out.println("996회 로또 당첨번호 : " + Arrays.toString(lotto996));
        int[][] lottoTable = new int[][]{lotto998,lotto997,lotto996};
//        System.out.println("997회 로또 당첨번호 : " + Arrays.deepToString(lottoTable));
        int[] mynum = new int[]{13,20,230,13,13};
        System.out.println(Arrays.equals(lotto998,mynum) ? "당첨입니당~" : "꽝");
    }
}
