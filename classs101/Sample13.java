public class Sample13 {
    public static void main(String[] args) {
        int kor_score1 = 1;
        int eng_score1 = 10;
        int mat_score1 = 13;

        int[] arrScore1 = new int[3];
        arrScore1[0] = 1;
        arrScore1[1] = 10;
        arrScore1[2] = 3;

        int[] arrScore2 = new int[]{1,10,3};
        int[] arrScore3 = {1,10,3};

        kor_score1 = arrScore1[1];
        eng_score1 = arrScore1[2];
        mat_score1 = arrScore1[0];

        System.out.println(kor_score1);
        System.out.println(eng_score1);
        System.out.println(mat_score1);

        String[] arrStr = {"사과", "딸기", "수박"};
        System.out.println(arrStr[0]);


    }
}
