import java.util.Arrays;
import java.util.Comparator;

public class sample18 {
    public static void main(String[] args) {
        //기본자료형 올림차순
        int[] numbers = {5,7,4,1,9,3};
        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        //참조자료형 올림차순
        String[] foods = {"라면","미역국","떡볶이","수제비","갈비탕","순대국"};
        Arrays.sort(foods);
//        System.out.println(Arrays.toString(foods));

        //참조자료형 내림차순
        Arrays.sort(foods, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(foods));

        //이진 탐색
        String[] students = {"스노우","멀린","레지나","토니"};
        String student = "빵형";
        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

        int idx = Arrays.binarySearch(students,student);
//        System.out.println(idx);
//        System.out.printf("검색어 [%s]은 배열에 %s \n", student,(idx > -1 ? "있습니다." : "없습ㄴ니다."));

        //Arrays.stream()
        Integer[] numbers2 = Arrays.stream(numbers)
                .boxed().toArray(x -> new Integer[x]);
//        System.out.println(Arrays.toString(numbers2));
        String[] num1 = {"6","3","7"};
        String[] num2 = {"8","1","2","9"};

        String[] num3 = new String[num1.length + num2.length];
        System.arraycopy(num1,0,num3,0,num1.length);
        System.arraycopy(num2,0,num3,num1.length,num2.length);
        System.out.println(Arrays.toString(num3));

        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));

        Arrays.sort(num3,Comparator.reverseOrder());
        System.out.println(Arrays.toString(num3));
    }
}
