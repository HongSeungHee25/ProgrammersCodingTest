package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 두 수의 합 - 정답률 92%
public class SumOfTwoNumbers {

	public static void main(String[] args) {

		/*
		 * 정수 num1과 num2가 주어질 때, num1과 num2의
		 * 합을 return하도록 soltuion 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - -50,000 ≤ num1 ≤ 50,000
		 * - -50,000 ≤ num2 ≤ 50,000
		 * 
		 */
		System.out.println("[문제 Lv.0 : 두 수의 합 (정답률 92%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 num1을 입력해주세요 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수 num2을 입력해주세요 >> ");
		int num2 = sc.nextInt();
		
		int answer = -1;
		answer = num1 + num2;
		System.out.println("정수 '"+num1+"' 과 정수 '"+num2+"' 두 수의 합은 '"+answer+"' 입니다.");
		
	}

}
