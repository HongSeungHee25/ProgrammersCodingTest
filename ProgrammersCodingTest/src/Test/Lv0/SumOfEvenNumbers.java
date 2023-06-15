package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 짝수의 합 - 정답률 90%
public class SumOfEvenNumbers {

	public static void main(String[] args) {

		/*
		 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을
		 *  return 하도록 solution 함수를 작성해주세요.
		 *  
		 *  제한 사항
		 *  - 0 < n ≤ 1000
		 */
		
		System.out.println("[문제 Lv.0 : 각도기 (정답률 90%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 n을 입력해주세요 >> ");
		int n = sc.nextInt();
		
		int answer = 0;
		
		for (int i = 0; i <= n; i++) {
			if(i % 2 == 0)
				answer += i;
		}
		System.out.println("정수 '"+n+"' 짝수의 합은 '"+answer+"' 입니다.");
		
		
		
	}
}
