import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println("시험 점수 입력 : ");


        if(score >= 91){
            System.out.println("A등급");
        } else if (score >= 81) {
            System.out.println("B등급");
        }
        else if (score >= 71) {
            System.out.println("C등급");
        }else{
            System.out.println("F등급");
        }

    }
}