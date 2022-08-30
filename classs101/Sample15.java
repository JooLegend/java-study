import java.util.Arrays;

public class Sample15 {
    public static void main(String[] args) {
        /*
        3차원 배열
        게시판
        번호, 제목, 작성자, 작성일, 조회수
         */
//        String[][][] list = new String[2][3][5];
//        String[] contents1 = new String[]{"1","테스트1","작성자","오늘","0"};
//        String[] contents2 = new String[]{"2","테스트2","작성자","오늘","2"};
//        String[] contents3 = new String[]{"3","테스트3","작성자","오늘","0"};
//        String[] contents4 = new String[]{"4","테스트4","작성자","오늘","0"};
//        String[] contents5 = new String[]{"5","테스트5","작성자","오늘","1"};
//        String[] contents6 = new String[]{"6","테스트6","작성자","오늘","0"};
//
//        String[][] row1 = new String[][] {contents1 , contents2, contents3};
//        String[][] row2 = new String[][] {contents4 , contents5, contents6};
//
//        list[0] = row1;
//        list[1] = row2;
//
////        System.out.println(Arrays.deepToString(list));
//        System.out.println("1번 페이지");
//        System.out.println(Arrays.deepToString(list[0]));
//
//        System.out.println("2번 페이지");
//        System.out.println(Arrays.deepToString(list[1]));

        String[][] names = new String[3][2];
        String[] korScore1 = new String[]{"빵형","100점"};
        String[] korScore2 = new String[]{"빵순","80점"};
        String[] korScore3 = new String[]{"빵돌","90점"};

        names[0] = korScore1;
        names[1] = korScore2;
        names[2] = korScore3;

        System.out.println(Arrays.deepToString(names[0]));
        System.out.println(Arrays.deepToString(names[1]));
        System.out.println(Arrays.deepToString(names[2]));
    }
}
