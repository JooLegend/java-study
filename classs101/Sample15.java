import java.util.Arrays;

public class Sample15 {
    public static void main(String[] args) {
        /*
        게시판
        번호 , 제목 , 작성자 , 작성일 , 조회수
         */
        String[][][] list = new String[2][3][5];
        String[] contents1 = new String[] {"1","테스트1","작성자","오늘","0"};
        String[] contents2 = new String[] {"2","테스트1","작성자","오늘","2"};
        String[] contents3 = new String[] {"3","테스트1","작성자","오늘","3"};
        String[] contents4 = new String[] {"4","테스트1","작성자","오늘","5"};
        String[] contents5 = new String[] {"5","테스트1","작성자","오늘","7"};
        String[] contents6 = new String[] {"6","테스트1","작성자","오늘","0"};

        String[][] row1 = new String[][] {contents1,contents2,contents3};
        String[][] row2 = new String[][] {contents4,contents5,contents6};

        list[0] = row1;
        list[1] = row2;

//        System.out.println(Arrays.deepToString(list));
        System.out.println("1번페이지");
        System.out.println(Arrays.deepToString(list[0]));
        System.out.println("2번페이지");
        System.out.println(Arrays.deepToString(list[1]));

        String[][][] list2 = new String[3][2][3];

        String[] names = new String[]{"빵형","빵순","빵돌"};
        String[] korScore = new String[]{"100점","80점","90점"};

        String[][] rows1 = new String[][]{{names[0],korScore[0]}};
        String[][] rows2 = new String[][]{{names[1],korScore[1]}};
        String[][] rows3 = new String[][]{{names[2],korScore[2]}};

        list2[0] = rows1;
        list2[1] = rows2;
        list2[2] = rows3;
        System.out.println(Arrays.deepToString(list2[0]));
        System.out.println(Arrays.deepToString(list2[1]));
        System.out.println(Arrays.deepToString(list2[2]));







    }
}
