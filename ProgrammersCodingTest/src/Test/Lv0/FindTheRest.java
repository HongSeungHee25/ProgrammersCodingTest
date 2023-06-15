package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 나머지 구하기 - 정답률 92%
public class FindTheRest {

	public static void main(String[] args) {

		/*
		 * 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 
		 * 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - 0 < num1 ≤ 100
		 * - 0 < num2 ≤ 100
		 * 
		 */
		
		System.out.println("[문제 Lv.0 : 나머지 구하기 (정답률 92%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 num1을 입력하세요 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수 num1을 입력하세요 >> ");
		int num2 = sc.nextInt();
		
		int answer = -1;
		answer = num1 % num2;
		System.out.println("정수 '"+num1+"' 과 정수 '"+num2+"' 두 수의 나머지는 '"+answer+"' 입니다.");
	}
}
