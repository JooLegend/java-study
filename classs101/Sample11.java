public class Sample11 {
    public static void main(String[] args) {
        //3항 연산자
        // (조건식) ? A : b;
        // 홀,짝 구분
        int score = 60;
        String result = score >=90 ? "A" :
                        score >=80 ?"B" :
                        score >=70 ?"C" :
                        score >=60 ?"D" : "F"
                        ;

        System.out.println(result);
    }
}
