import java.util.Arrays;

public class Sample17 {
    public static void main(String[] args) {
        String[] ranking = {"1등","2등","3등","4등","5등"};
        String[] ranker = Arrays.copyOf(ranking,3);
        String[] etc = Arrays.copyOfRange(ranking,3,5);

        System.out.println(Arrays.toString(ranker));
        System.out.println(Arrays.toString(etc));

        String[] result = new String[ranker.length + etc.length];
        System.arraycopy(ranker,0,result,0,ranker.length);
        System.arraycopy(etc,0,result,ranker.length,etc.length);

        System.out.println(Arrays.toString(result));

        int[] num1 = {1,2,3};
        int[] num2 = {4,5};

        int[] result1 = new int[num1.length + num2.length];
        System.arraycopy(num1,0,result1,0,num1.length);
        System.arraycopy(num2,0,result1,num1.length,num2.length);

        System.out.println(Arrays.toString(result1));
        result1 = Arrays.copyOfRange(result1,2,3);
        System.out.println(Arrays.toString(result1));

        int[] num3 = {1,3};
        int[] num4 = {5,7,9};

        int[] resuslt2 = new int[num3.length + num4.length];
        System.arraycopy(num3,0,resuslt2,0,num3.length);
        System.arraycopy(num4,0,resuslt2, num3.length,num4.length);

        System.out.println(Arrays.toString(resuslt2));
        resuslt2 = Arrays.copyOfRange(resuslt2,2,3);
        System.out.println(Arrays.toString(resuslt2));
    }
}
