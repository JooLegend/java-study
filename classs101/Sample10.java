public class Sample10 {
    public static void main(String[] args) {
        boolean a = 1<1;  //a = false
//        System.out.printf("%d < %d = %b\n",1,1,a);

        int b=1;
        boolean c = b<2;

//        System.out.printf("%d < %d = %b\n",b,2,c);

        int d = 3;
        boolean e = d<4;
//        System.out.printf("%d < %d = %b\n",d,4,e);

        boolean f = 1<=1;
//        System.out.printf("%d <= %d = %b\n",1,1,f);

        int g = 1;
        boolean h = g<=2;
//        System.out.printf("%d <= %d = %b\n",g,2,h);

        int i = 80;
        boolean j = i<=69;
//        System.out.printf("%d <= %d = %b\n",i,69,j);

        boolean k = 1 == 1;
//        System.out.printf("%d == %d = %b\n",1,1,k);

        int l = 1;
        boolean m = 1 !=2;
//        System.out.printf("%d != %d = %b\n",l,2,m);

        char n = 'a';
        System.out.printf("%c == 'a'=%b",n,(n == 'a'));

        String o = "apple";
//        System.out.println("%s==""apple");
    }
}
