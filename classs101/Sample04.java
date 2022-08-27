import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Sample04 {
    public static void main(String[] args){
        final int NUMBER = 10;
        final int STUDENT_NUMBER = 12;

        final String MAIN_URL = "http://brad.net";
        final String FRUIT1 = "apple";
        final var FRUIT2 = "apple2";

        Map<String, Objects> map1 = new HashMap<>();
        var map2 = new HashMap<String, Objects>();



        int a = 1;
        long b = a;

        long c = 2;
        int d = (int)c;

        float e = 1.1f;
        double f = e;

        double g = 1.2;
        float h = (float)g;

        final float PI = 3.14f;
        int PI2 = (int)PI;

        System.out.println(PI2);

    }
}
