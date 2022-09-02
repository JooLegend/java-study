import java.util.Arrays;

public class Sample14 {
    public static void main(String[] args) {
        int[] score1 = new int[]{1,2,3};
        int[] score2 = new int[3];
        score2[0] = 3;
        score2[1] = 4;
        score2[2] = 5;

        int[][] scores1 = new int[2][3];
        scores1[0] = score1;
        scores1[1] = score2;
        System.out.println(Arrays.deepToString(scores1));

        int[][] scores2 = new int[][] {score1,score2};
        System.out.println(Arrays.deepToString(scores2));

        int[][] scores3 = new int[2][3];
        scores3[0] = new int[]{1,2,3};
        scores3[1][0] = 3;
        scores3[1][1] = 4;
        scores3[1][2] = 5;

        System.out.println(Arrays.deepToString(scores3));

    }
}
