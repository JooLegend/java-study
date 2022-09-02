import java.util.Arrays;

public class Sample17 {
    public static void main(String[] args) {
//        String[] ranking = new String[] {"1등","2등","3등","4등","5등"};
//        String[] ranker = Arrays.copyOf(ranking,3);
//        String[] etc = Arrays.copyOfRange(ranking,3,5);
//        System.out.println(Arrays.toString(ranker));
//        System.out.println(Arrays.toString(etc));
//
//        String[] result = new String[ranker.length + etc.length];
//        System.out.println(Arrays.toString(result));
//        System.arraycopy(ranker,0,result,0,ranker.length);
//        System.out.println(Arrays.toString(result));
//        System.arraycopy(etc,0,result,ranker.length,etc.length);
//        System.out.println(Arrays.toString(result));

//        int[] num1 = {1,2,3};
//        int[] num2 = {4,5};
//
//        int[] result = new int[num1.length + num2.length];
//        System.out.println(Arrays.toString(result));
//        System.arraycopy(num1,0,result,0,num1.length);
//        System.out.println(Arrays.toString(result));
//        System.arraycopy(num2,0,result,num1.length,num2.length);
//        System.out.println(Arrays.toString(result));
//
//        int[] etc = Arrays.copyOfRange(result,2,3);
//        System.out.println(Arrays.toString(etc));

        int[] num1 = {1,3};
        int[] num2 = {5,7,9};

        int[] result = new int[num1.length + num2.length];
        System.arraycopy(num1,0,result,0,num1.length);
        System.arraycopy(num2,0,result,num1.length,num2.length);
        System.out.println(Arrays.toString(result));

        int[] etc = Arrays.copyOfRange(result,2,3);
        System.out.println(Arrays.toString(etc));


    }
}
