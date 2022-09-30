import java.util.Arrays;

public class Main {
    public int solution(int[] arr1) {
        int answer = 0;
        int a = 0;
        int b = 0;
        Arrays.sort(arr1);

        for (int i = 0; i < arr1.length; i++) {
            if (i!=arr1[i]){
                a=i;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Main method = new Main();
        int[] arr1 = {1,3,5,9,2,4,8,0};
        System.out.println(method.solution(arr1));
    }
}