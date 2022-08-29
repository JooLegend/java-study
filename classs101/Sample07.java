public class Sample07 {
    public static void main(String[] args) {
        int a = 1+2;
        int b = a * 2;
        int c = b/a;
        int d = b % a;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("---------");

        b = b-1;
        d = b % a;
        System.out.println("b = "+b);
        System.out.println("d = "+d);

    }
}
