import java.util.Random;

public class Sample05 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(2)+1;
        System.out.println("2단 : " + num * num);
    }
}
