package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 숫자 비교하기 - 정답률 92%
public class CompareNumbers {

	public static void main(String[] args) {

		/*
		 * 정수 num1과 num2가 매개변수로 주어집니다. 
		 * 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - 0 ≤ num1 ≤ 10,000
		 * - 0 ≤ num2 ≤ 10,000
		 * 
		 */
		
		System.out.println("[문제 Lv.0 : 숫자 비교하기 (정답률 92%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 num1을 입력하세요 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수 num1을 입력하세요 >> ");
		int num2 = sc.nextInt();
		
		int answer = 0;
		
		if(num1 == num2) {
			answer = 1;
			System.out.println("정수 '"+num1+"' 과 정수 '"+num2+"' 같으므로 '"+answer+"' 입니다.");
		}else {
			answer = -1;
			System.out.println("정수 '"+num1+"' 과 정수 '"+num2+"' 다르므로 '"+answer+"' 입니다.");
		}
		
	}
}
