import java.util.Scanner;

//문제1) 정수 1개를 입력하여, 1부터 입력한 수까지 1씩 증가하여 그 중에서 홀수를 출력하고,
// 홀수의 합계와 개수를 출력하시오.
//문제2) 정수 1개를 입력하여, 1부터 입력한 수까지 1씩 증가하여 그 중에서 3의 배수이면서 4의 배수인 수를 출력하고
// 그수의 합계와 개수를 출력하시오.
public class For02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		/*
		for(int i=1;i <= n;i++) {
			if(i%2==1) {
				System.out.println("홀수 : " + i);
				sum += i;
				count ++;
			}
		}
		System.out.println("홀수 합 : " + sum);
		System.out.println("홀수 합 : " + count);*/
		
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%4==0) {
				System.out.println("3,4의 배수 : " + i);
				sum += i;
				count ++;
			}
		}
		System.out.println(" 합 : " + sum);
		System.out.println(" 개수 : " + count);
		
		sc.close();
	}
}
