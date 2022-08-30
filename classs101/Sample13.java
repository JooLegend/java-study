public class Sample13 {
    public static void main(String[] args) {
        int kor_score = 1;
        int eng_score = 12;
        int mat_score = 13;

        int[] arrScore1 = new int[3];
        arrScore1[0] = 1;
        arrScore1[1] = 13;
        arrScore1[2] = 13;

        int[] arrScore2 = new int[]{1,2,3};
        int[] arrScore3 = {1,2,3};

        kor_score = arrScore1[0];
        eng_score = arrScore1[1];
        mat_score = arrScore1[2];
//        System.out.println(kor_score);

        String[] arrstr= {"사과","딸기","수박"};
        System.out.println(arrstr[0]);
        System.out.println(arrstr[2]);
//        arrstr[3] = "멜론";

        System.out.println(arrstr[arrstr.length-1]);

    }
}
