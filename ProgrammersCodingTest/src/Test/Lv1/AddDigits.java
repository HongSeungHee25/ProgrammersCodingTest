package Test.Lv1;

import java.util.Scanner;

//작성자 : 홍승희

//코딩 테스트 : Lv.1 자릿수 더하기 - 정답률 87%
public class AddDigits {

	public static void main(String[] args) {

		/*
		 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
		 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
		 * 
		 * 제한 사항
		 * - N의 범위 : 100,000,000 이하의 자연수
		 * 
		 */
		
		System.out.println("[문제 Lv.1 : 자릿수 더하기 (정답률 87%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 >> ");
		int n = sc.nextInt();
		int answer = 0;
		System.out.print("정수 '"+n+"'");
		while(n > 0) {
			answer += n % 10;
			n /= 10;
		}
		System.out.println(" 자릿수 합계는 '"+answer+"' 입니다.");
		
	}
}
