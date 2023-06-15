package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 두 수의 나눗셈 - 정답률 90%
public class DivisionOfTwoNumbers {

	public static void main(String[] args) {

		/*
		 * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로
		 * 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - 0 < num1 ≤ 100
		 * - 0 < num2 ≤ 100
		 * 
		 */
		
		System.out.println("[문제 Lv.0 : 두 수의 나눗셈 (정답률 90%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 num1을 입력해주세요 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수 num2을 입력해주세요 >> ");
		int num2 = sc.nextInt();
		
		double answer = 0;
		
		answer = (double)num1 / num2 * 1000;
		
		System.out.println("정수 '"+num1+"' 과 정수 '"+num2+"' 두 수의 나눗셈은 '"+(int)answer+"' 입니다.");
		
		
	}
}
